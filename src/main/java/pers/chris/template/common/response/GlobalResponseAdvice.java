package pers.chris.template.common.response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;


/**
 * @Author Chris
 * @Date 2022/3/2 4:07 PM
 * @Description 统一返回值处理
 */

@RestControllerAdvice(basePackages = "pers.chris") // 排除swagger
public class GlobalResponseAdvice implements ResponseBodyAdvice<Object> {

    @Resource
    private ObjectMapper objectMapper;

    /**
     * 开启功能
     */
    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        return true;
    }

    /**
     * 处理返回结果
     */
    @Override
    public Object beforeBodyWrite(Object data, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        // 处理字符串类型数据
        if (data instanceof String) {
            try {
                return objectMapper.writeValueAsString(Response.success(data));
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }
        // 处理已经封装的数据
        else if (data instanceof Response) {
            return data;
        }else if(data instanceof byte[]){
            return data;
        }
        return Response.success(data);
    }
}


package pers.chris.springdemo.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pers.chris.springdemo.common.exception.DemoException;
import pers.chris.springdemo.common.response.Response;


/**
 * @Author Chris
 * @Date 2022/3/10 1:19 PM
 * @Description 统一异常处理
 */
@Slf4j
@RestControllerAdvice
public class ResponseExceptionHandler {

    @ExceptionHandler(DemoException.class)
    public Response handle(DemoException e) {
        String message = e.getMessage();
        log.warn(message);
        return Response.error(message);
    }
}
package pers.chris.template.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import pers.chris.template.Interceptor.InterceptorTemplate;

/**
 * @Author Chris
 * @Date 2022/5/6 11:17 AM
 * @Description Interceptor 配置
 */

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 指定拦截器的指定拦截路径添加
        registry.addInterceptor(new InterceptorTemplate()).addPathPatterns("/**");
    }
}

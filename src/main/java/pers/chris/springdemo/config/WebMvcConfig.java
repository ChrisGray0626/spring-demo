package pers.chris.springdemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Value("${server-resource.url-prefix}")
    private String urlPrefix;
    @Value("${server-resource.attachment-path-prefix}")
    private String pathPrefix;

    //静态资源映射
    @Override
    public void addResourceHandlers(@NonNull ResourceHandlerRegistry registry) {
        try {
            registry.addResourceHandler(urlPrefix + "**").addResourceLocations("file:" + pathPrefix);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

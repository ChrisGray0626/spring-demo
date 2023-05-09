package pers.chris.template.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author Chris
 * @Date 2022/3/10 1:19 PM
 * @Description 静态资源处理配置
 */
@Configuration
public class ResourceHandlerConfig implements WebMvcConfigurer {

    @Value("${resource.url-prefix}")
    private String urlPrefix;
    @Value("${resource.path-prefix}")
    private String pathPrefix;

    @Override
    public void addResourceHandlers(@NonNull ResourceHandlerRegistry registry) {
        try {
            // 静态资源映射
            registry.addResourceHandler(urlPrefix + "**").addResourceLocations("file:" + pathPrefix);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

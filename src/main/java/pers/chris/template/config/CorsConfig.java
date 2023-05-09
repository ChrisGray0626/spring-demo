package pers.chris.template.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @Author Chris
 * @Date 2022/3/10 1:19 PM
 * @Description 跨域配置
 */

@Configuration
public class CorsConfig {
    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        // 放行原始域
        corsConfiguration.addAllowedOriginPattern("*");
        // 放行原始请求头部信息
        corsConfiguration.addAllowedHeader("*");
        // 放行请求方式
        corsConfiguration.addAllowedMethod("*");
        // 发送 Cookie
        corsConfiguration.setAllowCredentials(true);
        // 暴露头部信息
        corsConfiguration.setAllowCredentials(true);

        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsFilter(urlBasedCorsConfigurationSource);
    }
    }
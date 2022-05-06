package pers.chris.template.util;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * @Author Chris
 * @Date 2022/3/17 10:32 AM
 * @Description HTTP 工具类
 */
public class HttpUtil {

    private HttpUtil() {}

    public static String doGet(String url, MultiValueMap<String, String> params) {
        return doGet(url, params, null);
    }

    public static String doGet(String url, MultiValueMap<String, String> params, MultiValueMap<String, String> headers) {
        return request(HttpWrapper.builder().url(url).headers(headers).params(params).method(HttpMethod.GET).build());
    }

    public static String doPost(String url, MultiValueMap<String, String> params) {
        return doPost(url, params, null);
    }

    public static String doPost(String url, MultiValueMap<String, String> params, MultiValueMap<String, String> headers) {
        return request(HttpWrapper.builder().url(url).headers(headers).params(params).method(HttpMethod.POST).build());
    }

    public static String request(HttpWrapper wrapper) {
        // URL
        String url = wrapper.getUrl();
        if (url == null || url.trim().isEmpty()) {
            return null;
        }
        // Header
        MultiValueMap<String, String> headers = wrapper.getHeaders();
        if (headers == null) {
            headers = new LinkedMultiValueMap<>();
        }
        // Param
        MultiValueMap<String, String> params = wrapper.getParams();
        // Method
        HttpMethod method = wrapper.getMethod();
        if (method == null) {
            method = HttpMethod.GET;
        }
        // MediaType
        MediaType mediaType = wrapper.getMediaType();
        if (mediaType == null) {
            mediaType = MediaType.APPLICATION_FORM_URLENCODED;
        }
        // Build
        HttpHeaders httpHeaders = new HttpHeaders(headers);
        httpHeaders.setContentType(mediaType);
        HttpEntity<Object> httpEntity = new HttpEntity<>(params, httpHeaders);
        RestTemplate client = new RestTemplate();
        ResponseEntity<String> response = client.exchange(url, method, httpEntity, String.class);
        return response.getBody();
    }

    /**
     * @Description HTTP 参数包装类
     */
    @Data
    @Builder
    @NoArgsConstructor
    public static class HttpWrapper {

        private String url;
        private MultiValueMap<String, String> headers;
        private MultiValueMap<String, String> params;
        private HttpMethod method;
        private MediaType mediaType;
    }
}

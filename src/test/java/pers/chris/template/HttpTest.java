package pers.chris.template;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import pers.chris.template.util.HttpUtil;

@SpringBootTest
@Slf4j
class HttpTest {

    private static final String URL = "";
    private static final MultiValueMap<String, String> HEADERS = new LinkedMultiValueMap<>();
    private static final MultiValueMap<String, String> PARAMS = new LinkedMultiValueMap<>();
    private static final HttpMethod METHOD = HttpMethod.GET;
    private static final MediaType MEDIA_TYPE = MediaType.APPLICATION_FORM_URLENCODED;

    @Test
    public void test() {
        HttpUtil.HttpWrapper wrapper =
                HttpUtil.HttpWrapper.builder().url(URL).headers(HEADERS).params(PARAMS).method(METHOD)
                        .mediaType(MEDIA_TYPE).build();
        String response = HttpUtil.request(wrapper);
        log.info(response);
    }
}

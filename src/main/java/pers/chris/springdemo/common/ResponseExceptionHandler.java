package pers.chris.springdemo.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pers.chris.springdemo.common.response.Response;

import java.io.IOException;


/**
 * @author CheshireEZ
 */
@Slf4j
@RestControllerAdvice
public class ResponseExceptionHandler {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @ExceptionHandler(Exception.class)
    public Response handle(Exception e) {
        String message = "用户未登录，请先登录！";
        log.warn(message);
        return Response.error(message);
    }
}
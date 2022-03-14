package pers.chris.springdemo.common.response;

import lombok.Data;

@Data
public class Response {
    private String code;
    private String msg;
    private Object data;

    private Response(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Response success() {
        return new Response(ResponseStatusEnum.SUCCESS.getCode(), ResponseStatusEnum.SUCCESS.getMsg(), null);
    }

    public static Response success(Object data) {
        return new Response(ResponseStatusEnum.SUCCESS.getCode(), ResponseStatusEnum.SUCCESS.getMsg(), data);
    }

    public static Response success(Object data, String msg) {
        return new Response(ResponseStatusEnum.SUCCESS.getCode(), msg, data);
    }

    public static Response error() {
        return new Response(ResponseStatusEnum.ERROR.getCode(), ResponseStatusEnum.ERROR.getMsg(), null);
    }

    public static Response error(String msg) {
        return new Response(ResponseStatusEnum.ERROR.getCode(), msg, null);
    }

    public static Response error(String code, String msg) {
        return new Response(code, msg, null);
    }
}
package pers.chris.springdemo.common.exception;

/**
 * @Author Chris
 * @Date 2022/3/15 9:23 AM
 * @Description
 */
public class DemoException extends RuntimeException{

    public DemoException() {
    }

    public DemoException(String message) {
        super(message);
    }
}

package pers.chris.template.common.exception;

/**
 * @Author Chris
 * @Date 2022/3/15 9:23 AM
 * @Description
 */
public class ExceptionTemplate extends RuntimeException{

    public ExceptionTemplate() {
    }

    public ExceptionTemplate(String message) {
        super(message);
    }
}

package com.elder.util.exception;

/**
 * Created by jsf on 2017/5/14.
 */
public class MessageException extends RuntimeException{
    public static final long serialVersionUID=1L ;

    public MessageException() {
    }
    public MessageException(String msg){
        super(msg);
    }
    public String getMsg(){
        return getMessage();
    }
}

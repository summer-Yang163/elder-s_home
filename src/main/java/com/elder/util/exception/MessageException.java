package com.elder.util.exception;


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

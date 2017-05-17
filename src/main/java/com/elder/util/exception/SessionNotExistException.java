package com.elder.util.exception;

/**
 * Created by jsf on 2017/4/5.
 */
public class SessionNotExistException extends RuntimeException {

    public static final long serialVersion = 1l;

    public SessionNotExistException() {
        super();
    }

    public SessionNotExistException(String msg) {
        super(msg);
    }


}

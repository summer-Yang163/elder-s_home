package com.elder.util.exception;


public class SessionNotExistException extends RuntimeException {

    public static final long serialVersion = 1l;

    public SessionNotExistException() {
        super();
    }

    public SessionNotExistException(String msg) {
        super(msg);
    }


}

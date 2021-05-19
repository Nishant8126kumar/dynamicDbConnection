package com.example.DemoPractise.exception;

public class InvalidRequest extends RuntimeException {
    public InvalidRequest(String msg) {
        super(msg);
    }
}

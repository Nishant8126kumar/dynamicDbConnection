package com.example.DemoPractise.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ExceptionMapper {

    @ExceptionHandler(value = InvalidRequest.class)
    public ResponseEntity<?> hanleInvalidRequestException(InvalidRequest invalidRequest) {
        Map<String, Object> response = new HashMap<>();
        response.put("message", invalidRequest.getMessage());
        response.put("status", HttpStatus.BAD_REQUEST);
        response.put("data", null);
        return ResponseEntity.ok(response);
    }
}

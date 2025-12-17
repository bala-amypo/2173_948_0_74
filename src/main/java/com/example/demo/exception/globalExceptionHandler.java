package com.example.demo.exception;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.MethodArgumentNotValidException;


@RestControllerAdvice
public class globalExceptionHandler{

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleFieldError(MethodArgumentNotValidException ex){
        Map<String,S>
    }

}
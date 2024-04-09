package com.javaproject.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ExceptionNotFoundException extends RuntimeException{

    public ExceptionNotFoundException(String message){
        super(message);
    }
}

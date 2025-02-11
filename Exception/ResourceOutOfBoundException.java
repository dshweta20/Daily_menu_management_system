package com.example.demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourceOutOfBoundException extends RuntimeException{

    public ResourceOutOfBoundException(String msg)
    {
        super(msg);
    }
}

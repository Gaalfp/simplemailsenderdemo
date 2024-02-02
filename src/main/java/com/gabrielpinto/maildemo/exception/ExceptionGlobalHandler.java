package com.gabrielpinto.maildemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class ExceptionGlobalHandler {

    @ExceptionHandler(MailSenderException.class)
    public ResponseEntity<ExceptionDetails> handleMailException(MailSenderException e) {
        return new ResponseEntity<>(new ExceptionDetails(HttpStatus.BAD_REQUEST.value(), e.getMessage(), new Date()), HttpStatus.BAD_REQUEST);
    }
}

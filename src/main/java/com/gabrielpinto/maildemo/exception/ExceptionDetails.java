package com.gabrielpinto.maildemo.exception;


import java.util.Date;

public record ExceptionDetails(int status, String message, Date timestamp) {
}

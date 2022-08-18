package com.jarvisluong.chargingmap.exception;

import jakarta.persistence.EntityExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@ControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    Map<String, Object> showCustomMessage(MethodArgumentNotValidException e) {

        var fieldErrorsAsString = e.getFieldErrors()
                .stream()
                .map(fieldError -> String.format("%s: %s", fieldError.getField(), fieldError.getDefaultMessage()));

        Map<String, Object> response = new HashMap<>();
        response.put("type", e.getObjectName());
        response.put("errors", fieldErrorsAsString.collect(Collectors.toList()));

        return response;
    }

    @ExceptionHandler(EntityExistsException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    Map<String, Object> showCustomMessage(EntityExistsException e) {

        Map<String, Object> response = new HashMap<>();
        response.put("error", e.getMessage());

        return response;
    }
}

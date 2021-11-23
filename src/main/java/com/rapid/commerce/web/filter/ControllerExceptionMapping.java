package com.rapid.commerce.web.filter;

import com.rapid.commerce.dto.RestExceptionResult;
import com.rapid.commerce.exception.ConsumerNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionMapping {

       @ExceptionHandler(ConsumerNotFoundException.class)
       public ResponseEntity<RestExceptionResult> handleConsumerNotFound(ConsumerNotFoundException ex){

              ex.printStackTrace();

              return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new RestExceptionResult(ex.getMessage()));
       }
}

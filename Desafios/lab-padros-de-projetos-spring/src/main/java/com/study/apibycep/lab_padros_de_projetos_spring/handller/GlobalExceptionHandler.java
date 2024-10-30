package com.study.apibycep.lab_padros_de_projetos_spring.handller;

import com.study.apibycep.lab_padros_de_projetos_spring.handller.Exceptions.BusinessException;
import com.study.apibycep.lab_padros_de_projetos_spring.handller.Exceptions.ResourceBusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ResourceBusinessException.class)
    public ResponseEntity<?> handleResourceNotFoundException(ResourceBusinessException ex, WebRequest request) {
      ResponseError errorDetails = new ResponseError(request.getDescription(false), ex.getMessage(),HttpStatus.NOT_FOUND.value() );
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<?> handleBusinessException(BusinessException ex, WebRequest request) {
        ResponseError errorDetails = new ResponseError(request.getDescription(false), ex.getMessage(),HttpStatus.BAD_REQUEST.value());
        System.out.println(errorDetails);
        return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleGlobalException(Exception ex, WebRequest request) {
        ResponseError errorDetails = new ResponseError(request.getDescription(false),ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value());
        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
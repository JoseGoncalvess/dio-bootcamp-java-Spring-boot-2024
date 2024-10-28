package desafio_API_Cloud.core.controller.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handlerbussinesException(IllegalArgumentException bussinesException){
        return  new ResponseEntity<>(bussinesException.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);

    }
    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handlernotfouException(NoSuchElementException notfouException){
        return  new ResponseEntity<>("Response ID not Found", HttpStatus.NOT_FOUND);

    }
    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> handlernotfouException(Throwable UnexpectedException){
        return  new ResponseEntity<>("Unexpected Erro server", HttpStatus.INTERNAL_SERVER_ERROR);

    }

}

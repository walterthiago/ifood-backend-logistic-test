package br.com.ifood.ibtlvrptest.ibtlvrptest.handlers.exceptions;

import br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.response.ErrorResponse;
import br.com.ifood.ibtlvrptest.ibtlvrptest.exceptions.ResourceNotFoundException;
import lombok.val;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public final ResponseEntity<ErrorResponse> handlerException(Exception ex, WebRequest request) {
        val errorDetails = new ErrorResponse(
                LocalDateTime.now(),
                ex.getMessage(),
                request.getDescription(false)
        );
        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = ResourceNotFoundException.class)
    public final ResponseEntity<ErrorResponse> handlerResourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
        val errorDetails = new ErrorResponse(
                LocalDateTime.now(),
                ex.getMessage(),
                request.getDescription(false)
        );
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

}

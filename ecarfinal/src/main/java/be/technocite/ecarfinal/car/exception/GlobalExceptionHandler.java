package be.technocite.ecarfinal.car.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @Autowired
    private MessageSource messageSource;

    @ExceptionHandler
    public ResponseEntity<Object> handle(CarConflictException e) {
        String message = messageSource.getMessage(
                "error.conflict.id",
                new Object[]{e.id},
                LocaleContextHolder.getLocale());
        return new ResponseEntity<>(message, HttpStatus.CONFLICT);

    }
}

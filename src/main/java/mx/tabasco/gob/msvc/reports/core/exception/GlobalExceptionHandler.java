package mx.tabasco.gob.msvc.reports.core.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {SimpleReportGlobalException.class})
    public ResponseEntity<Object> handleApiRequestException(SimpleReportGlobalException simpleReportGlobalException){
        ErrorException errorException = new ErrorException(
                simpleReportGlobalException.getMessage(),
                simpleReportGlobalException,
                HttpStatus.BAD_REQUEST,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
        return new ResponseEntity<>(errorException, HttpStatus.BAD_REQUEST);
    }

}

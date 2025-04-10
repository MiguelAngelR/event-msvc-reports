package mx.tabasco.gob.msvc.reports.core.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class ErrorException {

    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;
    private final ZonedDateTime timesTamp;

    public ErrorException(String message, Throwable throwable, HttpStatus httpStatus, ZonedDateTime timesTamp) {
        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
        this.timesTamp = timesTamp;
    }

    public String getMessage() {
        return message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public ZonedDateTime getTimesTamp() {
        return timesTamp;
    }
}

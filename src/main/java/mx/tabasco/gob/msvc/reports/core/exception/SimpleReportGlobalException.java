package mx.tabasco.gob.msvc.reports.core.exception;


public class SimpleReportGlobalException extends RuntimeException{

    public SimpleReportGlobalException(String message) {
        super(message);
    }

    public SimpleReportGlobalException(String message, Throwable cause) {
        super(message, cause);
    }
}

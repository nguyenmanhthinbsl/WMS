package our.thinnm00mxytp3.wms.exceptions;

import org.springframework.http.HttpStatus;

public class CustomHttpException extends BaseException{
     private long serialVersionUID = 1l;

    public CustomHttpException() {
    }

    public CustomHttpException(String message) {
        super(message);
    }

    public CustomHttpException(Throwable cause) {
        super(cause);
    }

    public CustomHttpException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomHttpException(String message, Throwable cause, String code, Object[] values) {
        super(message, cause, code, values);
    }
}

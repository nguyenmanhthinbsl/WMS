package our.thinnm00mxytp3.wms.exceptions;
public abstract class BaseException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private String code;
    private Object[] values;

    private String errorMsg;

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object[] getValues() {
        return this.values;
    }

    public void setValues(Object[] values) {
        this.values = values;
    }

    public BaseException() {
        super();
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(String message, Throwable cause, String code,
                         Object[] values) {
        super(message, cause);
        this.code = code;
        this.values = values;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
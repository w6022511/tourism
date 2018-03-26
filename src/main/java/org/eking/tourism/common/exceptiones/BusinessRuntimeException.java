package org.eking.tourism.common.exceptiones;

/**
 * 业务运行时异常
 */
public class BusinessRuntimeException extends RuntimeException {

    /**
     * 错误编码
     */
    private String errorCode;
    /**
     * 错误描述
     */
    private String errorMessage;

    public BusinessRuntimeException() {

    }

    public BusinessRuntimeException(String message) {
        super(message);
        this.errorMessage = message;
    }


    /**
     * 构造函数
     *
     * @param errorCode
     * @param errorMessage
     */
    public BusinessRuntimeException(String errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
    public BusinessRuntimeException(Integer errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode.toString();
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BusinessRuntimeException{");
        sb.append("errorCode='").append(errorCode).append('\'');
        sb.append(", errorMessage='").append(errorMessage).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }


}

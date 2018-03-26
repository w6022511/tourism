package org.eking.tourism.common.common;

import java.io.Serializable;

public class ServiceResult<T> implements Serializable {

    //private Boolean success;
    private String message;
    private String errorCode;
    private T body;

    public ServiceResult() {
    }

    public static <T> ServiceResult<T> newInstance() {
        return new ServiceResult();
    }

/*    public Boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }*/

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getBody() {
        return this.body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}

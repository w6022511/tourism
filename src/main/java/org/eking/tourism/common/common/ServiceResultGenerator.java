package org.eking.tourism.common.common;

public class ServiceResultGenerator {
    public ServiceResultGenerator() {
    }

    public static <T> ServiceResult<T> genResult(ErrorCode errorCode, T data, String message) {
        ServiceResult<T> result = ServiceResult.newInstance();
        result.setErrorCode(errorCode.getCode());
        result.setBody(data);
        if (message == null) {
            result.setMessage(errorCode.getMessage());
        } else {
            result.setMessage(message);
        }

        return result;
    }

    public static <T> ServiceResult<T> genSuccessResult(T data) {
        return genResult(ErrorCode.SUCCESS, data, (String)null);
    }

    public static ServiceResult genSuccessResult() {
        return genSuccessResult((Object)null);
    }

    public static <T> ServiceResult<T> genErrorResult(ErrorCode errorCode) {
        return genResult(errorCode, (T) null, (String)null);
    }

    public static <T> ServiceResult<T> genErrorResult(String message) {
        return genResult(ErrorCode.ERROR, (T) null, message);
    }
}

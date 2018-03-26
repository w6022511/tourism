package org.eking.tourism.common.handler;

import org.eking.tourism.common.common.ErrorCode;
import org.eking.tourism.common.common.ServiceResult;
import org.eking.tourism.common.common.ServiceResultGenerator;
import org.eking.tourism.common.exceptiones.BusinessRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by qinzanming
 */
@ControllerAdvice
@ResponseBody
public class ControllerAuthExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(ControllerAuthExceptionHandler.class);

    public ControllerAuthExceptionHandler() {
    }

    @ExceptionHandler({BusinessRuntimeException.class})
    @ResponseStatus(HttpStatus.OK)
    public ServiceResult<Object> handleBadRequestParamException(HttpServletRequest req, HttpServletResponse res, BusinessRuntimeException e) {
        logger.error(e.getMessage(), e);
        return ServiceResultGenerator.genResult(ErrorCode.ERROR, null, e.getMessage());
    }

}

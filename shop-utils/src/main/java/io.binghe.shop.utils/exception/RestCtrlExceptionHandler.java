package io.binghe.shop.utils.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import io.binghe.shop.utils.constants.HttpCode;
import io.binghe.shop.utils.resp.Result;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 李嘉豪
 * @version 1.0
 * @description 全局异常处理器
 * @date 2024-03-29 15:17
 */
@Slf4j
@RestControllerAdvice
public class RestCtrlExceptionHandler {

    /**
     * 全局异常处理，统一返回状态码
     */
    @ExceptionHandler(Exception.class)
    public Result<String> handleException(Exception e) {
        log.error("服务器抛出了异常：{}", e);
        return new Result<String>(HttpCode.FAILURE, "执行失败", e.getMessage());
    }
}

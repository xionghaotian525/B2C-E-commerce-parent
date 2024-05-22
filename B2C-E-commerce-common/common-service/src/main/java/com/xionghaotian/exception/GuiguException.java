package com.xionghaotian.exception;

import com.xionghaotian.vo.common.ResultCodeEnum;
import lombok.Data;

/**
 * @ClassName GuiguException
 * @Description 自定义异常
 * @Author XiongHaoTian
 * @Date 2024年05月22日 15:15
 * @Version 1.0
 */

@Data
public class GuiguException extends RuntimeException {
    private Integer code;
    private String message;

    private ResultCodeEnum resultCodeEnum;

    public GuiguException(ResultCodeEnum resultCodeEnum) {
        this.resultCodeEnum = resultCodeEnum;
        this.code = resultCodeEnum.getCode();
        this.message = resultCodeEnum.getMessage();
    }
}

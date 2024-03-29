package io.binghe.shop.utils.resp;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 李嘉豪
 * @version 1.0
 * @date 2024-03-29 15:30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1497405107265595284L;

    /**
     * 状态码
     */
    private Integer code;
    /**
     * 状态描述
     */
    private String codeMsg;
    /**
     * 返回的数据
     */
    private T data;
}

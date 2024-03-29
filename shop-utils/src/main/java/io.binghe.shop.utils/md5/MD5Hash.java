package io.binghe.shop.utils.md5;

import org.springframework.util.DigestUtils;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 李嘉豪
 * @version 1.0
 * @description 提供通用的MD5加密算法
 * @date 2024-03-29 16:47
 */
@Slf4j
public class MD5Hash {

    /**
     * MD5加密
     *
     * @param text 待加密字符串
     * @return 16进制加密字符串
     * @explain springboot自带MD5加密
     */
    @SneakyThrows(Exception.class)
    public static String encryptToMD5(String text) {
        log.debug("MD5待加密字符串：{}" + text);
        String md5 = DigestUtils.md5DigestAsHex(text.getBytes("utf-8"));
        log.debug("MD5加密结果：{}", md5);
        return md5;
    }

}

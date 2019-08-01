package com.thtf.security.core.validate.code;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * ========================
 * 验证码
 * Created with IntelliJ IDEA.
 * User：pyy
 * Date：2019/8/1 10:56
 * Version: v1.0
 * ========================
 */

@Setter
@Getter
public abstract class ValidateCode {
    /** 验证码 **/
    private String code;

    /** 过期时间 **/
    private LocalDateTime expireTime;

    public ValidateCode(String code, int expireIn) {
        this.code = code;
        this.expireTime = LocalDateTime.now().plusSeconds(expireIn);
    }

    public ValidateCode(String code, LocalDateTime expireTime) {
        this.code = code;
        this.expireTime = expireTime;
    }

    public boolean isExpried() {
        return LocalDateTime.now().isAfter(expireTime);
    }
}

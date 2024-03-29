package com.thtf.security.core.validate.code;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * ========================
 * 校验码处理器，封装不同校验码的处理逻辑
 * Created with IntelliJ IDEA.
 * User：pyy
 * Date：2019/8/1 11:05
 * Version: v1.0
 * ========================
 */
public interface ValidateCodeProcessor {

    /**
     * 创建校验码
     *
     * @param request
     * @throws Exception
     */
    void create(ServletWebRequest request) throws Exception;

    /**
     * 校验验证码
     *
     * @param servletWebRequest
     * @throws Exception
     */
    void validate(ServletWebRequest servletWebRequest);
}

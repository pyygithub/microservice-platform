package com.thtf.security.core.support;

import lombok.Data;

/**
 * ========================
 * 三方认证用户信息
 * Created with IntelliJ IDEA.
 * User：pyy
 * Date：2019/8/2 16:48
 * Version: v1.0
 * ========================
 */
@Data
public class SocialUserInfo {
    private String providerId;

    private String providerUserId; //openId

    private String nickname;

    private String headimg;
}

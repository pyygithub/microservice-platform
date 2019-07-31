package com.thtf.security.core.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：pyy
 * Date：2019/7/31 16:00
 * Version: v1.0
 * ========================
 */
@Setter
@Getter
@ConfigurationProperties(prefix = "security")
public class SecurityProperties {
    private BrowserProperties browser = new BrowserProperties();
}

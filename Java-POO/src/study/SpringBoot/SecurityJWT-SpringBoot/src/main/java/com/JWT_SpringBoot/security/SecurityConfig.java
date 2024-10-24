package com.JWT_SpringBoot.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@ConfigurationProperties(prefix = "security.config")
public class SecurityConfig {

    private String prefix;
    private String key;
    private long expiration;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public long getExpiration() {
        return expiration;
    }

    public void setExpiration(long expiration) {
        this.expiration = expiration;
    }

    @Override
    public String toString() {
        return "SecurityConfig{" +
                "prefix='" + prefix + '\'' +
                ", key='" + key + '\'' +
                ", expiration=" + expiration +
                '}';
    }
}
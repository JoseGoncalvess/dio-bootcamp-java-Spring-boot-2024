package com.JWT_SpringBoot.security;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class JWTObjetct {
    protected   String subject;
    protected Date IssuedAt;
    protected  Date expiration;
    protected List<String> roles;

    public  void setRoles(String ... roles){
        this.roles = Arrays.asList(roles);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getIssuedAt() {
        return IssuedAt;
    }

    public void setIssuedAt(Date IssuedAt) {
        this.IssuedAt = IssuedAt;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }


}

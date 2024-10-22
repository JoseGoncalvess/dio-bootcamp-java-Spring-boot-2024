package com.StudyAPI.handller;

public class BusinessException extends RuntimeException {
    public BusinessException(String msg) {
        super(msg);
    }
    public BusinessException(String mensagem, Object ... params) {
        super(String.format(mensagem, params));
    }
}

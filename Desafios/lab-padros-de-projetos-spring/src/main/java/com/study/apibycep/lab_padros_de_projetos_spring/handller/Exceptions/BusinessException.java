package com.study.apibycep.lab_padros_de_projetos_spring.handller.Exceptions;

public class BusinessException extends RuntimeException {
    public BusinessException(String msg) {
        super(msg);
    }
}

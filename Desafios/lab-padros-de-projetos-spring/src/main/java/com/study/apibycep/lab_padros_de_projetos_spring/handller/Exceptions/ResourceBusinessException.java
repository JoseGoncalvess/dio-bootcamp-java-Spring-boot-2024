package com.study.apibycep.lab_padros_de_projetos_spring.handller.Exceptions;

public class ResourceBusinessException extends  RuntimeException {
    public ResourceBusinessException(String message) {
        super(message);
    }
}

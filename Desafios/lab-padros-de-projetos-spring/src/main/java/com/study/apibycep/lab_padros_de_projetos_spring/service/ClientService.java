package com.study.apibycep.lab_padros_de_projetos_spring.service;

import com.study.apibycep.lab_padros_de_projetos_spring.models.Cliente;
import org.apache.juli.logging.Log;

public interface ClientService {
    Iterable<Cliente> getall();
    Cliente getById(Long id);
    void setClient(Cliente client);
    void patchClient(long id, Cliente cliente);
    Cliente deleteById(Long id);
}

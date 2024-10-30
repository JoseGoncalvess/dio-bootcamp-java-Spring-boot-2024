package com.study.apibycep.lab_padros_de_projetos_spring.service;

import com.study.apibycep.lab_padros_de_projetos_spring.models.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "viaceo",url = "https://viacep.com.br/ws")
public interface ViaCepService {
    @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")
    Endereco getCep(@PathVariable("cep") String cep);

}

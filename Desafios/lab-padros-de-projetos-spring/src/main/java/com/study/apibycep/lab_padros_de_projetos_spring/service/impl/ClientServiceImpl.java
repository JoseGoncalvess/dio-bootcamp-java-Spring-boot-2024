package com.study.apibycep.lab_padros_de_projetos_spring.service.impl;

import com.study.apibycep.lab_padros_de_projetos_spring.handller.Exceptions.BusinessException;
import com.study.apibycep.lab_padros_de_projetos_spring.handller.Exceptions.ResourceBusinessException;
import com.study.apibycep.lab_padros_de_projetos_spring.models.Cliente;
import com.study.apibycep.lab_padros_de_projetos_spring.models.Endereco;
import com.study.apibycep.lab_padros_de_projetos_spring.repository.ClienteRepository;
import com.study.apibycep.lab_padros_de_projetos_spring.repository.EnderecoRepository;
import com.study.apibycep.lab_padros_de_projetos_spring.service.ClientService;
import com.study.apibycep.lab_padros_de_projetos_spring.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientServiceImpl  implements ClientService {

    // Singleton: Injetar os componentes do Spring com @Autowired.
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    // Strategy: Implementar os métodos definidos na interface.
    // Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

    @Override
    public Iterable<Cliente> getall() {
        // Buscar todos os Clientes.
        return clienteRepository.findAll();
    }

    @Override
    public Cliente getById(Long id) {
        // Buscar Cliente por ID.
        Optional<Cliente> cliente = clienteRepository.findById(id);

        if (cliente.isPresent() && cliente != null){
            return cliente.get();
        }else {
            throw new BusinessException("Clinte Não encontrado");
        }
    }

    @Override
    public void setClient(Cliente client) {
        putClientfull(client);
    }

    @Override
    public void patchClient(long id, Cliente cliente) {
        // Buscar Cliente por ID, caso exista:
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if (clienteBd.isPresent()) {
            putClientfull(cliente);
        }else {
            throw new ResourceBusinessException("Clinte Não encontrado");
        }
    }

    @Override
    public Cliente deleteById(Long id) {
        // Deletar Cliente por ID.
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if (cliente.isPresent()){
            clienteRepository.deleteById(id);
            return  cliente.get();
        }else {
            throw new ResourceBusinessException("Clinte Não encontrado");
        }

    }

    private void putClientfull(Cliente cliente) {
        // Verificar se o Endereco do Cliente já existe (pelo CEP).
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            // Caso não exista, integrar com o ViaCEP e persistir o retorno.
            Endereco novoEndereco = viaCepService.getCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        // Inserir Cliente, vinculando o Endereco (novo ou existente).
        clienteRepository.save(cliente);
    }


}
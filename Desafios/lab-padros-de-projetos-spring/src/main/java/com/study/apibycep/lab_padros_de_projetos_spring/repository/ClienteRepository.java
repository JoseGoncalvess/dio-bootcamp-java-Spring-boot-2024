package com.study.apibycep.lab_padros_de_projetos_spring.repository;

import com.study.apibycep.lab_padros_de_projetos_spring.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}

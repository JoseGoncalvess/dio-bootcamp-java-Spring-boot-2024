package com.SpringDataJPA.FirstSpringJPA.repository;

import com.SpringDataJPA.FirstSpringJPA.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

    // TODO QUERY METHOD O PRIPRIO JPA INTERPRETA E CRIA NOSSA QUERY BASEADA NA ESTRUTURA DO NOME DA FUNCTION
    List<User> findByNameContaining(String name);

    @Query("SELECT u FROM User u WHERE u.name LIKE %:name%") //TODO CONSIGO POR MEIO DESSA ANOTATION CRAIR QUERYS MASI ROBUSTAS
    List<User> filterByName(@Param("name") String name);
}

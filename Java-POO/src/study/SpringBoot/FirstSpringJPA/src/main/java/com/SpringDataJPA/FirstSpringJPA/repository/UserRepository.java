package com.SpringDataJPA.FirstSpringJPA.repository;

import com.SpringDataJPA.FirstSpringJPA.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}

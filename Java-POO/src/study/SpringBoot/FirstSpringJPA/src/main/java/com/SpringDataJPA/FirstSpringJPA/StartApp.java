package com.SpringDataJPA.FirstSpringJPA;

import com.SpringDataJPA.FirstSpringJPA.model.User;
import com.SpringDataJPA.FirstSpringJPA.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Maria");
        user.setUsername("jornalist");
        user.setPassword("sport");
        repository.save(user);

repository.findAll().stream().forEach(u -> System.out.println(u));
    }
}

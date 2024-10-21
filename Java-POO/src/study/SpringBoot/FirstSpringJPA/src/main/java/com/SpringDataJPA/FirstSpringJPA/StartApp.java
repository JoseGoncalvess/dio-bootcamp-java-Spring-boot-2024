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
        repository.filterByName("Carol").stream().forEach(u -> System.out.println(u));

//        User user = new User();
//        user.setName("Gui");
//        user.setUsername("professor");
//        user.setPassword("rox");
//        repository.save(user);


    }
}

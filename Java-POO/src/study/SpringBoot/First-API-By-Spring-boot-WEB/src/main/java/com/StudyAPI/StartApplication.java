package com.StudyAPI;

import com.StudyAPI.model.User;
import com.StudyAPI.repository.UserRepositoryJPA;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class StartApplication  implements CommandLineRunner {
    @Autowired
    private UserRepositoryJPA repositoryJPA;

    @Transactional
    @Override
    public void run(String... args) throws Exception {

        User user = repositoryJPA.findByUserName("admin");
        if (user == null){
            user = new User("ADMIN","admin","master");
            user.getRoles().add("MANAGERS");
            repositoryJPA.save(user);
        }
        user = repositoryJPA.findByUserName("user");
        if (user == null){
            user = new User("USER","user","user123");
            user.getRoles().add("USERS");
            repositoryJPA.save(user);
        }


    }
}

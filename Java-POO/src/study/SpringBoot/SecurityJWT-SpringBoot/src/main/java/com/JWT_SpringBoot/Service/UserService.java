package com.JWT_SpringBoot.Service;

import com.JWT_SpringBoot.Models.User;
import com.JWT_SpringBoot.Repository.USerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private USerRepository uSerRepository;

    @Autowired
    private PasswordEncoder encoder;

    public  void createUser(User user){
        String pass = user.getPassword();
        // ENCODER ANTES DE SALVAR
        user.setPassword(encoder.encode(pass));
        uSerRepository.save(user);
    }

}

package com.JWT_SpringBoot.Controller;

import com.JWT_SpringBoot.Dto.LoginDTO;
import com.JWT_SpringBoot.Dto.SessaoDTO;
import com.JWT_SpringBoot.Models.User;
import com.JWT_SpringBoot.Repository.USerRepository;
import com.JWT_SpringBoot.security.JWTCreator;
import com.JWT_SpringBoot.security.JWTObjetct;
import com.JWT_SpringBoot.security.SecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private PasswordEncoder encoder;
    @Autowired
    private SecurityConfig securityConfig;
    @Autowired
    private USerRepository repository;

    @PostMapping
    public SessaoDTO logar(@RequestBody LoginDTO login){
        User user = repository.findByUserName(login.getName());
        if(user!=null) {
            boolean passwordOk =  encoder.matches(login.getPassword(), user.getPassword());
            if (!passwordOk) {
                throw new RuntimeException("Senha inválida para o login: " + login.getName());
            }
            //Estamos enviando um objeto Sessão para retornar mais informações do usuário
            SessaoDTO sessao = new SessaoDTO();
            sessao.setLogin(user.getUsername());

            JWTObjetct jwtObject = new JWTObjetct();
            jwtObject.setIssuedAt(new Date(System.currentTimeMillis()));
            jwtObject.setExpiration((new Date(System.currentTimeMillis() + securityConfig.getExpiration())));
            jwtObject.setRoles(user.getRoles());
            sessao.setToken(JWTCreator.create(securityConfig.getPrefix(), securityConfig.getKey(), jwtObject));
            return sessao;
        }else {
            throw new RuntimeException("Erro ao tentar fazer login");
        }
    }
}

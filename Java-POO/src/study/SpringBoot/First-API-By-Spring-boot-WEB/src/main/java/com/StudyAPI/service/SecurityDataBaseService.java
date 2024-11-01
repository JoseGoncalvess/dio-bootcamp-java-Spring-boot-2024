package com.StudyAPI.service;


import com.StudyAPI.model.User;
import com.StudyAPI.repository.UserRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;


@Service
public class SecurityDataBaseService implements UserDetailsService {
    @Autowired
    private UserRepositoryJPA repositoryJPA;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User userEntity = repositoryJPA.findByUserName(username);
        if (userEntity == null){
            throw  new UsernameNotFoundException(username);
        }
        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        userEntity.getRoles().forEach(role -> {
            authorities.add(new SimpleGrantedAuthority("ROLE_"+role));
        });
        UserDetails user = new org.springframework.security.core.userdetails.User(userEntity.getUsername(),userEntity.getPassword(), authorities);
        return  user;
    }
}

package com.StudyAPI.repository;

import com.StudyAPI.handller.BusinessException;
import com.StudyAPI.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UseRepository {

    public boolean save(Usuario user){
        if (user.getLogin() == null || user.getLogin().trim().isEmpty()) {
            return false;
        } else {
            if (user.getId() == null) {
                System.out.println("SAVE - RECEBENDO USUÁRIO DA CAMADA REPOSITORIO");
                System.out.println(user);
            } else {
                System.out.println("UPDATE - RECEBENDO USUÁRIO DA CAMADA REPOSITORIO");
                System.out.println(user);
            }
            return true;
 }
    }

    public  boolean deletByID(Integer id){
        if (id == 1){
            return  false;
        }
        System.out.println("DELETE/id - RECENDO UMA ID PARA DELETAR UM UDUARIO EXCLUSIVO");
        System.out.println(id);
        return true;

    }
    public List<Usuario> findAll(){
        System.out.println("LIST - LISTANDO USUARIOS REGISTRADO NO SISTEMA");
        List<Usuario> allusers = new ArrayList<>();
        allusers.add(new Usuario("Gonçalves", "user","124"));
        allusers.add(new Usuario("Anny", "bts","345"));
        return  allusers;
    }

    public  Usuario findByID(Integer id){
        System.out.println("GET/id - RECENDO UMA ID PARA BUSCAR UM UDUARIO EXCLUSIVO");
        return new Usuario("Gonçalves", "user","124");
    }
    public  Usuario atualizarByID(Integer id, Usuario user){
        System.out.println("PATCH/id - RECEDO UMA ID PARA ATUALIZAR UM UDUARIO EXCLUSIVO");
        return new Usuario(user.getName(), user.getLogin(), user.getPassword());
    }

    public  Usuario finsByName(String name){
        System.out.println("GET/name - RECENDO UMA NAME PARA BUSCAR UM UDUARIO EXCLUSIVO");
        return new Usuario(name, "user","124");
    }
}

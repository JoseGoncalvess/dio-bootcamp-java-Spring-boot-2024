package com.StudyAPI.controller;

import com.StudyAPI.handller.BusinessException;
import com.StudyAPI.repository.UseRepository;
import com.StudyAPI.model.Usuario;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "user-api")
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UseRepository repository;


    @Operation(summary = "Listar Usuarios", description = "Retorna uma Lista com todos os usuarios")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Retornaou a lista com sucesso"),
            @ApiResponse(responseCode = "400", description = "Requisição inválida", content = @Content),
            @ApiResponse(responseCode = "500", description = "Erro no servidor", content = @Content)
    })
    @GetMapping()
    public List<Usuario> getUsers(){
      return repository.findAll();
    }


    @Operation(summary = "Retorna uma usuario basedo no ID", description = "Retorna um  usuarios")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Retornaou o Usuario com sucesso"),
            @ApiResponse(responseCode = "400", description = "Requisição inválida", content = @Content),
            @ApiResponse(responseCode = "500", description = "Erro no servidor", content = @Content)
    })
    @GetMapping("/id/{id}")
    public Usuario getUserById(@PathVariable("id") Integer Id){
       return repository.findByID(Id);
    }

    @Operation(summary = "Retorna uma usuario basedo no name", description = "Retorna um  usuarios")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Retornaou o Usuario com sucesso"),
            @ApiResponse(responseCode = "400", description = "Requisição inválida", content = @Content),
            @ApiResponse(responseCode = "500", description = "Erro no servidor", content = @Content)
    })
    @GetMapping("/name/{name}")
    public Usuario getUserByName(@PathParam("name") String name){
        return repository.finsByName(name);
    }


    @Operation(summary = "Deleta uma usuario basedo no ID", description = "Deleta um  usuarios")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Deletou um  Usuario com sucesso"),
            @ApiResponse(responseCode = "400", description = "Requisição inválida", content = @Content),
            @ApiResponse(responseCode = "500", description = "Erro no servidor", content = @Content)
    })
    @DeleteMapping("/{id}")
    public void deletUserByName(@PathVariable("id") Integer id){
        System.out.println(id);
        if (!repository.deletByID(id))
            throw new BusinessException("Id não pertence a nenhum  usuario");
       ;
    }

    @Operation(summary = "Salva uma usuario", description = "Salve um  usuarios ue foi passado no body")
    @PostMapping()
    public void saveUser(@RequestBody Usuario user){
        boolean response = repository.save(user);
        if (!response) {
            throw new BusinessException("Campo login é Obrigatório");
        }
    }

    @Operation(summary = "Atualiza um usuario basedo no ID", description = "Atualiza  um  usuarios baseado no id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Atualizou o Usuario com sucesso"),
            @ApiResponse(responseCode = "400", description = "Requisição inválida", content = @Content),
            @ApiResponse(responseCode = "409", description = "Erro no servidor", content = @Content),
            @ApiResponse(responseCode = "500", description = "Erro no servidor", content = @Content)
    })
    @PatchMapping("/{id}")
    public void atualizaUser(@RequestBody Usuario user, Integer id){
      Usuario userDb =  repository.atualizarByID(id,user);
      if (userDb.getName().isEmpty() )
          throw new BusinessException("Nome Obrigatorio");

    }
}

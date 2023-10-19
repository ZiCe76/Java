package com.example.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.springboot.models.Usuario;
import com.example.springboot.repository.UserRepository;

import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repository;
    @GetMapping
    public List<Usuario> list(){
        return repository.findAll();
    }
    @PostMapping
    public void save(@RequestBody Usuario user){
        repository.save(user);
    }
    @PutMapping
    public void update(@RequestBody Usuario user){
        repository.save(user);
    }
    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("/id") Integer id){
        repository.deleteById(id);
    }
}

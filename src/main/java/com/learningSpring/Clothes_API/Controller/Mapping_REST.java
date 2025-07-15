package com.learningSpring.Clothes_API.Controller;

import com.learningSpring.Clothes_API.DAO.clothes_CRUD;
import com.learningSpring.Clothes_API.entity.clothes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class Mapping_REST {

    @Autowired
    public clothes_CRUD repo;

    @GetMapping("/clothes")
    public Iterable<clothes> clothes(){
        Iterable<clothes> x =  repo.findAll();
        System.out.println(x);
        return x;
    }

    @PostMapping("/clothes")
    public void createClothe(@RequestBody clothes arg){
        repo.create(arg);
    }

    @GetMapping("/clothes/{id}")
    public clothes findbyId(@PathVariable Long id){
        return repo.findByID(id);
    }

    @DeleteMapping("/clothes")
    public Optional<clothes> delete(@RequestParam Long id){

        return null;
    }


}


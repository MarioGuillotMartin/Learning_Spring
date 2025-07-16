package com.learningSpring.Clothes_API.Controller;

import com.learningSpring.Clothes_API.DAO.clothes_CRUD;
import com.learningSpring.Clothes_API.entity.clothes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Mapping_REST {

    @Autowired
    public clothes_CRUD repo;

    @GetMapping("/clothes")
    public List<clothes> clothes(@RequestParam(required = false)String nombre){
        if(nombre!=null && !nombre.isEmpty()){
            return repo.findByName(nombre);
        }
        return  repo.findAll();
    }

    @PostMapping("/clothes")
    public void createClothe(@RequestBody clothes arg){
        repo.create(arg);
    }

    @GetMapping("/clothes/{id}")
    public clothes findbyId(@PathVariable Long id){
        return repo.findByID(id);
    }

    @DeleteMapping("/clothes/{id}")
    public boolean deleteClotheId(@PathVariable Long id){
        return repo.deleteClothe(id);
    }

    @PutMapping("/clothes")
    public boolean updateClothe(@RequestBody clothes arg){
       return repo.updateClothes(arg.getId(),arg);
    }

}


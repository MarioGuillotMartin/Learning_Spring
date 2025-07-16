package com.learningSpring.Clothes_API.DAO;

import com.learningSpring.Clothes_API.entity.clothes;

import java.util.List;
import java.util.Optional;


public interface clothes_CRUD {
    public List<clothes> findAll();
    public void create(clothes args);
    public clothes findByID(Long id);
    public List<clothes> findByName(String name);
    public boolean deleteClothe(Long id);
    public boolean updateClothes(Long id,clothes arg);
}

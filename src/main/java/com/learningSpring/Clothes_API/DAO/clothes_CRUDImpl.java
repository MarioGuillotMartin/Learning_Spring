package com.learningSpring.Clothes_API.DAO;

import com.learningSpring.Clothes_API.Mappers.clothesRowMapper;
import com.learningSpring.Clothes_API.entity.clothes;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
public class clothes_CRUDImpl implements clothes_CRUD{

    private final JdbcTemplate jdbcTemplate;
    private final clothesRowMapper mapper;

    public clothes_CRUDImpl(JdbcTemplate jdbcTemplate,  clothesRowMapper mapper){
        this.jdbcTemplate = jdbcTemplate;
        this.mapper = mapper;
    }

    @Override
    public List<clothes> findAll(){
        String sql = "select * from productos_ropa";
        return  jdbcTemplate.query(sql,mapper);
    }

    @Override
    public void create(clothes args) {
        String sql = "insert into productos_ropa (nombre, talla, precio, stock) values (?, ?, ?, ?)";
        jdbcTemplate.update(sql,args.getNombre(),args.getTalla(),args.getPrecio(),args.getStock());
    }

    @Override
    public clothes findByID(Long id) {
        String sql = "select * from productos_ropa where id = ?";
        return  jdbcTemplate.queryForObject(sql,mapper,id);
    }

    @Override
    public List<clothes> findByName(String name) {
        String sql = "select * from productos_ropa where nombre = ?";
        return jdbcTemplate.query(sql,mapper,name);
    }

    @Override
    public boolean deleteClothe(Long id) {
        String sql = "delete from productos_ropa where id = ?";
        return jdbcTemplate.update(sql,id) == 1;
    }

    @Override
    public boolean updateClothes(Long id,clothes arg) {
        String sql = "update from productos_ropa where id = ?";
        return jdbcTemplate.update(sql,id) == 1;
    }


}

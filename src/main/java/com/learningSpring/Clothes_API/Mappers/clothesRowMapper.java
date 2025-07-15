package com.learningSpring.Clothes_API.Mappers;

import com.learningSpring.Clothes_API.entity.clothes;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class clothesRowMapper implements RowMapper<clothes> {

    @Override
    public clothes mapRow(ResultSet rs, int rowNum) throws SQLException {
        clothes a = new clothes();
        a.setId(rs.getLong("id"));
        a.setNombre(rs.getString("nombre"));
        a.setStock(rs.getInt("stock"));
        a.setTalla(rs.getString("talla"));
        a.setPrecio(rs.getDouble("precio"));

        return a;
    }



}

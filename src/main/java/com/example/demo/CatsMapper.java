//package com.example.demo;
//
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Component;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//
//@Component
//public class CatsMapper implements RowMapper<CatsModel> {
//
//    @Override
//    public CatsModel mapRow(ResultSet rs, int rowNum) throws SQLException { // извлечение по имени колонки
//        return new CatsModel(
//                rs.getInt("id"),
//                rs.getString("name"),
//                rs.getDate("birthday"),
//                rs.getString("breed"),
//                rs.getString("color"),
//                rs.getInt("owner"),
//                rs.getArray("listFriendCats")
//        );
//    }
//}

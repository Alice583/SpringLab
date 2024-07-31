//package com.example.demo;
//
//import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import java.util.Optional;
//
//@Repository // обеспечивает маппинг ошибок, специфичных для СУБД в стандартные исключения JDBC
//public class CatsRepository {
//    // запрос сделан через :, чтобы минимизировать возможность "хакерских" запросов
//    private static final String SQL_GET_CAT_BY_ID =
//            "select id, name, birthday, breed, color, owner, listfriendcats from cats where id = :id";
//    private final CatsMapper catsMapper;
//    private final NamedParameterJdbcTemplate jdbcTemplate;
//
//    public CatsRepository(
//            CatsMapper catsMapper,
//            NamedParameterJdbcTemplate jdbcTemplate
//    ) {
//        this.catsMapper = catsMapper; // для преобразования sql запроса из БД в объект
//        this.jdbcTemplate = jdbcTemplate; // стандартный компонент, предоставляющий методы для взаимодействия с БД
//    }
//
//    public Optional<CatsModel> getCatById(int id) {
//        var params = new MapSqlParameterSource();
//        params.addValue("id", id); // подстановка id в запрос с помощью класса
//        return jdbcTemplate.query( SQL_GET_CAT_BY_ID, params, catsMapper).stream().findFirst(); // на выходе: список объектов типа CatsModel
//    }
//}

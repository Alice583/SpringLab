//package com.example.demo;
//
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Service;
//
//@Primary // реализация по умолчанию
//@Service
//public class CatsService {
//    private final CatsRepository catsRepository;
//
//    public CatsService(CatsRepository catsRepository) {
//        this.catsRepository = catsRepository;
//    }
//    public CatsModel getCat(int catID) {
//        return catsRepository.getCatById(catID).orElseThrow(() -> new CatsNotFoundException(catID));
//    }
//}

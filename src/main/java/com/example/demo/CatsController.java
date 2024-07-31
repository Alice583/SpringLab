//package com.example.demo;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping(value = "/cats")
//public class    CatsController {
//
//    private final CatsService catsService;
//
//    public CatsController(CatsService catsService) {
//        this.catsService = catsService;
//    }
//
//    @GetMapping(value = "/{catID:\\d+}")
//    public CatsModel getCat(@PathVariable int catID) {
//        return catsService.getCat(catID);
//    }
//}

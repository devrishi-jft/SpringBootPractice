package com.dev.practice2.controller;

import com.dev.practice2.dao.AlienRepo;
import com.dev.practice2.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlienController {
    @Autowired
    AlienRepo repo;
    @RequestMapping("/")
    public List<Alien> home(){
        //repo.save(alien);
        System.out.println("hello");
        return List.of(
                new Alien(
                    1,"navin"
                )
        );
    }

}

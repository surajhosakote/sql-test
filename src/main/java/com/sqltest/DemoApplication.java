package com.sqltest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class DemoApplication {
    @Autowired
    private FamilyRepository familyRepository;

    @GetMapping("/Family")
    public List<Family> getFamily(Family family) {
        return familyRepository.findAll();
    }

    @PostMapping("/add")
    public Family addFamily(@RequestBody Family family) {
        return familyRepository.save(family);
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class MainController {
    @Autowired
    PersonRepository personRepository;
    @GetMapping("/")
    public Iterable<PersonEntity> getAllStudent() {
        return personRepository.findAll();
    }

    @GetMapping("/post")
    public PersonEntity postRandomPerson() {
        PersonEntity personEntity = new PersonEntity("Alex",UUID.randomUUID().toString());
        return personRepository.save(personEntity);
    }
}

package com.project.dog.controller;

import com.project.dog.domain.Dog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (path = "/api/v1/dog")
public class DogController {

    @GetMapping
    public List<Dog> getDogs() {
        return List.of(new Dog(
                "Pepe",
                "Mestizo",
                "masculino",
                true,
                "Meloxicam diario",
                true,
                null,
                "Cali",
                "8 meses aprox")
        );

    }
}

package com.project.dog.controller;

import com.project.dog.domain.Dog;
import com.project.dog.service.DogServiceImp;
import com.project.dog.service.interfaces.IDogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (path = "/api/v1/dog")
public class DogController {

    @Autowired
    private IDogService dogService;

    @GetMapping
    public List<Dog> getDogs() {
        return dogService.getAll();
    }

    @PostMapping
    public void registerNewDog (@RequestBody Dog dog){
        dogService.addNewDog(dog);
    }
}

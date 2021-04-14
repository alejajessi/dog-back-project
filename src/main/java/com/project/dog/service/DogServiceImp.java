package com.project.dog.service;

import com.project.dog.domain.Dog;
import com.project.dog.service.interfaces.IDogService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DogServiceImp implements IDogService {

    public List<Dog> getAll() {
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

    @Override
    public Dog get(String name) {
        return null;
    }

    @Override
    public Dog save(Dog dog) {
        return null;
    }

    @Override
    public Dog replace(String name, Dog animal) {
        return null;
    }

    @Override
    public void delete(String name) {

    }

}

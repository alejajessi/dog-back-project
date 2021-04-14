package com.project.dog.service.interfaces;

import com.project.dog.domain.Dog;

import java.util.List;

public interface IDogService {

    List<Dog> getAll();
    Dog get(String name);
    Dog save(Dog dog);
    Dog replace(String name, Dog animal);
    void delete(String name);

}

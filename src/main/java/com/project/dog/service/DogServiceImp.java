package com.project.dog.service;

import com.project.dog.domain.Dog;
import com.project.dog.repository.IDogRepository;
import com.project.dog.service.interfaces.IDogService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DogServiceImp implements IDogService {

    private final IDogRepository dogRepository;

    public DogServiceImp(IDogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    public List<Dog> getAll() {
        return dogRepository.findAll();
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

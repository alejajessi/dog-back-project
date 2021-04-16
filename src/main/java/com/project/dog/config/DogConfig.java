package com.project.dog.config;

import com.project.dog.domain.Dog;
import com.project.dog.repository.IDogRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DogConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            IDogRepository repository){
        return args -> {
            Dog pepe = new Dog(
                    "pepe",
                    "mestizo",
                    "masculino",
                    true,
                    "inyectables diarios",
                    false,
                    null,
                    "medellin",
                    "2 meses"
            );
            Dog carlos = new Dog(
                    "carlos",
                    "mestizo",
                    "masculino",
                    true,
                    "inyectables diarios",
                    false,
                    null,
                    "medellin",
                    "2 meses"
            );
            Dog kayla = new Dog(
                    "kayla",
                    "mestizo",
                    "masculino",
                    true,
                    "inyectables diarios",
                    false,
                    null,
                    "medellin",
                    "2 meses"
            );

            repository.saveAll(List.of(kayla, pepe, carlos));
        };
    }


}

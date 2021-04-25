package com.project.dog.domain;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public @Data
class Dog {

    @Id
    @SequenceGenerator(
            name = "dog_sequence",
            sequenceName = "dog_sequence",
            allocationSize = 1
    )
    @GeneratedValue (
            strategy = GenerationType.SEQUENCE,
            generator = "dog_sequence"
    )
    private long id;
    private String name;
    private String breed;
    private String gender;
    private boolean isTreatment;
    private String treatment;
    private boolean isVaccinated;
    private String[] vaccines;
    private String city;
    @Transient
    private String age;

    public Dog(){}

    public Dog( String name, String breed, String gender, boolean isTreatment, String treatment, boolean isVaccinated, String[] vaccines, String city, String age){

        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.isTreatment = isTreatment;
        this.treatment = treatment;
        this.isVaccinated = isVaccinated;
        this.vaccines = vaccines;
        this.city = city;
        this.age = age;
    }
}

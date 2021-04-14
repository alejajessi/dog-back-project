package com.project.dog.domain;

public class Dog {

    private String name;
    private String breed;
    private String gender;
    private boolean isTreatment;
    private String treatment;
    private boolean isVaccinated;
    private String[] vaccines;
    private String city;
    private String age;

    public Dog(String name, String breed, String gender, boolean isTreatment, String treatment, boolean isVaccinated, String[] vaccines, String city, String age){

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

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getGender() {
        return gender;
    }

    public boolean isTreatment() {
        return isTreatment;
    }

    public String getTreatment() {
        return treatment;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public String[] getVaccines() {
        return vaccines;
    }

    public String getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public void setIsTreatment(boolean treatment) {
        isTreatment = treatment;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public void setVaccines(String[] vaccines) {
        this.vaccines = vaccines;
    }

}

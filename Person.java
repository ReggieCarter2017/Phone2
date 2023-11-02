package com.example;

public class Person {
    private Integer id;
    private String name;
    private String phoneNumber;
    private Integer experience;

    public Person(Integer id, String name, String phoneNumber, Integer experience) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }        
}

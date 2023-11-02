package com.example;

public class Person {
    private int id;
    private String name;
    private String phoneNumber;
    private Integer experience;

    public Person(int id, String name, String phoneNumber, int experience) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
    }
    

    public int getId() {
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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }


    @Override
    public String toString()
    {
        return getId() + " " + getName() + " " + getPhoneNumber() + " " + getExperience();
    }
}

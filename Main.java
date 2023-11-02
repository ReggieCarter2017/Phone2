package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        var persons = new ArrayList<Person>(List.of(
                new Person(0, "John", "789245785412", 4),
                new Person(1, "Joshua", "12312512512", 3)

        ));
        Phonebook.addPerson(persons, "Sam", "789245785412", 7);
        Phonebook.addPerson(persons, "John", "789245785412", 15);
        Phonebook.addPerson(persons, "Valeriy", "789245785412", 3);
        Phonebook.addPerson(persons, "Maria", "789245785412", 21);



        System.out.println(Phonebook.findByExperience(persons, 15).toString());
        System.out.println(Phonebook.findPersonById(persons, 2).toString());
        System.out.println(Phonebook.findPhonesByName(persons, "Sam"));




    }
}
package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        Phonebook.addPerson(persons, "John", "789245785412", 4);
        Phonebook.addPerson(persons, "Sam", "789245785412", 7);
        Phonebook.addPerson(persons, "John", "789245785412", 15);
        Phonebook.addPerson(persons, "Valeriy", "789245785412", 3);
        Phonebook.addPerson(persons, "Maria", "789245785412", 21);

        persons.forEach(System.out::println);


        System.out.println(Phonebook.findByExperience(persons, 15));
        Phonebook.findPersonById(persons, 2);
        Phonebook.findPhonesByName(persons, "Sam");




    }
}
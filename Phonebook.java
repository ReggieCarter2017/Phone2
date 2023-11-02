package com.example;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    public static void addPerson(ArrayList<Person> persons, String name, String phoneNumber, int experience)
    {
        int maxId = persons.stream().mapToInt(Person::getId).max().getAsInt();
        persons.add(new Person(maxId + 1, name, phoneNumber, experience));
    }
    
    public static List<String> findPhonesByName(List<Person> persons, String name) {
        return persons.stream().filter(p -> p.getName().equalsIgnoreCase(name)).map(p -> p.getPhoneNumber()).toList();
    }

    public static Person findByExperience(List<Person> persons, int experience) {
        assert persons != null : "LIST";
        var person = persons.stream().filter(p -> p.getExperience() == experience).findAny();
        if (person != null) return person;
        return null;
    }

    public static Person findPersonById(List<Person> persons, int id){

        Person person = persons.stream().filter(p -> p.getId() == id).findAny().get();
        if (person != null) return person;
        return null;      
        
    }

    
    


}

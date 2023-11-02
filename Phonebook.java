package com.example;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    static void addPerson(ArrayList<Person> list, String phone, String name, int experience) {
        int lastId = list.stream().mapToInt(Person::getId).max().getAsInt();
        list.add(new Person(lastId + 1, phone, name, experience));
    }

    static List<String> findPhonesByName(List<Person> list, String name) {
        return list.stream().filter(p -> p.getName().equalsIgnoreCase(name))
                .map(Person::getPhoneNumber).toList();
    }

    static Person findByExperience(List<Person> list, int experience) {
        assert list != null : "LIST";
        var opt = list.stream().filter(p -> p.getExperience() == experience).findAny();
        return opt.orElse(null);
    }

    public static Person findPersonById(List<Person> persons, int id){

        var person = persons.stream().filter(p -> p.getId() == id).findAny();

        return person.orElse(null);

    }
}

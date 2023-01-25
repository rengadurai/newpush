package com.onesoft.interview;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice"),
            new Person("Bob"),
            new Person("Charlie")
        );

        Consumer<Person> printName = person -> System.out.println(person.getName());

        people.forEach(printName);
        people.forEach(x -> System.out.println(x.getName()));
        
    }
}


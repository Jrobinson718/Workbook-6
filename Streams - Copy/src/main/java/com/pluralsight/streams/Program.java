package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        Console console = new Console();

        people.add(new Person("Alice", "Smith", 30));
        people.add(new Person("Bob", "Johnson", 24));
        people.add(new Person("Charlie", "Williams", 35));
        people.add(new Person("Diana", "Brown", 28));
        people.add(new Person("Edward", "Jones", 42));
        people.add(new Person("Fiona", "Garcia", 31));
        people.add(new Person("George", "Miller", 22));
        people.add(new Person("Hannah", "Davis", 29));
        people.add(new Person("Ivan", "Rodriguez", 38));
        people.add(new Person("Julia", "Martinez", 26));

        String fName = console.promptForString("What is the person's first name: ");
        String lName = console.promptForString("What is the person's last name: ");

        List<Person> nameSearch = people.stream()
                .filter(person -> {
                    boolean matchesFirstName = (fName != null && !fName.isEmpty()
                            && person.getFirstName() != null && person.getFirstName().equalsIgnoreCase(fName));

                    boolean matchesLastName = (lName != null && !lName.isEmpty()
                            && person.getLastName() != null && person.getLastName().equalsIgnoreCase(lName));

                    return matchesFirstName || matchesLastName;
                }).collect(Collectors.toList());

        double averageAge = people.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);

        Optional<Integer> highestAge = people.stream()
                .map(Person::getAge)
                .reduce(Integer::max);
        highestAge.ifPresent(hAge -> System.out.println("Highest age: " + hAge));

        Optional<Integer> lowestAge = people.stream()
                .map(Person::getAge)
                .reduce(Integer::min);
        lowestAge.ifPresent(lAge -> System.out.println("Lowest Age: " + lAge));

        System.out.println("Average age: " + averageAge);
        System.out.println(nameSearch);

//        for (Person search : people) {
//            boolean matchFound = false;
//            if (firstName != null && !firstName.isEmpty()) {
//                if (search.getFirstName() != null && search.getFirstName().equalsIgnoreCase(firstName)) {
//                    matchFound = true;
//                }
//            }
//            if (lastName != null && !lastName.isEmpty()) {
//                if (search.getLastName() != null && search.getLastName().equalsIgnoreCase(lastName)){
//                   matchFound = true;
//                }
//            }
//            if(matchFound) {
//                nameSearch.add(search);
//            }
//        }


    }
}

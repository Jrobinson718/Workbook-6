package com.pluralsight.streams;
import java.util.ArrayList;
import java.util.List;

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

        List<Person> result = new ArrayList<>();
        String firstName = console.promptForString("What is the person's first name: ");
        String lastName = console.promptForString("What is the person's last name: ");

        for (Person search : people) {
            boolean matchFound = false;
            if (firstName != null && !firstName.isEmpty()) {
                if (search.getFirstName() != null && search.getFirstName().equalsIgnoreCase(firstName)) {
                    matchFound = true;
                }
            }
            if (lastName != null && !lastName.isEmpty()) {
                if (search.getLastName() != null && search.getLastName().equalsIgnoreCase(lastName)){
                   matchFound = true;
                }
            }
            if(matchFound) {
                result.add(search);
            }
        }

        System.out.println(result);

    }
}

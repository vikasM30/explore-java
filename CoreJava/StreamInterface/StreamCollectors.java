package CoreJava.StreamInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectors {
        public static void main(String[] args) {

        // Example 1: Collecting to a List
        List<Integer> evenNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even numbers: " + evenNumbers);

        // Example 2: Collecting to a Set
        List<String> names = Arrays.asList("Viki", "Manju", "Rohan", "Viki", "Vandana");
        List<String> uniqueNames = names.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Unique names: " + uniqueNames);

        // Example 3: Joining strings
        String joinedNames = names.stream()
                .collect(Collectors.joining(", "));

        System.out.println("Joined names: " + joinedNames);

        // Example 4: Grouping by a property
        List<Person> people = Arrays.asList(
                new Person("Viki", 25),
                new Person("Manju", 30),
                new Person("Rohan", 25),
                new Person("Vandana", 35)
        );

        Map<Integer, List<Person>> peopleByAge = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));

        System.out.println("People by age: " + peopleByAge);
    }

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        int getAge() {
            return age;
        }
    }

}

package streams_04;

import java.util.Optional;

public class DemoOptional {

    public static void main (String... args) {
        Optional<Person> personOptional = Optional.of(
                new Person("Homer", "Simpson", GenderType.MALE, 43, 110, 175));
        System.out.println("Person " + personOptional.orElse(null));

        System.out.println("Person voornaam " + personOptional.map(Person::getFirstName).orElse("Legen voornaam"));


        Optional<Person> eersteLesgeverOptional = Optional.ofNullable(null);
        System.out.println("Person " + eersteLesgeverOptional.orElse(
                new Person("Gwijde", "Geenens", GenderType.MALE, 42, 110, 178)));

        Optional<Object> empty = Optional.empty();
        System.out.println("Empty " + empty.orElse(null));

        Optional<Object> empty2 = Optional.empty();
        System.out.println("Empty " + empty2.orElseThrow(() -> new RuntimeException("We moeten een object hebben")));


    }
}

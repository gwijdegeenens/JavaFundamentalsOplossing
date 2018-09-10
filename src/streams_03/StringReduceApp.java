package streams_03;

import java.util.stream.Stream;

public class StringReduceApp {

    public static void main(String[] args) {
        String[] words = {"Hello", "this", "is", "an", "example", "of", "streams"};
        String[] wordsNaToArray = Stream.of(words).toArray(size -> new String[size]);
        Stream.of(wordsNaToArray).forEach(System.out::println);


        Object[] objects = Stream.of(words).toArray();

        String[] nieuwe = Stream.of(words).toArray(String[]::new);


    }
}

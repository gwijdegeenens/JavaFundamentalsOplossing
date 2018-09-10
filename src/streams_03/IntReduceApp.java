package streams_03;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntReduceApp {

	public static void main(String[] args) {
		Integer[] numbersKlas = {5,7,2,9,7,4};
		Integer[] numbersNaToArray = Stream.of(numbersKlas).toArray(size -> new Integer[size]);
		Stream.of(numbersNaToArray).forEach(System.out::println);

		int[] numbers = {5,7,2,9,7,4};
		int[] intsNaToArray = IntStream.of(numbers).toArray();
		IntStream.of(intsNaToArray).forEach(System.out::println);

	}
}

package streams_01;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamApp {

	public static void main(String[] args) {
		System.out.println("range");
		IntStream.range(0, 10).forEach(System.out::println);
		System.out.println("rangeClosed");
		IntStream.rangeClosed(0, 10).forEach(System.out::println);


		Optional<Integer> optInt = Optional.of(new Integer(3));
		if (optInt.isPresent()) {
			System.out.println(optInt.get());
		} else {
			System.out.println("Leeg");
		}

		Optional<Integer> optInt1 = Optional.ofNullable(null);
		if (optInt1.isPresent()) {
			System.out.println(optInt1.get());
		} else {
			System.out.println("Leeg");
		}

		Optional<Integer> waarde = myMethod();
		if (waarde.isPresent()) {
			System.out.println(waarde.toString());
		}

	}


	public static Optional<Integer> myMethod() {
		return Optional.empty();
	}
}

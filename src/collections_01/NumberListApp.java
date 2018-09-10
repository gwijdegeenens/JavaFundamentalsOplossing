package collections_01;
import java.util.*;

public class NumberListApp {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter numbers (stop with 0):");
      
      List<Integer> numbers = new ArrayList<Integer>();
      
      int number = 0;
      while((number=scanner.nextInt()) != 0) {
         numbers.add(number);
      }
      
      int sum = numbers.stream()
                       .mapToInt(Integer::valueOf) // of i -> i
                       .sum();
      
      OptionalDouble avg = numbers.stream()
                       .mapToInt(Integer::valueOf) // of i -> i
                       .average();
      
      System.out.println("Sum : " + sum);
      System.out.println("Avg : " + (avg.isPresent()?avg.getAsDouble():""));
      numbers.forEach(System.out::println);
      scanner.close();
   }
}

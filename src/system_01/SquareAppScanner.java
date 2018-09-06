package system_01;

import java.util.*;

public class SquareAppScanner {
   public static void main(String[] args) {
      try (Scanner scanner = new Scanner(System.in)) {
         boolean repeat;
         do {
            repeat = false;
            System.out.print("Enter a number: ");
            try {
               int number = scanner.nextInt();
               System.out.printf("The square of %d is %d", number, number
                     * number);
            } catch (InputMismatchException ex) {
               System.out.println("Invalid number: " + scanner.next());
               repeat = true;
            }
         } while (repeat);
      }
   }
}

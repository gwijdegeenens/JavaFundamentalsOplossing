package system_02;

import java.io.*;
import java.util.*;

public class SquareAppConsole {
   public static void main(String[] args) {
      Console console = System.console();
      if (console != null) {
         boolean repeat;
         do {
            repeat = false;
            System.out.print("Enter a number: ");
            String text = console.readLine();
            try {
               double number = Double.parseDouble(text);
               System.out.printf("The square of %f is %f", number, number
                     * number);
            } catch (InputMismatchException ex) {
               System.out.println("Invalid number: " + text);
               repeat = true;
            }
         } while (repeat);
      } else {
         System.out.println("No console");
      }
   }
}

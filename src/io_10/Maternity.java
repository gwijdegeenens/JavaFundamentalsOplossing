package io_10;

import java.io.*;
import java.time.LocalDate;

public class Maternity {
   public static void main(String[] args) throws Exception {
      File file = new File("person.dat");
      LocalDate birthDay = LocalDate.now();
      Person baby = new Person("Homer","Simpson",birthDay);
      FileOutputStream fis = new FileOutputStream(file);
      ObjectOutputStream oos = new ObjectOutputStream(fis);
      oos.writeObject(baby);
      oos.close();
      System.in.read();
   }
}

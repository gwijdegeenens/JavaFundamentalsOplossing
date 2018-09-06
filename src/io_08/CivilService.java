package io_08;

import java.io.*;

public class CivilService {
   public static void main(String[] args) throws Exception {
      File file = new File("person.dat");
      FileInputStream fis = new FileInputStream(file);
      ObjectInputStream ois = new ObjectInputStream(fis);
      Person citizen = (Person) ois.readObject();
      ois.close();
      
      System.out.println(citizen.getFirstName());
      System.out.println(citizen.getLastName());
      System.out.format("%td/%<tm/%<tY%n",citizen.getBirthDay());

      System.in.read();
   }   
}

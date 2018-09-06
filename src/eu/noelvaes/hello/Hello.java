package eu.noelvaes.hello;

import java.io.*;
import java.util.*;

public class Hello {

   private String text;

   public Hello() {
      try (InputStream in = getClass().getResourceAsStream("Hello.properties")) {
         Properties props = new Properties();
         props.load(in);
         text = props.getProperty("text");
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public String sayHello() {
      return text;
   }
}

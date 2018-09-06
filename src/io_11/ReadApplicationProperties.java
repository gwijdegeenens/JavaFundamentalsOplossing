package io_11;

import java.io.*;

public class ReadApplicationProperties {

   public static void main(String[] args) {
      ApplicationProperties props = new ApplicationProperties("App.properties");
      try {
         props.load();
         System.out.println(props.getHeight());
         System.out.println(props.getWidth());
         System.out.println(props.getX());
         System.out.println(props.getY());
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}

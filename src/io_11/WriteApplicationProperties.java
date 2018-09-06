package io_11;

import java.io.*;

public class WriteApplicationProperties {

   public static void main(String[] args) {
      ApplicationProperties props = new ApplicationProperties("App.properties");
      try {
         props.setHeight(400);
         props.setWidth(600);
         props.setX(100);
         props.setY(200);
         props.store();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}

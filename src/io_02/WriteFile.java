package io_02;

import java.io.*;

public class WriteFile {
   public static void main(String[] args) {
      FileWriter file = null;
      try {
         file = new FileWriter("MyFile.txt",true);
         file.write("Hello");
         file.write("World");
      }
      catch(IOException ex) {
         System.out.println("Ooops, something went wrong");
         System.out.println(ex.getMessage());
      }
      finally {
         try {
            if(file!= null) file.close();
         }
         catch(IOException ex) {
            System.err.println("Error closing file");
         }
      }
   }
}
package io_05;

import java.io.*;
import java.util.zip.*;

public class WriteReadBuffer {
   public static void main(String[] args) {
      ByteArrayOutputStream baos;
      DeflaterOutputStream dos;
      PrintStream ps;
      
      ByteArrayInputStream bais;
      InflaterInputStream iis;
      InputStreamReader isr;
      BufferedReader br;

      try {
         baos = new ByteArrayOutputStream();
         dos = new DeflaterOutputStream(baos);
         ps = new PrintStream(dos);
         ps.print("Hello World");
         ps.close();
         
         // This is the memory buffer
         byte[] buffer = baos.toByteArray();
                  
         bais = new ByteArrayInputStream(buffer);
         iis = new InflaterInputStream(bais);
         isr = new InputStreamReader(iis);
         br = new BufferedReader(isr);
         String line;
         while((line = br.readLine()) != null) {
            System.out.println(line);
         }    
      } catch (IOException ex) {
         System.out.println(ex.getMessage());
      }
   }
}

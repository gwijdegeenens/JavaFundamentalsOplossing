package io_04;

import java.io.*;

public class ReadFile {
   public static void main(String[] args) {
		try( FileReader file = new FileReader("MyFile.txt");
		     BufferedReader reader = new BufferedReader(file) )  {
		   String line = null;
		   while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException ex) {
			System.out.println("Oops, something went wrong!");
			System.out.println(ex.getMessage());
		}
	}
}
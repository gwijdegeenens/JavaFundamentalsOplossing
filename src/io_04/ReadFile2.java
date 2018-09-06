package io_04;

import java.io.*;
import java.nio.file.*;
import java.util.stream.Stream;

public interface ReadFile2 {
   public static void main(String[] args) throws IOException {
      Path path = Paths.get("D:\\MyFile.txt");
      try(Stream<String> stream = Files.lines(path)){
         stream.forEach(System.out::println);
      }     
   }
}
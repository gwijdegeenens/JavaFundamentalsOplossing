package exercise14_01;

public class Musician {
   public class Instrument {
      public void makeSound() {
         System.out.println("plong");
      }
   }
   
   public void play() {
      System.out.println("Playing the piano");
      Instrument piano = new Instrument();
      piano.makeSound();
   } 
}

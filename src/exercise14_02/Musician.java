package exercise14_02;

public class Musician {
   public void play() {     
      class Instrument {
         public void makeSound() {
            System.out.println("Plong");
         }
      }
      System.out.println("Playing the gitar");
      Instrument instrument = new Instrument();
      instrument.makeSound();
   }
}

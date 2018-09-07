package exercise14_03;
public class Musician {
   public void play() {
      System.out.println("Playing the piano");
      Instrument instrument = new Instrument() {
         public void makeSound() {
            System.out.println("plong");             
         }
      };
      instrument.makeSound();
   }
}

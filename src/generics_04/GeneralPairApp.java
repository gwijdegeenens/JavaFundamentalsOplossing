package generics_04;

public class GeneralPairApp {
   public static void main(String[] args) {
      Shoe leftShoe = new Shoe();      
      Shoe rightShoe = new Shoe();     
      GeneralPair<Shoe> pair = new GeneralPair<>(leftShoe,rightShoe);
      pair.swap();
   }
}

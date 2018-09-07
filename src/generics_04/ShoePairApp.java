package generics_04;

public class ShoePairApp {
   public static void main(String[] args) {
      Shoe leftShoe = new Shoe();      
      Shoe rightShoe = new Shoe();     
      Pair<Shoe> pair = new ShoePair(leftShoe,rightShoe);
      pair.swap();
   }
}

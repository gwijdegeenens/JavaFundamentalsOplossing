package exercise10_09.animals;

public class Fish extends Animal {

   public Fish() {
   }

   public Fish(String name) {
      super(name);
   }

   @Override
   public void move() {
      System.out.println("Swim");
   }

   @Override
   public void makeNoise() {
      System.out.println("Blub");
   }
}

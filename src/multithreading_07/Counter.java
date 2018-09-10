package multithreading_07;

public class Counter {
   private int count = 0;

   public void increment() {
      count = count + 1;
   }

   public void decrement() {
      count--;
   }

   public int getCount() {
      return count;
   }
}

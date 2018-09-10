package multithreading_02;

public class PrintAppLambda {

   public static void main(String[] args) {
      Thread thread1 = new Thread(() -> print('#', 1000), "TH1");
      Thread thread2 = new Thread(() -> print('*', 1000), "TH2");
      thread2.setDaemon(true);

      thread1.start();
      thread2.start();

      print('@', 1000);

   }

   public static void print(char c, int count) {
      for (int i = 0; i < count; i++) {
         try {
            Thread.sleep(200);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
         System.out.print(c);
      }
   }
}

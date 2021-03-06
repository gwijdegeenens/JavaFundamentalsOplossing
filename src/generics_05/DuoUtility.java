package generics_05;

public interface DuoUtility {
   public static void printUpper(Duo<String> d) {
      System.out.println(d.getFirst().toUpperCase() + ","
            + d.getSecond().toUpperCase());
   }

   public static void printDuo(Duo<?> d) {
      System.out.println(d.getFirst() + "," + d.getSecond());
   }

   public static void printSum(Duo<? extends Number> d) {
      Number n1 = d.getFirst();
      Number n2 = d.getSecond();
      System.out.println(n1 + "+" + n2 + "="
            + (n1.doubleValue() + n2.doubleValue()));
   }
      
   public static void method(Duo<? super Number> d) {
      System.out.println(d.getFirst() + ", " + d.getSecond());
   }  
}

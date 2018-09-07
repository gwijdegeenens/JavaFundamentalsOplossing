package generics_06;

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
      
   }
   
   public static <T> void swapFirst(Duo<T> d1, Duo<T> d2) {
      T temp = d1.getFirst();
      d1.setFirst(d2.getFirst());
      d2.setFirst(temp);
   }

   public static <T1 extends Number, T2 extends Number> void sumAll(Duo<T1> d1, Duo<T1> d2, Duo<T2> d3, Duo<T2> d4) {
      T1 n11 = d1.getFirst();
      T1 n12 = d1.getSecond();
      T1 n21 = d2.getFirst();
      T1 n22 = d2.getSecond();

      T2 n31 = d3.getFirst();
      T2 n32 = d3.getSecond();
      T2 n41 = d4.getFirst();
      T2 n42 = d4.getSecond();

      System.out.println(n11.doubleValue() + n12.doubleValue()
              + n21.doubleValue() + n22.doubleValue() + n31.doubleValue()
              + n32.doubleValue()+ n41.doubleValue() + n42.doubleValue());

   }
}

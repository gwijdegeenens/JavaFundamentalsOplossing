package exercise11_01;

public class DayApp {
   public static void main(String[] args) {
      for(Day d: Day.values()) {
         System.out.println(d.name());
         System.out.println(d.ordinal());
         System.out.println(d);
      }
   }
}

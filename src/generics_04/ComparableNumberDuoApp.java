package generics_04;

public class ComparableNumberDuoApp {
   public static void main(String[] args) {
      ComparableNumberDuo<Integer> id = new ComparableNumberDuo<>(7,5);                  
      ComparableNumberDuo<Long>    ld = new ComparableNumberDuo<>(746987L,546358L);                        
      ComparableNumberDuo<Float>   fd = new ComparableNumberDuo<>(5.7F,8.9F);
      
      //ComparableDuo<Number>   nd = new ComparableDuo<>(5.3F,2.7F);
      
      System.out.println(id.getHighest());
      System.out.println(id.getSum());
      System.out.println(ld.getHighest());
      System.out.println(ld.getSum());
      System.out.println(fd.getHighest());
      System.out.println(fd.getSum());
   }   
}

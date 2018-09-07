package generics_04;

public class ComparableDuoApp {
   public static void main(String[] args) {
      ComparableDuo<Integer> id = new ComparableDuo<>(7,5);                  
      ComparableDuo<Long>    ld = new ComparableDuo<>(746987L,546358L);                        
      ComparableDuo<Float>   fd = new ComparableDuo<>(5.7F,8.9F);
      
      System.out.println(id.getHighest());
      System.out.println(ld.getHighest());
      System.out.println(fd.getHighest());
   }   
}

package generics_01;

public class DuoApp {
   public static void main(String[] args) {
      Duo<String>  sd = new Duo<>("Hello","World");
      Duo<Integer> id = new Duo<>(7,5);                  
      Duo<Long>    ld = new Duo<>(746987L,546358L);                        
      Duo<Float>   fd = new Duo<>(5.7F,8.9F);

      System.out.println(sd.getFirst());
      System.out.println(sd.getSecond());
      System.out.println(id.getFirst());
      System.out.println(id.getSecond());
      System.out.println(ld.getFirst());
      System.out.println(ld.getSecond());
      System.out.println(fd.getFirst());
      System.out.println(fd.getSecond());

      sd.swap();

      System.out.println(sd.getFirst());
      System.out.println(sd.getSecond());
      
   }   
     
}

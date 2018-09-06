package system_03;

import java.util.*;

public class SystemProperties {
   public static void main(String[] args) {
      Properties props = System.getProperties();
      props.list(System.out);
   }
}

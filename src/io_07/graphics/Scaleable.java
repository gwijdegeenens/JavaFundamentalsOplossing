package io_07.graphics;

import java.io.*;

/**
 * Scaleable objects
 * 
 * @author Noel Vaes
 * @version 1.0
 */
public abstract interface Scaleable extends Serializable {
   /**
    * Scale the object.
    * 
    * @param factor
    *           Scale factor (%)
    */
   public abstract void scale(int factor);

   /** Scale 25% */
   public final int QUARTER = 25;
   /** Scale 50% */
   public final int HALF = 50;
   /** Scale 200% */
   public final int DOUBLE = 200;
}

package generics_04;

public class ComparableNumberDuo<E extends Number & Comparable<E>> {
   private E first;
   private E second;

   public ComparableNumberDuo(E first, E second) {
      this.first = first;
      this.second = second;
   }

   public void setFirst(E first) {
      this.first = first;
   }

   public void setSecond(E second) {
      this.second = second;
   }

   public E getFirst() {
      return first;
   }

   public E getSecond() {
      return second;
   }

   public E getHighest() {
      return (first.compareTo(second) < 0) ? second : first;
   }

   public double getSum() {
      return first.doubleValue() + second.doubleValue();
   }
}

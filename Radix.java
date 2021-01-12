public class Radix {

  public static int nth(int n, int col) {
    int tenToCol = (int)Math.pow(10, col + 1);
    int remainder = Math.abs(n%tenToCol);
    int newnumber = (10 * remainder) / tenToCol;
    return (newnumber%10);
  }

  public static int length(int n) {
    if (n == 0) {
      return 1;
    }
    n = Math.abs(n);
    double log = Math.log10((double)n);
    return (int)(log + 1);
  }

  public static void merge(SortableLinkedList original, SortableLinkedList[] buckets) {
    for (int i = 0; i < buckets.length; i++) {
      original.extend(buckets[i]);
    }
  }

  public static void radixSortSimple(SortableLinkedList data) {
    SortableLinkedList[] buckets = new SortableLinkedList[10];

  }

  public static void radixSort(SortableLinkedList data) {
    
  }
}

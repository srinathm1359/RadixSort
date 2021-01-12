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
    for (int i = 0; i < 10; i++) {
      buckets[i] = new SortableLinkedList();
    }
    int biggestLength = 1;
    //Find largest length and put everything into buckets
    int currentValue;
    int currentLength;
    while (0 < data.size()) {
      currentValue = data.get(0);
      currentLength = length(currentValue);
      //Place newest node's data into bucket for units digit
      buckets[nth(currentValue, 0)].add(currentValue);
      //Find largest length
      if (currentLength > biggestLength) {
        biggestLength = currentLength;
      }
      //avoid duplicating the elements
      data.remove(0);
    }
    merge(data, buckets);
    //begin the sorting process
    for (int i = 1; i < biggestLength; i++) {
      while (0 < data.size()) {
        currentValue = data.get(0);
        buckets[nth(currentValue, i)].add(currentValue);
        data.remove(0);
      }
      merge(data, buckets);
    }

  }

  public static void radixSort(SortableLinkedList data) {

  }
}

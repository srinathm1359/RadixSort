public class Tester {
  public static void main(String[] args) {
    //Testing nth
    int positivenumber = 31415926;
    for (int i = 9; i >= 0; i--) {
      int ithDigit = Radix.nth(positivenumber, i);
      System.out.print(ithDigit);
    }
    System.out.println();
    int negativenumber = -1234567;
    for (int i = 7; i >= 0; i--) {
      int ithDigit = Radix.nth(negativenumber, i);
      System.out.print(ithDigit);
    }
    System.out.println();
    //Testing length
    System.out.println(Radix.length(positivenumber));
    System.out.println(Radix.length(negativenumber));
    //Testing radixSortSimple
    int[] toSortSimple = {176, 338, 147, 299, 120, 43, 1898, 3600, 2, 14, 8, 635};
    SortableLinkedList sortingSimple = new SortableLinkedList();
    for (int i = 0; i < toSortSimple.length; i++) {
      sortingSimple.add(toSortSimple[i]);
    }
    System.out.println(sortingSimple);
    Radix.radixSortSimple(sortingSimple); System.out.println(sortingSimple);
  }
}

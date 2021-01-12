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
  }
}

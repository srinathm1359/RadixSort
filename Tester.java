public class Tester {
  public static void main(String[] args) {
    //Testing nth
    int number = 31415926;
    int tenToCol;
    for (int i = 9; i >= 0; i--) {
      tenToCol = (int)Math.pow(10, i);
      int ithDigit = Radix.nth(number, i);
      System.out.print(ithDigit);
    }
    System.out.println();
  }
}

public class Radix {
  public static int nth(int n, int col) {
    int tenToCol = (int)Math.pow(10, col + 1);
    int quotient = n/tenToCol;
    int remainder = n - quotient*tenToCol;
    int newnumber = (10 * remainder) / tenToCol;
    return (newnumber%10);
  }
}

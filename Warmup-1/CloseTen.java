// Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
//
//
// close10(8, 13) → 8
// close10(13, 8) → 8
// close10(13, 7) → 0

public class CloseTen{

  public static int closeTen(int a, int b) {
    int substrA = Math.abs(a - 10);
    int substrB = Math.abs(b - 10);

    if(substrA > substrB) return b;
    else if(substrA < substrB) return a;
    return 0;
  }


  public static void main (String args[]){
    System.out.println(closeTen(8,13));
    System.out.println(closeTen(5,21));
    System.out.println(closeTen(10,10));
  }
}

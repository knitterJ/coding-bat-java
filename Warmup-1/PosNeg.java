// Return true if one is negative and one is positive.
// Except if the parameter "negative" is true, then return true only if both are negative.

public class PosNeg {

  public static boolean posNeg(int a, int b, boolean negative) {

    //Special case if negative is true
    if(negative){
      //Once it enters, return true only if both are negative
      return (a < 0 && b < 0);
    } else {
      // Return true if one is negative and one is positive.
      return ((a < 0 && b > 0) || (a > 0 && b < 0));
    }
}

public static void main(String[] args){
  System.out.println(posNeg(-4, -5, true));
  System.out.println(posNeg(-1, 1, false));
  System.out.println(posNeg(-4, 5, true));
  System.out.println(posNeg(2, 1, false));
  }
}

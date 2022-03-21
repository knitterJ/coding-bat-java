// Given three int values, a b c, return the largest.
//
// intMax(1, 2, 3) → 3
// intMax(1, 3, 2) → 3
// intMax(3, 2, 1) → 3

public class IntMax{

  public static int intMax(int a, int b, int c) {
    if(a>b && a>c) return a;
    else if (b>a && b>c) return b;
    return c;
  }

  public static void main (String args[]){
    System.out.println(intMax(1,2,3));
    System.out.println(intMax(3,9,1));
    System.out.println(intMax(-3,-1,2));
  }
}

// Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
//
// max1020(11, 19) → 19
// max1020(19, 11) → 19
// max1020(11, 9) → 11

public class Max1020{

  public static int max1020(int a, int b) {
    int PotentialA = 0;
    int PotentialB = 0;
      if((a >= 10 && a <= 20)) {
      PotentialA = a;
      } else a = 0;

      if((b >= 10 && b <= 20)){
      PotentialB = b;
      }else b = 0;
      if(a != 0 || b !=0 ) return Math.max(PotentialB, PotentialA);
      return 0;
    }


  public static void main (String args[]){
    System.out.println(max1020(9, 21));
    System.out.println(max1020(10, 21));
    System.out.println(max1020(13, 13));
  }
}

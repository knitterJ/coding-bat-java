// Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
//
// lastTwo("coding") → "codign"
// lastTwo("cat") → "cta"
// lastTwo("ab") → "ba"

public class LastTwo {

  public static String lastTwo(String str) {
    if(str.length() < 2) return str;

    char oneBeforeLast = str.charAt(str.length()-2);
    char lastOne = str.charAt(str.length()-1);
    String strMinusLastTwo = str.substring(0, str.length()-2);
    return strMinusLastTwo + lastOne + oneBeforeLast;
  }


public static void main(String[] args){
  System.out.println(lastTwo("coding"));
  System.out.println(lastTwo("cta"));
  System.out.println(lastTwo("a"));
  }
}

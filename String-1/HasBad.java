// Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
//
// hasBad("Hello", "There") → "ellohere"
// hasBad("java", "code") → "avaode"
// hasBad("shotl", "java") → "hotlava"

public class HasBad {

  public static boolean hasBad(String str) {
    if( str.equals("bad") || str.length() > 3 && (str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad") )){
      return true;
    } else return false;
  }


public static void main(String[] args){
  System.out.println(hasBad("badxx"));
  System.out.println(hasBad("xbadxx"));
  System.out.println(hasBad("xxbadxx"));
  System.out.println(hasBad("bad"));
  }
}

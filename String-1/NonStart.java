// Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
//
// nonStart("Hello", "There") → "ellohere"
// nonStart("java", "code") → "avaode"
// nonStart("shotl", "java") → "hotlava"

public class NonStart {

  public static String nonStart(String a, String b) {
    String aMinusFirst = a.substring(1,a.length());
    String aMinusSecond = b.substring(1,b.length());
    return aMinusFirst + aMinusSecond;
  }

public static void main(String[] args){
  System.out.println(nonStart("Hello", "hi"));
  System.out.println(nonStart("shotl", "java"));
  System.out.println(nonStart("x", "c"));
  }
}

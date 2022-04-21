// Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
//
// stringX("xxHxix") → "xHix"
// stringX("abxxxcd") → "abcd"
// stringX("xabxxxcdx") → "xabcdx"
public class StringX {

  public static String stringX(String str) {
    if (str.length() > 1) {
      char firstChar = str.charAt(0);
      char secondChar = str.charAt(str.length() - 1);
      String theMiddleScrapedOut = str.substring(1, str.length() - 1).replace("x", "");
      return firstChar + theMiddleScrapedOut + secondChar;
    } else return str;
  }

  public static void main(String[] args) {
    System.out.println(stringX("xabxxxcdx"));
    System.out.println(stringX("abxxxcd"));
    System.out.println(stringX("Hxix"));
    System.out.println(stringX("x"));
    System.out.println(stringX("xx"));
    System.out.println(stringX(""));
  }
}

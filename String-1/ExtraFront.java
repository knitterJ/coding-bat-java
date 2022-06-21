// Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.
//
// extraFront("Hello") → "HeHeHe"
// extraFront("ab") → "ababab"
// extraFront("H") → "HHH"

public class ExtraFront {

  public static String extraFront(String str) {
    if(str.length() < 2){
      return str + str + str;
    }
    String firstTwoChars = str.substring(0,2);
    return firstTwoChars + firstTwoChars + firstTwoChars;
  }




public static void main(String[] args){
  System.out.println(extraFront("string"));
  System.out.println(extraFront("code"));
  System.out.println(extraFront(""));
  System.out.println(extraFront("H"));
  }
}

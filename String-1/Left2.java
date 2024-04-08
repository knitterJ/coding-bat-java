// Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.
//
// left2("Hello") → "lloHe"
// left2("java") → "vaja"
// left2("Hi") → "Hi"

public class Left2 {

  public static String left2(String str) {
    String lastTwo = str.substring(0,2);
    return str.substring(2,str.length()) + lastTwo;
  }

public static void main(String[] args){
  System.out.println(left2("java"));
  System.out.println(left2("Hi"));
  }
}

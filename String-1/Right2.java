// Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.
//
// left2("Hello") → "lloHe"
// left2("java") → "vaja"
// left2("Hi") → "Hi"

public class Right2 {

  public static String right2(String str) {
    String lastTwo = str.substring(str.length()-2, str.length());
    return lastTwo + str.substring(0, str.length()-2);
  }

public static void main(String[] args){
  System.out.println(right2("deco"));
  System.out.println(right2("12345"));
  }
}

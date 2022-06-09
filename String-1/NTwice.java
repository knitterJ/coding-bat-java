// Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
//
// nTwice("Hello", 2) → "Helo"
// nTwice("Chocolate", 3) → "Choate"
// nTwice("Chocolate", 1) → "Ce"

public class NTwice {

  public static String nTwice(String str, int n) {
    String firstTwo = str.substring(0,n);
    String lastTwo = str.substring(str.length()-n, str.length());
    return firstTwo + lastTwo;
  }

public static void main(String[] args){
  System.out.println(nTwice("Hello", 2));
  System.out.println(nTwice("Chocolate", 3));
  System.out.println(nTwice("Chocolate", 0));
    System.out.println(nTwice("Code", 4));
  }
}

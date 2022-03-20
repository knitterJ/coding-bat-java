// Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
//
// mixStart("mix snacks") → true
// mixStart("pix snacks") → true
// mixStart("piz snacks") → false

public class MixStart{

  public static boolean mixStart(String str) {
    if(str.length() <= 2) return false;
    char isItI = str.charAt(1);
    char isItX = str.charAt(2);
    String isItIString = String.valueOf(isItI);
    String isItXString = String.valueOf(isItX);
    if(isItIString.equals("i") && isItXString.equals("x")) return true;
    return false;
  }

  public static void main (String args[]){
    System.out.println(mixStart("mix"));
    System.out.println(mixStart("pix"));
    System.out.println(mixStart("piz"));
    System.out.println(mixStart("ni"));
    System.out.println(mixStart(""));
  }
}

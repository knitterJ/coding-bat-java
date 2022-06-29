// Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
//
// withoutX("xHix") → "Hi"
// withoutX("xHi") → "Hi"
// withoutX("Hxix") → "Hxi"

public class WithoutX {

  public static String withoutX(String str) {
    if(str.equals("") || str.length() == 1 && str.charAt(0) == 'x' || str.length() == 2 && str.substring(0,2).equals("xx")) return "";
    if(str.charAt(0) == 'x' && str.charAt(str.length() -1) != 'x') return str.substring(1, str.length());
    if(str.charAt(0) != 'x' && str.charAt(str.length() -1) == 'x') return str.substring(0, str.length()-1);
    if(str.charAt(0) == 'x' && str.charAt(str.length()-1) == 'x') return str.substring(1, str.length()-1);
    return str;
  }

  public static void main(String[] args){
    System.out.println(withoutX(""));
    System.out.println(withoutX("x"));
    System.out.println(withoutX("xx"));
    System.out.println(withoutX("xHix"));
    System.out.println(withoutX("Hxix"));
    System.out.println(withoutX("xxHi"));
    }
}

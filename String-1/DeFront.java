// Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
//
// deFront("Hello") → "llo"
// deFront("java") → "va"
// deFront("away") → "aay"

public class DeFront {

  public static String deFront(String str) {
    if(str.charAt(0) != 'a' && str.charAt(1) != 'b'){
        return str.substring(2,str.length());
    } else if(str.charAt(0) == 'a' && str.charAt(1) == 'b'){
      return str;
    } else if(str.charAt(0) == 'a' && str.charAt(1) != 'b'){
      return 'a' + str.substring(2,str.length());
    } else return 'b' + str.substring(2,str.length());
  }

public static void main(String[] args){
  System.out.println(deFront("string"));
  System.out.println(deFront("hi"));
  System.out.println(deFront("abc"));
  System.out.println(deFront("axy"));
  }
}

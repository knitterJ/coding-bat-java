// Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
//
// firstHalf("WooHoo") → "Woo"
// firstHalf("HelloThere") → "Hello"
// firstHalf("abcdef") → "abc"

public class FirstHalf {
  public static String firstHalf(String str) {
    if(str.length()%2==0){
      return str.substring(0,str.length()/2);
    } else return str;
  }
public static void main(String[] args){
  System.out.println(firstHalf("Hi"));
  System.out.println(firstHalf("123456789"));
  System.out.println(firstHalf("Kitten"));
  }
}

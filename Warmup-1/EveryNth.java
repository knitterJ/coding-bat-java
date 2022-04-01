// Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
//
// everyNth("Miracle", 2) → "Mrce"
// everyNth("abcdefg", 2) → "aceg"
// everyNth("abcdefg", 3) → "adg"

public class EveryNth {

  public static String everyNth(String str, int n) {
    String niceOne = "";
    for(int i=0; i < str.length(); i+=n){


      // System.out.println(str.charAt(i));
      //The loop works fine... now how to store all these characters in f** java
      //All right.. it simply occurred that it's possible to store the result of charAt() to String 
      niceOne += str.charAt(i);
    }
    return niceOne;
  }

    public static void main(String args[]) {
        System.out.println(everyNth("Hello", 2));
        System.out.println(everyNth("Heeello", 3));
        System.out.println(everyNth("Heeeello", 2));
    }
}

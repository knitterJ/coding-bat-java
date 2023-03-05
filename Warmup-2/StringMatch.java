// Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
//
// stringMatch("xxcaazz", "xxbaaz") → 3
// stringMatch("abc", "abc") → 2
// stringMatch("abc", "axc") → 0

public class StringMatch{

  public static int stringMatch(String a, String b) {

    //choose shorter for the length of the for loop
    int correctLength = a.length() > b.length() ? b.length() : a.length();
    // alternatively - int len = Math.min(a.length(), b.length());

    int counter = 0;
    for(int i=0; i < correctLength-1; i++){
       if(a.substring(i,i+2).equals(b.substring(i, i+2))){
         counter++;
       }
    }
    return counter;
  }


public static void main(String[] args){
  System.out.println(stringMatch("xxcaazz", "xxbaaz"));
  System.out.println(stringMatch("abc", "abc"));
  System.out.println(stringMatch("abc", "axc"));
  }
}

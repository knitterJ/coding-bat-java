// Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
//
// missingChar("kitten", 1) → "ktten"
// missingChar("kitten", 0) → "itten"
// missingChar("kitten", 4) → "kittn"

public class MissingChar {

  public static String missingCharSolved(String str, int n){
  str = str.substring(0,n) + str.substring(n+1);
  return str;
  };

public static void main(String[] args){
  System.out.println(missingCharSolved("Hi", 0));
  System.out.println(missingCharSolved("code", 1));
  }
}

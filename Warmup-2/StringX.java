// Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
//
// countXX("abcxx") → 1
// countXX("xxx") → 2
// countXX("xxxx") → 3
public class CountXX {

public static int countXX(String str) {
  int countX = 0;
  System.out.println(str.length());

  //"str.length()-1" in order to avoid conflicts with the str.substring(), which goes beyond the string during the last iteration.
  for(int i=0; i < str.length()-1; i++){
    // System.out.println(str.substring(i, i+2));

    //ALWAYS IN JAVA .EQUALS IN ORDER TO COMPARE 2STRINGS!!
    if(str.substring(i, i+2).equals("xx")){
      countX++;
    }
  }
  return countX;
}


public static void main(String[] args){
  System.out.println(countXX("x"));
  System.out.println(countXX("Hexxo Thexxo xx"));
  System.out.println(countXX("abc"));
  System.out.println(countXX("xxxx"));
  }
}

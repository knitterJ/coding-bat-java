// Given a string, return a new string where the first and last chars have been exchanged.
//
// frontBack("code") → "eodc"
// frontBack("a") → "a"
// frontBack("ab") → "ba"

public class FrontBack {

  public static String frontBack(String str) {
  if(str.length() != 1 && str != "")  //replaced by one condition: str.length() <= 1
    {
      return str.substring(str.length()-1, str.length())  + str.substring(1, str.length()-1) + str.charAt(0);
    } else return str;
}

public static void main(String[] args){
  System.out.println(frontBack("code"));
  System.out.println(frontBack("c"));
  }
}

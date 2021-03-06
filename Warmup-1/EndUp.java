// Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.
//
// endUp("Hello") → "HeLLO"
// endUp("hi there") → "hi thERE"
// endUp("hi") → "HI"

public class EndUp {

  public static String endUp(String str) {
    if(str.length() == 0){
      return "";
    }
    if(str.length() <= 3){
      return str.toUpperCase();
    } return str.substring(str.length()-3, str.length()).toUpperCase();
}


public static void main(String[] args){
  System.out.println(endUp("hi"));
  System.out.println(endUp("ode"));
  System.out.println(endUp("code"));
  System.out.println(endUp("cewafew"));
  }
}

// Given a string, return true if it ends in "ly".
//
// endsLy("oddly") → true
// endsLy("y") → false
// endsLy("oddy") → false

public class EndsLy{

  public static boolean endsLy(String str) {
    if(str.length()>1 && str.substring(str.length()-2,str.length()).equals("ly")){
      return true; } return false;
  }

public static void main(String[] args){
  System.out.println(endsLy("kitten"));
  System.out.println(endsLy("lllly"));
  System.out.println(endsLy(""));
  }
}

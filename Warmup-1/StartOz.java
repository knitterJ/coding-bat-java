// Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
//
// startOz("ozymandias") → "oz"
// startOz("bzoo") → "z"
// startOz("oxx") → "o"

public class StartOz{

  public static String startOz(String str) {
    if(str.length() <= 2) return str;
    char isItO = str.charAt(0);
    char isItZ = str.charAt(1);
    String isItOString = String.valueOf(isItO);
    String isItZString = String.valueOf(isItZ);

    if(isItOString.equals("o")) return "o";
    if(isItZString.equals("z")) return "z";
    if(isItOString.equals("o") && isItZString.equals("z")) return "oz";
    return str; 
  }

  public static void main (String args[]){
    System.out.println(startOz("ozymandias"));
    System.out.println(startOz("bzoo"));
    System.out.println(startOz("oxxx"));
    // System.out.println(startOz("del"));
  }
}

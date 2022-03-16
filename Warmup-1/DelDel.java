// delDelGiven a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.
//
// delDel("adelbc") → "abc"
// delDel("adelHello") → "aHello"
// delDel("adedbc") → "adedbc"

public class DelDel{

  public static String delDel(String str) {
    if(str.length() < 2) return str;
    char isitD = str.charAt(1);
    String isitDString = String.valueOf(isitD);
    if(isitDString.equals("d")) return str.replaceAll("del", ""); return str;
  }

  public static void main (String args[]){
    System.out.println(delDel("adelbc"));
    System.out.println(delDel("adelHello"));
    System.out.println(delDel("adedbc"));
    System.out.println(delDel("a"));
    System.out.println(delDel("del"));
  }
}

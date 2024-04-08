// Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.
//
// withoutX2("xHi") → "Hi"
// withoutX2("Hxi") → "Hi"
// withoutX2("Hi") → "Hi"

public class WithoutX2 {

  public static String withoutX2(String str) {
      //case when x stands in the second position only
      if(str.length() > 1 && str.charAt(0) != 'x' && str.charAt(1) == 'x'){
        return str.charAt(0) + str.substring(2);
      }

      // if first char is x, rebuild the string with str.substring(1)
      if (str.length() > 0 && str.charAt(0) == 'x') {
      str = str.substring(1);
      //in case the current (after rebuild) str.charAt(0) is 'x' trim once again and return result
      if(str.length() > 0 && str.charAt(0) == 'x') return str.substring(1);
      }
     return str;
  }

public static void main(String[] args){
  System.out.println(withoutX2("Hxi"));
  System.out.println(withoutX2("xHi"));
  System.out.println(withoutX2("xx"));
  System.out.println(withoutX2("xxHi"));
  }
}

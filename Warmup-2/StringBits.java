// Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
//
// stringBits("Hello") → "Hlo"
// stringBits("Hi") → "H"
// stringBits("Heeololeo") → "Hello"

public class StringBits {

public static String stringBits(String str) {
  String storeIt = "";
  for(int i=0; i < str.length(); i+=2) {
    storeIt += str.charAt(i);
  }
  return storeIt;
}
public static void main(String[] args){
  System.out.println(stringBits("HHeeololeo"));
  System.out.println(stringBits("HiHiHi"));
  System.out.println(stringBits(""));
  }
}

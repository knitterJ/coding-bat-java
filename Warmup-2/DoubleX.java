// Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
//
// doubleX("axxbb") → true
// doubleX("axaxax") → false
// doubleX("xxxxx") → true

public class DoubleX {

public static boolean doubleX(String str) {
    int StorePosX = str.indexOf("x");
    int StorePosSecX = str.indexOf("x", StorePosX+1);
    // System.out.println(StorePosX);
    // System.out.println(StorePosSecX);
    if(StorePosX+1 == StorePosSecX) {
    return true;
      } return false;
    }

public static void main(String[] args){
  System.out.println(doubleX("Hi"));
  System.out.println(doubleX("xx"));
  System.out.println(doubleX("axxbb"));
  }
}

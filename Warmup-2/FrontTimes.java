// Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
//
// frontTimes("Chocolate", 2) → "ChoCho"
// frontTimes("Chocolate", 3) → "ChoChoCho"
// frontTimes("Abc", 3) → "AbcAbcAbc"
// frontTimes("A", 4) → "AAAA"

public class FrontTimes{
public static String frontTimes(String str, int n) {
  String resultString = "";
  if(str.length()<3){

    // Primitive type (char[n]) is instantiated with n nulls, then a String is created from the char[], and all the nulls are replaced() with the characters that the str contains
    String repeated =  new String(new char[n]).replace("\0", str);
    //NULL VALUE IN JAVA IS EXPRESSED BY "\0"
    // Other example
    // String target = new String(new char[13]).replace('\0', '0');
    // System.out.print(target);

    return repeated;
    }

  String first3 = str.substring(0,3);
  for(int i=0; i<n; i++){
      resultString += first3;
    }
    return resultString;
}

public static void main(String[] args){
  System.out.println(frontTimes("Hi", 1));
  System.out.println(frontTimes("Hi", 2));
  System.out.println(frontTimes("ABC", 4));
  }
}

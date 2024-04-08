// Given a string and a non-negative int n, return a larger string that is n copies of the original string.
//
// stringTimes("Hi", 2) → "HiHi"
// stringTimes("Hi", 3) → "HiHiHi"
// stringTimes("Hi", 1) → "Hi"
public class StringTimes{
public static String stringTimes(String str, int n) {
  String str_modified = "";
  for(int i=0; i<n;i++){
    str_modified+=str;
  }
  return str_modified;
}

public static void main(String[] args){
  System.out.println(stringTimes("Hi", 1));
  System.out.println(stringTimes("Hi", 3));
  System.out.println(stringTimes("Hi", 2));
  }
}

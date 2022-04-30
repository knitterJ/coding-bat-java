// Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
//
// stringX("xxHxix") → "xHix"
// stringX("abxxxcd") → "abcd"
// stringX("xabxxxcdx") → "xabcdx"
 import java.util.Arrays;
public class StringX {

  public static String stringX(String str) {

    // int[][] array3 = {1, 2, 3}, {0}, {1, 2, 3, 4, 5};
    int[][] array4 = new int[2][];
    // int[][] array2 = new array() {{1, 2, 3}, {}, {1, 2, 3, 4, 5}};
    int[][] array1 = {{1, 2, 3}, {}, {1, 2, 3, 4, 5}};
    int[] array = new int[] {3, 4, 2, 1};
    Arrays.sort(array);
    System.out.println(Arrays.toString(array));
    int[] array2 = {1, 2, 3, 4};
    System.out.println(Arrays.toString(array));
    int size = 4;
int[] testArr = new int [size];
Arrays.fill(testArr, 1);
System.out.println(Arrays.toString(testArr));


    if (str.length() > 1) {
      char firstChar = str.charAt(0);
      char secondChar = str.charAt(str.length() - 1);

      //Remember that String is immutable and totally new object needs to be created
      String theMiddleScrapedOut = str.substring(1, str.length() - 1).replace("x", "");
      return firstChar + theMiddleScrapedOut + secondChar;
    } else return str;
  }

  public static void main(String[] args) {
    System.out.println(stringX("xabxxxcdx"));
    // System.out.println(stringX("abxxxcd"));
    // System.out.println(stringX("Hxix"));
    // System.out.println(stringX("x"));
    // System.out.println(stringX("xx"));
    // System.out.println(stringX(""));
  }
}

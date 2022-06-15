// Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
//
// conCat("abc", "cat") → "abcat"
// conCat("dog", "cat") → "dogcat"
// conCat("abc", "") → "abc"

public class ConCat {

  public static String conCat(String a, String b) {

    if (a.length() == 0) {
      return b;
    }
    if (b.length() == 0) {
      return a;
    }

    String LastInA = a.substring(a.length() - 1);
    String AMinusLast = a.substring(0, a.length() - 1);
    String FirstInB = b.substring(0, 1);

    //Don't forget that String is compared always with EQUALS
    if (LastInA.equals(FirstInB)) {
      return (AMinusLast + b);
    } else return a + b;
  }

  public static void main(String[] args) {
    System.out.println(conCat("abc", "cat"));
    System.out.println(conCat("abc", ""));

  }
}

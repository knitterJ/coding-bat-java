// Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.
//
// stringYak("yakpak") → "pak"
// stringYak("pakyak") → "pak"
// stringYak("yak123ya") → "123ya"

public class StringYak {

  public static String stringYak(String str) {

    // The simplest way is to use replaceAll method:
    // str = str.replaceAll("yak", "");
    // return str;

    // But alternatively (and more ambitiously) the following code resolves the problem
    String result = "";

    //FLOW OF THE LOOP BELOW
    //a) FOR loop checks the IF statement,
    //b) if the if statment is fulfilled, program enters if statment
    //c) Condition from the if statement CHANGES THE number of the index inside FOR loop,
    //d) programs goes back to for loop (INSTEAD OF ELSE PART) WHILE INCREASING INDEX ONE MORE TIME BY ONE!!
    // if it's still not clear, check out with your own eyes in the debug mode.
    // Basically program checks all the time if statment, and only if it's not true goes to else part.

    for (int i = 0; i < str.length(); i++) {
      if (i < str.length() - 2 && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
        i += 2;
      } else
        result += str.charAt(i);
    }

    return result;
  }
  public static void main(String[] args) {
    System.out.println(stringYak("yakpak"));
    System.out.println(stringYak("HiyakHi"));
    System.out.println(stringYak("yakxxxyak"));
    System.out.println(stringYak("xxxyakyyyakzzz"));
  }
}

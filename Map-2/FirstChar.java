// Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.
//
// firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
// firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
// firstChar([]) → {}

import java.util.Map;
import java.util.*;

public class FirstChar {
public static Map<String, String> firstChar(String[] strings) {
  Map<String, String> result = new HashMap<String, String>();
  return result;
}

public static void main(String[] args) {
  String[] testArray = {"a","b","a","b"};
  System.out.println(firstChar(testArray));
}

}

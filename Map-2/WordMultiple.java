// Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array.
//
// wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
// wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
// wordMultiple(["c", "c", "c", "c"]) → {"c": true}

import java.util.Map;
import java.util.*;
public class WordMultiple {

public static Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String, Boolean> wordmultiple = new HashMap<>();
  for (String word : strings) {
      if (wordmultiple.containsKey(word)) {
          wordmultiple.put(word, true);
      } else {
          wordmultiple.put(word, false);
      }
  }
  return wordmultiple;
}

public static void main(String[] args) {
  String[] testArray = {"a","b","a","b"};
  String[] testArray2 = {"this", "and", "this"};

  System.out.println(wordMultiple(testArray));
  System.out.println(wordMultiple(testArray2));
}

}

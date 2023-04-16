WordMultiple// Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array.
//
// wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
// wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
// wordMultiple(["c", "c", "c", "c"]) → {"c": true}

import java.util.Map;
import java.util.*;
public class WordCount {

public static Map<String, Integer> wordMultiple(String[] strings) {
    Map<String, Integer> wordMultiple = new HashMap<>();
  
}



public static void main(String[] args) {
  String[] testArray = {"a","b","a","b"};
  System.out.println(wordMultiple(testArray));
}

}

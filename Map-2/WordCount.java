// The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the number of times that string appears in the array.
//
// wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
// wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
// wordCount(["c", "c", "c", "c"]) → {"c": 4}

import java.util.Map;
import java.util.*;
public class WordCount {

public static Map<String, Integer> wordCount(String[] strings) {
    Map<String, Integer> wordCount = new HashMap<>();
    for (String word : strings) {
        if (wordCount.containsKey(word)) {
            wordCount.put(word, wordCount.get(word) + 1);
        } else {
            wordCount.put(word, 1);
        }
    }
    return wordCount;
}



public static void main(String[] args) {
  String[] testArray = {"a","b","a","b"};
  System.out.println(wordCount(testArray));
}

}

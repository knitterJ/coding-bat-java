// Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, and the value is that string's length.
//
// wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
// wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
// wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
import java.util.Map;
import java.util.*;

public class WordLen {

public static Map<String, Integer> wordLen(String[] strings) {
  Map<String, Integer> mapCount = new HashMap<>();
  for(String s:strings){
    mapCount.put(s, s.length());
  }
  return mapCount;
}

public static void main(String[] args) {
  String[] testArray = {"aaaa","b","aa","bbb"};
  System.out.println(wordLen(testArray));
}

}

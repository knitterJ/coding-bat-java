//
// Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its first character as a key with its last character as the value.
//
// pairs(["code", "bug"]) → {"b": "g", "c": "e"}
// pairs(["man", "moon", "main"]) → {"m": "n"}
// pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}

import java.util.Map;
import java.util.*;

public class Pairs {

public static Map<String, String> pairs(String[] strings) {
  Map<String, String> map = new HashMap<>();
 for (String str : strings) {
     if (str.length() > 0) {
         String key = str.substring(0, 1);
         String value = str.substring(str.length() - 1);
         map.put(key, value);
     }
 }
 return map;
}

public static void main(String[] args) {
  String[] testArray = {"ab","ba","aaacb","bx"};
  String[] testArray2 = {"apple", "banana", "tea", "coffee"};
  System.out.println(pairs(testArray2));
}


}

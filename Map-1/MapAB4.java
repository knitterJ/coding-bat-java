// Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then set "c" to have the longer value. If the values exist and have the same length, change them both to the empty string in the map.
//
// mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
// mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
// mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}

import java.util.*;
public class MapAB4 {

  public static Map < String, String > mapAB4(Map < String, String > map) {
    Map < String, String > copy = new HashMap < String, String > ();
    copy.putAll(map);
    if (copy.get("a") == null || copy.get("b") == null) {
      return copy;
    }
    String aVal = copy.get("a");
    String bVal = copy.get("b");
    if (aVal.length() == bVal.length()) {
      copy.put("a", "");
      copy.put("b", "");
    } else if (aVal.length() > bVal.length()) {
      copy.put("c", aVal);
    } else copy.put("c", bVal);
    return copy;
  }

  public static void main(String[] args) {
    Map < String, String > aLonger = Map.of(
      "a", "aaa",
      "b", "bb",
      "c", "cake"
    );
    Map < String, String > equalLengthAB = Map.of(
      "a", "aaa",
      "b", "bbb",
      "c", "cake"
    );
    Map < String, String > noA = Map.of(
      "b", "bbb",
      "c", "cake"
    );
    System.out.println(mapAB4(aLonger));
    System.out.println(mapAB4(equalLengthAB));
    System.out.println(mapAB4(noA));
  }
}

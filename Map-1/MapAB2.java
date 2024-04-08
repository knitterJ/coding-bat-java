// Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both.
//
// mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
// mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
// mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}

import java.util.Map;
import java.util.*;
public class MapAB2 {

  public static Map < String, String > mapAB2(Map < String, String > map) {
    Map < String, String > copy = new HashMap < String, String > ();
    copy.putAll(map);
    if (copy.containsKey("a") && copy.containsKey("b") && copy.get("a").equals(copy.get("b"))) {
      // "==" wouldn't work!
      // "==" is a reference comparison, i.e. whether both objects point to the same memory location.
      //".equals()" evaluates to the comparison of values in the objects. It will only compare what is written, no more, no less.
      copy.remove("a");
      copy.remove("b");
    }
    return copy;
  }

  public static void main(String[] args) {

    Map < String, String > animalSounds = Map.of(
      "a", "aaa",
      "b", "bbb",
      "c", "ccc"
    );
    Map < String, String > toRemove = Map.of(
      "a", "aaa",
      "b", "aaa",
      "c", "cake"
    );
    System.out.println(mapAB2(animalSounds));
    System.out.println(mapAB2(toRemove));
  }
}

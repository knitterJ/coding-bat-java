// Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.
//
// mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
// mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
// mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}

import java.util.Map;
import java.util.*;

public class MapAB3 {

  public static Map < String, String > mapAB3(Map < String, String > map) {
    Map < String, String > copy = new HashMap < String, String > ();
    copy.putAll(map);

    // if both keys don't exist, leave the map, as it is
     if(copy.get("a") == null && copy.get("b") == null){
      return copy;
    }
    //In other case, if "b" exists and "a" doesn't, set "a" to have the same value as "b"
    if(copy.get("a") == null){
      copy.put("a", copy.get("b"));
    }
    if(copy.get("b") == null){
      copy.put("b", copy.get("a"));
    }
    return copy;
  }

  public static void main(String[] args) {
    Map < String, String > noB = Map.of(
      "a", "aaa",
      "c", "ccc"
    );
    Map < String, String > onlyC = Map.of(
      "c", "cake"
    );
    Map < String, String > bothBA = Map.of(
      "a", "aaa",
      "b", "bbb",
      "c", "cake"
    );
    System.out.println(mapAB3(noB));
    System.out.println(mapAB3(onlyC));
    System.out.println(mapAB3(bothBA));
  }
}

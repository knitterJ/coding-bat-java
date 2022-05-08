// Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys. If both keys are present, append their 2 string values together and store the result under the key "ab".
//
// mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
// mapAB({"a": "Hi"}) → {"a": "Hi"}
// mapAB({"b": "There"}) → {"b": "There"}

import java.util.Map;
import java.util.*;
public class MapAB {
public static Map<String, String> mapAB(Map<String, String> map) {
  Map<String, String> copy = new HashMap<String, String>();
  copy.putAll(map);
  if (map.containsKey("a") && map.containsKey("b")) {
    copy.put("ab" , map.get("a") + map.get("b"));
  }
  return copy;
}

  public static void main(String[] args) {

    // In Java, only awful ways of map initialization exist
    Map<String,String> animalSounds = Map.of(
        "a"  , "aaa" ,
        "b"  , "bbb" ,
        "c" , "ccc"
    );
    Map<String,String> onlyB = Map.of(
        "b"  , "bbb"
    );
      System.out.println(mapAB(animalSounds));
      System.out.println(mapAB(onlyB));
  }
}

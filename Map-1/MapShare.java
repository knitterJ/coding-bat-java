// Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.
//
// mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
// mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
// mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}

import java.util.Map;
import java.util.*;

public class MapShare{


  public static Map<String, String> mapShare(Map<String, String> map) {
    // Workaround to immutability of the HashMap
    Map<String, String> copy = new HashMap<String, String>();
    copy.putAll(map);
    if(copy.containsKey("a")){
    copy.put("b", map.get("a"));
    }
    copy.remove("c");
    return copy;
  }

  public static void main(String[] args) {

    // In Java, only awful ways of map initialization exist
    Map<String,String> animalSounds = Map.of(
        "a"  , "aaa" ,
        "b"  , "bbb" ,
        "c" , "ccc"
    );
      System.out.println(mapShare(animalSounds));
  }
}

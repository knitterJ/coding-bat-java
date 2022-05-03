// Modify and return the given map.
// If the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.

// mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}

import java.util.Map;
import java.util.*;

public class MapBully{

  public static Map<String, String> mapBully(Map<String, String> map) {

    // Workaround to immutability of the HashMap
    Map<String, String> copy = new HashMap<String, String>();
    copy.putAll(map);

    if(map.containsKey("a")){
      //In the maps, don't use = operator to assign the value.
      //The order is important in this case
      copy.put("b", map.get("a"));
      copy.put("a", "");
    }
    return copy;
  }

    public static void main(String[] args) {

      // In Java, only awful ways of map initialization exist
      Map<String,String> animalSounds = Map.of(
          "a"  , "candy" ,   // key , value
          "b"  , "carrot" ,   // key , value
          "c" , "chirp" ,   // key , value
          "d" , "ouch" 
      );

      Map<String, String> singletonMap = Map.of("a", "value", "b", "value2", "c", "meh");

        System.out.println(mapBully(animalSounds));
        System.out.println(mapBully(singletonMap));
    }
}

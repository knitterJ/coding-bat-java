// Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream" has a value, set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value to "nuts".
//
// topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
// topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
// topping2({"yogurt": "salt"}) → {"yogurt": "salt"}

import java.util.*;

public class Topping2{


  public static Map<String, String> topping2(Map<String, String> map) {
      // Workaround to immutability of the Map
      Map<String, String> copy = new HashMap<String, String>();
      copy.putAll(map);
      if(map.containsKey("ice cream")){
        copy.put("yogurt", map.get("ice cream"));
      }
      if(map.containsKey("spinach")){
        copy.put("spinach", "nuts");
      } return copy;
    }

  public static void main(String[] args) {

    Map<String,String> deserts = Map.of(
        "spinach"  , "dirt" ,
        "ice cream"  , "cherry" ,
        "salad" , "oil"
    );
      System.out.println(topping2(deserts));
  }
}

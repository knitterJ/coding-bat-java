// Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a value, set that as the value for the key "fries". If the key "salad" has a value, set that as the value for the key "spinach".
//
// topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
// topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
// topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}

import java.util.*;
public class Topping3{

  public static Map<String, String> topping3(Map<String, String> map) {
      // Workaround to immutability of the Map
      Map<String, String> copy = new HashMap<String, String>();
      copy.putAll(map);
      if(map.containsKey("potato")){
        copy.put("fries", map.get("potato"));
      }
       if(map.containsKey("salad")){
        copy.put("spinach", map.get("salad"));
      } return copy;
    }

  public static void main(String[] args) {

    Map<String,String> snacks = Map.of(
        "potato"  , "ketchup" ,
        "fries"  , "salt" ,
        "salad" , "oil"
    );
      System.out.println(topping3(snacks));
  }
}

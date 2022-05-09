// Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present, set its value to "cherry". In all cases, set the key "bread" to have the value "butter".
//
// topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
// topping1({}) → {"bread": "butter"}
// topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}

import java.util.*;

public class Topping1{


  public static Map<String, String> topping1(Map<String, String> map) {
      // Workaround to immutability of the Map
      Map<String, String> copy = new HashMap<String, String>();
      copy.putAll(map);
    if(map.containsKey("ice cream")){
      copy.put("ice cream", "cherry");
    }
    copy.put("bread","butter");
    return copy;
  }


  public static void main(String[] args) {

    // In Java, only awful ways of map initialization exist
    Map<String,String> animalSounds = Map.of(
        "ice cream"  , "peanuts" ,
        "bread"  , "dirt" ,
        "salad" , "oil"
    );
    Map<String,String> empty = Map.of(

    );
      System.out.println(topping1(animalSounds));
      System.out.println(topping1(empty));
  }
}

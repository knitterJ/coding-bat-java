import java.util.*;

//Reuse this code if you want to rotate array by numbersOfRotations times;
/*
public static void leftRotate(int[] nums, int numbersOfRotations){
 for (int i = 0; i < numbersOfRotations; i++) {
     rotateLeft3(nums);
   }
*/ }

// Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
//
// rotateLeft3([1, 2, 3]) → [2, 3, 1]
// rotateLeft3([5, 11, 9]) → [11, 9, 5]
// rotateLeft3([7, 0, 0]) → [0, 0, 7]

public class RotateLeft3 {

  public static int[] rotateLeft3(int[] nums) {
    int[] reversed = new int[nums.length];
      reversed[nums.length-1] = nums[0];
      for (int i=0; i<nums.length-1; i++) {
        reversed[i] = nums[i+1];
      }
      return reversed;
  }

  public static void main(String[] args) {
    int[] numbers = new int[]{13, 14, 15};
    int[] myArray2 = {13, 14, 15, 6};
    System.out.println(Arrays.toString(rotateLeft3(numbers)));
    System.out.println(Arrays.toString(rotateLeft3(myArray2)));
  }
}

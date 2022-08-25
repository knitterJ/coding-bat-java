import java.util.*;

// Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.
//
// frontPiece([1, 2, 3]) → [1, 2]
// frontPiece([1, 2]) → [1, 2]
// frontPiece([1]) → [1]

public class FrontPiece {

  public static int[] frontPiece(int[] nums) {
    if(nums.length < 2){
      return nums;
    } else return new int[] {nums[0], nums[1]};
  }


  public static void main(String[] args) {
    int[] numbers = new int[]{4,5};
    int[] numbers2 = new int[]{4,2,2};
    System.out.println(Arrays.toString(frontPiece(numbers)));
    System.out.println(Arrays.toString(frontPiece(numbers2)));
  }
}

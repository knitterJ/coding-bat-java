import java.util.*;

// Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.
//
// makeMiddle([1, 2, 3, 4]) → [2, 3]
// makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
// makeMiddle([1, 2]) → [1, 2]

public class MakeMiddle {

  public static int[] makeMiddle(int[] nums) {
    int[] resultArray = {nums[nums.length/2 -1], nums[nums.length/2]};
    return resultArray;
  }

  public static void main(String[] args) {
    int[] numbers = new int[]{13, 14, 15, 16};
    int[] myArray2 = new int[]{13, 6, 2, 4};
    System.out.println(Arrays.toString(makeMiddle(numbers)));
    System.out.println(Arrays.toString(makeMiddle(myArray2)));
  }

}

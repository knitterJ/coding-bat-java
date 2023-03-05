import java.util.*;
// Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.
//
// midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
// midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
// midThree([1, 2, 3]) → [1, 2, 3]

public class MidThree {

  public static int[] midThree(int[] nums) {
    int[] midThreeNums = new int[]{nums[nums.length/2-1], nums[nums.length/2], nums[nums.length/2+1]};
    return midThreeNums;
  }


  public static void main(String[] args) {
    int[] myArray = {13, 14, 15};
    int[] myArray2 = {13, 14, 15, 6, 7};
    int[] myArray3 = {101, 103, 105, 107, 109, 111, 113};
    System.out.println(Arrays.toString(midThree(myArray)));
    System.out.println(Arrays.toString(midThree(myArray2)));
    System.out.println(Arrays.toString(midThree(myArray3)));
  }
}

import java.util.*;
// Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
//
// makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
// makeLast([1, 2]) → [0, 0, 0, 2]
// makeLast([3]) → [0, 3]

public class MakeLast {

  public static int[] makeLast(int[] nums) {
        int twoTimesLength = 2*nums.length;
        int [] numsZeroes = new int [ twoTimesLength ] ;
        numsZeroes[numsZeroes.length-1] = nums[nums.length-1];
        return numsZeroes;
  }


  public static void main(String[] args) {
    int[] myArray = {1, 2, 3};
    int[] myArray2 = {1, 2};
    int[] myArray3 = {7};
    System.out.println(Arrays.toString(makeLast(myArray)));
    System.out.println(Arrays.toString(makeLast(myArray2)));
    System.out.println(Arrays.toString(makeLast(myArray3)));
  }
}

import java.util.*;
// Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
//
// reverse3([1, 2, 3]) → [3, 2, 1]
// reverse3([5, 11, 9]) → [9, 11, 5]
// reverse3([7, 0, 0]) → [0, 0, 7]

// How to reverse in place an array:
// Reverse zero element with the last element, first element with the one before the last and so on ..
// reverse until size/2
// nums[i] = nums[size - 1 - i]
// nums[size - 1 - i] = ???

public class Reverse3 {

  public static int[] reverse3(int[] nums) {
      int tempNum;
      for (int i=0; i < nums.length / 2; i++) {
        tempNum = nums[i];

        //zero element of the new configuration should be the last element of the old one
        nums[i] = nums[nums.length - i - 1];

        //Without storing temporarily zero element, we'd create array with the mirrored elements [100, 6, 15, 6, 100]
        nums[nums.length - i - 1] = tempNum;
      }
      return nums;
  }

  public static void main(String[] args) {
    int[] numbers = new int[]{13, 14, 15};
    int[] myArray2 = {13, 14, 15, 6, 100};
    System.out.println(Arrays.toString(reverse3(numbers)));
    System.out.println(Arrays.toString(reverse3(myArray2)));
  }

}

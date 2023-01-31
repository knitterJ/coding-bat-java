import java.util.*;

// Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.
//
// maxEnd3([1, 2, 3]) → [3, 3, 3]
// maxEnd3([11, 5, 9]) → [11, 11, 11]
// maxEnd3([2, 11, 3]) → [3, 3, 3]

public class MaxEnd3 {

  public static int[] maxEnd3(int[] nums) {
    int max_num = Math.max(nums[0], nums[2]);
    int[] result = new int[3];
    Arrays.fill(result, max_num);
    return result;
  }

  public static void main(String[] args) {
    int[] numbers = new int[]{13, 14, 1};
    int[] numbers2 = new int[]{1, 2, 15};
    System.out.println(Arrays.toString(maxEnd3(numbers)));
    System.out.println(Arrays.toString(maxEnd3(numbers2)));
  }
}

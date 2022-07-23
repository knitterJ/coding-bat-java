// Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.
//
// swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
// swapEnds([1, 2, 3]) → [3, 2, 1]
// swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]

public class SwapEnds {

  public static int[] swapEnds(int[] nums) {
    int last = nums[nums.length-1];
    nums[nums.length-1] = nums[0];
    nums[0] = last;
    return nums;
  }

  public static void main(String[] args) {
    int[] numbers = new int[]{13, 14, 15};
    int[] numbers3 = new int[]{1, 2   };

    System.out.println(double23(numbers));
    System.out.println(double23(numbers2));
    System.out.println(double23(numbers3));
  }
}

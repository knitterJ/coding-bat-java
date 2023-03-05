import java.util.*;


// Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.
//
// makeEnds([1, 2, 3]) → [1, 3]
// makeEnds([1, 2, 3, 4]) → [1, 4]
// makeEnds([7, 4, 6, 2]) → [7, 2]

public class MakeEnds {

public static int[] makeEnds(int[] nums) {
      return new int[]{nums[0], nums[nums.length - 1]};
}

public static void main(String[] args) {
  int[] numbers = new int[]{13, 14, 15, 16};
  int[] myArray2 = new int[]{13, 6, 2, 4};
  int[] myArray3 = new int[]{13};

  System.out.println(Arrays.toString(makeEnds(numbers)));
  System.out.println(Arrays.toString(makeEnds(myArray2)));
  System.out.println(Arrays.toString(makeEnds(myArray3)));
  }
}

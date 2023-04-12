import java.util.*;

// Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.
//
// fix23([1, 2, 3]) → [1, 2, 0]
// fix23([2, 3, 5]) → [2, 0, 5]
// fix23([1, 2, 1]) → [1, 2, 1]

public class Fix23 {

public static int[] fix23(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] == 2 && nums[i+1] == 3) {
            nums[i+1] = 0;
        }
    }
return nums;
}

  public static void main(String[] args) {
    int[] numbers = new int[]{13, 14};
    int[] numbers2 = new int[]{1, 2, 3};
    int[] numbers3 = new int[]{1, 2, 14, 3, 13, 2, 3};

    // compare two arrays "numbers" and "numbers2"
    System.out.println(Arrays.toString(fix23(numbers)));
    System.out.println(Arrays.toString(fix23(numbers2)));
    System.out.println(Arrays.toString(fix23(numbers3)));
  }
}

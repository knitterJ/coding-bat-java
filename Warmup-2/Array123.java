// Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
//
// arrayFront9([1, 2, 9, 3, 4]) → true
// arrayFront9([1, 2, 3, 4, 9]) → false
// arrayFront9([1, 2, 3, 4, 5]) → false

public class Array123 {

  public static boolean array123(int[] nums) {
      if(nums.length < 3) return false;

      //for the array that consists of 3 elements only, the loop iterates two times; On the second iteration index[i+2] goes out of bound, but such fact doesn't mean termination of the program
      for (int i=0; i < nums.length-1; i++) {
        if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) return true;
        // System.out.println(i);
        // System.out.println(i+1);
        // System.out.println(i+2);
      }
      return false;
  }


public static void main(String[] args){

  //Remember that arrays are passed by reference in Java! You need to create an array object first.
  int[] arr = new int[]{2,4,6};
  System.out.println(array123(new int[]{1, 2, 9, 3, 4}));
  System.out.println(array123(arr));
  }
}

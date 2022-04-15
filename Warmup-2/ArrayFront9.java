// Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
//
// arrayFront9([1, 2, 9, 3, 4]) → true
// arrayFront9([1, 2, 3, 4, 9]) → false
// arrayFront9([1, 2, 3, 4, 5]) → false

public class ArrayFront9{
  public static boolean arrayFront9(int[] nums) {
    int searchUntil = nums.length;
    if (searchUntil > 4) searchUntil = 4;

    for (int i=0; i < searchUntil; i++) {
      if (nums[i] == 9) return true;
    }

    return false;
  }

public static void main(String[] args){

  //Remember that arrays are passed by reference in Java! You need to create an array object first.
  int[] arr = new int[]{9,1,2,9,9};
  System.out.println(arrayFront9(new int[]{1, 2, 9, 3, 4}));
  System.out.println(arrayFront9(arr));
  }
}

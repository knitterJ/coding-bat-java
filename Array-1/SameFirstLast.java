// Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
//
// sameFirstLast([1, 2, 3]) → false
// sameFirstLast([1, 2, 3, 1]) → true
// sameFirstLast([1, 2, 1]) → true

public class SameFirstLast {

  public static boolean sameFirstLast(int[] nums) {
    if(nums.length >= 1 && nums[0] == nums[nums.length-1] ){
      return true;
    } else return false;
  }


  public static void main(String[] args) {
    int[] myArray = {1, 2, 3};
    int[] myArray2 = {1, 2, 1};
    int[] myArray3 = {7};
    System.out.println(sameFirstLast(myArray));
    System.out.println(sameFirstLast(myArray2));
    System.out.println(sameFirstLast(myArray3));
  }
}

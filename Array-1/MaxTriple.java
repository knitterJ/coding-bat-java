import java.util.*;

// Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.
//
// maxTriple([1, 2, 3]) → 3
// maxTriple([1, 5, 3]) → 5
// maxTriple([5, 2, 3]) → 5

public class MaxTriple {

  public static int maxTriple(int[] nums) {
    int[] triple = new int[]{nums[0],nums[nums.length/2], nums[nums.length-1]};
    Arrays.sort(triple);
    return triple[triple.length-1];
  }

  public static void main(String[] args) {
    int[] myArray = {13, 14, 15};
    int[] myArray2 = {13, 14, 15, 6, 7};
    int[] myArray3 = {101, 103, 105, 107, 109, 111, 113};
    System.out.println(maxTriple(myArray));
    System.out.println(maxTriple(myArray2));
    System.out.println(maxTriple(myArray3));
  }
}

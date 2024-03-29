//2023-03-07 We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
//Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
//
// unlucky1([1, 3, 4, 5]) → true
// unlucky1([2, 1, 3, 4, 5]) → true
// unlucky1([1, 1, 1]) → false
//

public class Unlucky1 {

  public static boolean unlucky1(int[] nums) {
         if (nums.length < 2) {
          return false;
      }
      return ((nums[0] == 1 && nums[1] == 3) ||
              (nums[1] == 1 && nums[2] == 3) ||
              (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3));
    }

  public static void main(String[] args) {
    int[] numbers = new int[]{1, 3, 4, 5};
    int[] numbers2 = new int[]{1};
    int[] numbers3 = new int[]{1, 1, 1, 3, 1};
    int[] numbers4 = new int[]{1, 1, 1, 1, 3};
    System.out.println(unlucky1(numbers)); // true
    System.out.println(unlucky1(numbers2)); // false
    System.out.println(unlucky1(numbers3)); // false
    System.out.println(unlucky1(numbers4)); // true 
  }
}

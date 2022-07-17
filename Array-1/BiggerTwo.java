import java.util.*;

// Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.
//
// biggerTwo([1, 2], [3, 4]) → [3, 4]
// biggerTwo([3, 4], [1, 2]) → [3, 4]
// biggerTwo([1, 1], [1, 2]) → [1, 2]

public class BiggerTwo {

  public static int[] biggerTwo(int[] a, int[] b) {
    int sum1 = 0;
    int sum2 = 0;
    for(int i = 0 ; i < a.length-1; i++){
      sum1 = a[i] + a[i+1];
      sum2 = b[i] + b[i+1];
    } if(sum1 > sum2 || sum1==sum2){
      return a;
    } return b;
  }

  public static void main(String[] args) {
    int[] numbers = new int[]{13, 14};
    int[] numbers2 = new int[]{1, 2};
    int[] numbers3 = new int[]{1, 3};
    int[] numbers4 = new int[]{2, 2};
    System.out.println(Arrays.toString(biggerTwo(numbers, numbers2)));
    System.out.println(Arrays.toString(biggerTwo(numbers3, numbers4)));
  }
}

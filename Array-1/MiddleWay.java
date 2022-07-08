import java.util.*;

// Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
//
// middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
// middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
// middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]

public class MiddleWay {

  public static int[] middleWay(int[] a, int[] b) {
    int[] myArray3 = {a[a.length/2], b[b.length/2]};
    return myArray3;
  }

  public static void main(String[] args) {
    int[] numbers = new int[]{13, 14, 15};
    int[] myArray2 = new int[]{13, 6, 2};
    System.out.println(Arrays.toString(middleWay(numbers, myArray2)));
  }

}

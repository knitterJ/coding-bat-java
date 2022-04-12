// Given a string and a non-negative int n, return a larger string that is n copies of the original string.
//
// arrayCount9("Hi", 2) → "HiHi"
// arrayCount9("Hi", 3) → "HiHiHi"
// arrayCount9("Hi", 1) → "Hi"
public class ArrayCount9{

  public static int arrayCount9(int[] nums) {
    int counter = 0;

    //The enhanced for loop was introduced in Java 5 as a simpler way to iterate through all the elements of a Collection. It can also be used for arrays, as in the above example, but this is not the original purpose.
    for(int a: nums){
      if(a == 9){
        counter++;
      }
    }
    return counter;
  }


public static void main(String[] args){
  //Arrays are passed by reference in Java! You need to create an array object first.
  int[] arr = new int[]{9,1,2,9,9};
  System.out.println(arrayCount9(arr));
  //or this way...
  System.out.println(arrayCount9(new int[] {9,12,15,99}));
  //or
  int[] arr3 = {1,2};
  System.out.println(arrayCount9(arr3));
  }
}

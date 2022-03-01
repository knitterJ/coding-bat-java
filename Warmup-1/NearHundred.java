// import  org.junit.Test;
// import  org.junit.Assert.assertEquals;
import java.util.Arrays;
public class NearHundred {

  public static int nearHundredOpCheck(int n) {
      return Math.abs(200 - n);
  };
  public static boolean nearHundred(int n) {
    return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
  };
public static void main(String[] args){
  System.out.println(nearHundredOpCheck(-209));
  System.out.println(nearHundred(-209));
  }
}

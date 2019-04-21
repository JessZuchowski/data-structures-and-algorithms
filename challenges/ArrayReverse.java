import java.util.Arrays;

public class ArrayReverse {
  public static void main(String[] args) {
    //3 test arrays
    int[] originalArray = {
      1, 2, 3, 4, 5, 6};
    // int[] originalArray = {
    //   2, 4, 6, 8};
    // int[] originalArray = {
    //   7, 8, 9, 10, 11, 12, 13};
      reverseArray(originalArray);
  }
  public static int[] reverseArray(int[] originalArray) {
    int temp;
    for (int i = 0; i < originalArray.length/2; i++) {
      temp = originalArray[i];
      originalArray[i] = originalArray[originalArray.length - i - 1];
      originalArray[originalArray.length - i - 1] = temp;
    }
    System.out.println(Arrays.toString(originalArray));
    return originalArray;
  }
}
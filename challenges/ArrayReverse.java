import java.util.Arrays;

public class ArrayReverse {
  public static void main(String[] args) {
    int[] originalArray = {
      1, 2, 3, 4, 5, 6};
      reverseArray(originalArray);
  }
  public static int[] reverseArray(int[] originalArray) {
    int temp;
    for (int i = 0; i < originalArray.length/2; i++) {
      temp = originalArray[i];
      originalArray[i] = originalArray[originalArray.length - i - 1];
      originalArray[originalArray.length - i - 1] = temp;
    }
    System.out.println(originalArray);
    return originalArray;
  }
}
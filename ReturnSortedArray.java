import java.util.Arrays;
public class ReturnSortedArray{
  static int[] sortedArray(int[] arr){
    Arrays.sort(arr);
    return arr;
  }
  public static void main(String[] args){
    int[] numbers = {42,10,5,90,15};
    int[] sorted = sortedArray(numbers);
    System.out.println("sorted array: ");
    for(int num : sorted){
        System.out.println(num + " ");
    }
  }
}
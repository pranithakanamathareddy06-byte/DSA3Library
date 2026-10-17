import java.util.Arrays;
class SecondSmalletAndLargestArrayHA4{
    public static void main(String[] args){
        int[] arr = {2,4,6,10,15,20};
        Arrays.sort(arr);
        int SecondSmallest = arr[1];
        int SecondLargest = arr[arr.length - 2];
        System.out.println("Second Smallest is: " + SecondSmallest);
        System.out.println("Second Largest is: " + SecondLargest);


    }
}
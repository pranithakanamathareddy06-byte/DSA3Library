public class Array1{
    public static void main(String[] args){
        //  int[] arr = {2, 4, 6, 8, 10};
        // int start = 0;
        // int end = arr.length - 1;
        //  while(start < end){
        // int temp = arr[start];
        // arr[start] = arr[end];
        // arr[end] = temp;                                  array in the reverse order without using another array
        // start++;
        // end--;
        //  }
        //  System.out.println("Array in reverse order:");
        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i] + " ");
        // }


// import java.util.Scanner;
// public class CountElement {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int[] arr = {1, 2, 3, 2, 4, 2, 5}; // example array

//         System.out.print("Enter the number to count: ");       to count no of times a particular element appears in the array
//         int num = sc.nextInt();

//         int count = 0;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == num) {
//                 count++;
//             }
//         }

//         System.out.println(num + " appears " + count + " times in the array.");
//     }
// }


        // int[] original = {2,5,9,1,7};
        // int[] copy = new int[original.length];
        // for(int i = 0; i < original.length; i++){
        //     copy[i] = original[i];
        // }                                                      (to copy elements from one array to the another array)
        // System.out.println("Elements in the copied array:");
        // for(int i = 0; i < copy.length; i++){
        //     System.out.println(copy[i] + " ");
        // }


        // boolean isSorted = true;
        // for(int i = 0; i < arr.length - 1; i++){
        //     if(arr[i] > arr[i + 1]){
        //         isSorted = false;
        //         break;
                                                        //    to check whether in ascending or descending order we use isSorted
        //     }
        // }
        // if(isSorted){
        //     System.out.println("array is sorted in the ascending order");
        // }
        // else{
        //     System.out.println("array is not sorted in the ascending order");

        // }



        // int firstLargest = Integer.MIN_VALUE;
        // int secondLargest = Integer.MIN_VALUE;
        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] > firstLargest){
        //         firstLargest = secondLargest;
        //         firstLargest= arr[i];
        //     }
        //     else if(arr[i] > secondLargest && arr[i] != firstLargest){
        //         secondLargest = arr[i];
        //     }
        // }
        // System.out.println("The largest element is: " + firstLargest);
        // System.out.println("The second largest element is: " + secondLargest);
        
    }
}
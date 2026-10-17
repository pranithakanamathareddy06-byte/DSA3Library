public class Array2{
    public static void main(String[] args){
        // int[] arr = {0, 1, 0, 3, 12};
        // int n = arr.length;
        // int count = 0;
        // for (int i = 0; i < n; i++) {
        //     if (arr[i] != 0) {
        //         arr[count] = arr[i];                 to keep the zeroes at the end and the remaining numbers in the beggining
        //         count++;
        //     }
        // }
        // while (count < n) {
        //     arr[count] = 0;
        //     count++;
        // }
        // System.out.print("Array after moving zeroes: ");
        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }


        // int[] arr = {1, 2, 3, 2, 4, 1, 5};

        // System.out.println("Duplicate elements in the array:"); to print the repeted elements in the array
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = i + 1; j < arr.length; j++){
        //         if(arr[i] == arr[j]){
        //             System.out.println(arr[i]);
        //             break;
        //         }
        //     }
        // }

        int[] arr = {1,4,5,2,3};
        int target = 6;
         System.out.println("Pairs whose sum is " + target + ": "); 
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("("+ arr[i] + "," + arr[j] +")");
                }
            }
        }
    }
}

    
//     public static void main(String[] args){
//         int[] arr = {2,3,4,5,6};
//         int k = 2;
//         int n = arr.length;
//         k = k % n;
//          reverse(arr,k,n - 1);
//          reverse(arr,0,k - 1);
//          reverse(arr,0,n - 1);
//          System.out.println("arrays after the rotation:"); this part is for the rotation
//          for(int i = 0; i < arr.length; i++){
//             System.out.println(arr[i] + " ");
//          }
//     }
//     static void reverse(int[] arr,int start,int end){
//         while(start < end){
//             int temp = arr[start];
//             arr[start] = arr[end];                           this part is reverse
//             arr[end] = temp;
//             start++;
//             end--;
//    }
// }
// }
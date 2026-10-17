public class SearchingSir{
    public static void main(String[] args){
        int[] arr =  {10,20,30,50,40,60};
//         int key = 50;
//         int found = 0;
// for(int i = 0; i < arr.length; i++){
//         if(arr[i] == key){
//             found = 1;
//             break;
//         }
//     }
//        if(found == 0){
//         System.out.println("value is not found");
//        }
//        else{
//         System.out.println("value is found");
//        }
  

//     int low = 0;
//     int high = arr.length - 1;
//     while(low <= high){
//     int mid = (low + high) / 2;
//     if(arr[mid] == key){
//         System.out.println("key value is found");
//          found = 1;
//          break;
//     }
//     else if(arr[mid] < key){
//         low = mid + 1;
//     }
//     else if(arr[mid] > key){
//         high = mid - 1;
//     }
// }
// if(found == 0){
//     System.out.println("key value is not found");
// }


// for(int i = 0; i < arr.length - 1; i++){
//     for(int j = 0; j < arr.length - i - 1; j++){
//         if(arr[j] > arr[j + 1]){
//         int temp = arr[j];
//         arr[j] = arr[j + 1];
//         arr[j + 1] = temp;
//         }
//     }
// }
// for(int i = 0; i < arr.length; i++){
// System.out.println(arr[i]);
// }


// for(int i = 0; i <= arr.length - 1; i++){
//     int minIndex = i;
//     for(int j = i + 1; j < arr.length; j++){
//         if(arr[j] < arr[minIndex]){
//             minIndex = j;
//         }
//         }
//         int temp = arr[minIndex];
//         arr[minIndex] = arr[i];
//         arr[i] = temp;
//     }
//     for(int num : arr){
//         System.out.print(num + " ");
//     }


for(int i = 0; i < arr.length; i++){
    int key = arr[i];
    int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }

}
 }


     

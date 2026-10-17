public class LargestInArray{
    public static void main(String[] args){
        int[] arr = {23,12,34,54,18};
        int largest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("largest number: " + largest);

    }
}
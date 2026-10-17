import java.util.Scanner;
public class QuickSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    quicksort(arr, 0, n - 1);
    System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void quicksort(int[] arr,int low,int high){
        if(low < high){
            int p = partition(arr,low,high);
            quicksort(arr,low,p - 1);
            quicksort(arr, p + 1, high);
        }
    }
    static int partition(int[] arr,int low,int high){
        int pivot = arr[low];
        int i = low + 1;
        int j = high;
        while(i <= j){
            while(i <= high && arr[i] <= pivot){
                i++;
            }
            while(arr[j] > pivot){
                j--;
            }
            if(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        }
        
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;

        
    }
}



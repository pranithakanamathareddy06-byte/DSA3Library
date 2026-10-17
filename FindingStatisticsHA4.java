import java.util.Arrays;
class FindingStatisticsHA4{
    public static void main(String[] args){
        int[] arr = {1,2,2,3,4,4,4,5};
        double sum = 0;
        for(int num : arr){
            sum += num;
        }
        double mean = sum / arr.length;

        Arrays.sort(arr);
        double median;
        int n = arr.length;
        if(n % 2 != 0){
            median = arr[n / 2];
        }
        else{
            median = (arr[(n - 1) / 2] + arr[n / 2]) / 2.0;
        }

        int mode = arr[0];
        int maxCount = 1;
        int count = 1;
        for(int i = 1; i < arr.length; i++){
        if(arr[i] == arr[i - 1]){
            count++;
        }
        else{
            count = 1;
        }
        if(count > maxCount){
            maxCount = count;
            mode = arr[i];
        }
    }
        System.out.println("Mean = " + mean);
        System.out.println("Median = " + median);
        System.out.println("Mode = " + mode);
  
    }
}
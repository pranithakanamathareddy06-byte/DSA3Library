public class AverageCalculator{
    static double calculateaverage(int [] arr){
        int sum = 0;
        for(int num: arr){

            sum += num;
        }
        return (double) sum / arr.length;

    }
    public static void main(String[] args){
        int[] marks = {80,76,90,98,78};
        double avg = calculateaverage(marks);
        System.out.println("average marks: " + avg);
    }
}
public class ArrayPrinter{
    static void printarray(int[] arr){
        System.out.println("array elements: ");
        for(int num: arr){
            System.out.println(num + " ");
        }
    }
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        printarray(arr);

    }
}
public class ReturnArraySquares{
    static int[] SquareElements(int[] arr){
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length;i++){
            result[i] = arr[i] * arr[i];
        }
        return result;
    }
    public static void main(String[] args){
        int[] input = {2,3,4,5};
        int[] squared = SquareElements(input);
        System.out.println("squared values: ");
        for(int val : squared){
            System.out.println(val + " ");
        }
    }
}
public class ReturnEvenArray{
    static int[] getEvenNumbers(int n){
        int[] temp = new int[n / 2];
        int index = 0;
        for(int i = 2; i <= n; i += 2){
            if(i % 2== 0){
                temp[index] = i;
                index++;
            }
        }
        return temp;
    }
    public static void main(String[] args){
        int[] evens = getEvenNumbers(10);
        System.out.println("Even numbers from 1 to 10: ");
        for(int num : evens){
            System.out.print(num + " ");
        }
    }
}
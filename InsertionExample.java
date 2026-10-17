public class InsertionExample{
    public static void main(String[] args){
        int[] array = {2,4,6,8,10};
        int index = 2;
        int element = 12;
        int[] newArray = new int[array.length + 1];
        for(int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = element;
            for(int i = newArray.length - 1; i > index; i--){
                int temp = newArray[i];
                newArray[i] = newArray[i - 1];
                newArray[i - 1] = temp;
            }
             for (int x : newArray) {
            System.out.print(x + " ");
        }
        int min = newArray[0];
        int max = newArray[0];

        for (int i = 1; i < newArray.length; i++) {
            if (newArray[i] < min) {
                min = newArray[i];
            }
            if (newArray[i] > max) {
                max = newArray[i];
            }
        }
         System.out.println("\nMinimum element: " + min);
        System.out.println("Maximum element: " + max);
    }
}
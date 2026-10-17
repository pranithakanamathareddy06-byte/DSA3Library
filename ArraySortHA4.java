class ArraySortHA4{
        public static void main(String[] args){
        boolean isSorted = true;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i + 1]){
                isSorted = false;
                break;
                                                          
            }
        }
        if(isSorted){
            System.out.println("array is sorted in the ascending order");
        }
        else{
            System.out.println("array is not sorted in the ascending order");

        }
}
}
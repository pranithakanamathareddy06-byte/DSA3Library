class MultiplyMatrixHA5{
    public static void main(String[] args){
        int[][] A = {
            {1,2,3},
            {4,5,6}
        };
        int[][] B = {
            {7,8,9},
            {1,2,3}
        };
        int[][] multiply = new int[2][3];
        for(int i = 0; i <2; i++){
            for(int j = 0; j < 3; j++){
                multiply[i][j] = A[i][j] * B[i][j];
            }
        }
        System.out.println("Matrix multiply result: ");
         for(int i = 0; i <2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(multiply[i][j] + " ");
       }
       System.out.println();
     }
 }
}
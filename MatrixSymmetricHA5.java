class MatrixSymmetricHA5{
    public static void main(String[] args){
        int[][] matrix = {
            {1,2,3},
            {2,4,5},
            {3,5,6}
        };
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean isSymmetric = true;
        if(rows != cols){
            isSymmetric = false;
        }
        else{
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[i].length;j++){
                    if(matrix[i][j] != matrix[j][i]){
                        isSymmetric = false;
                        break;
                    }

                }
                if(!isSymmetric){
                    break;
                }
            }

        }
        if(isSymmetric)
                System.out.println("Matrix is symmetric");
        else
            System.out.println("Matrix is not symmetric");
        



    }
}
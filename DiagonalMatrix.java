public class DiagonalMatrix{
    public static void main(String[] args){
        int[][] matrix = {
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };
        System.out.println("main diagonal elements: ");
        for(int i = 0; i < matrix.length; i++){
            System.out.println(matrix[i][i]);
        }
        }
    }

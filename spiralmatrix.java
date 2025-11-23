public class spiralmatrix {
    public static void printspiral(int matrix[][]){
        int startRow=0;
        int startcol=0;
        int endRow=matrix.length-1;
        int endcol=matrix[0].length-1;
        while(startRow<=endRow && startcol<=endcol){
            //top
            for(int j=startcol;j<=endcol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            //bottom
            for(int j =endcol-1;j>=startcol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1;i>=startRow;i--){
                   if(startcol==endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }
            startcol++;
            startRow++;
            endcol--;
            endRow--;
        }
        System.out.println();
    


    }
    public static int diagonalSum(int matrix[][]){
        int sum=0;
        for(int i =0; i<matrix.length;i++){
            //pd
            sum+=matrix[i][i];
            //sd
            if(i!= matrix.length-1-i)
                sum+= matrix[i][matrix.length-1-i];
        }
        return sum;
    }
    public static boolean staircaseSearch(int matrix[][],int key) {
        int row = 0, col = matrix[0].length-1;
        while (row<matrix.length && col >= 0) {
            if(matrix[row][col]==key){
                System.out.println("found key at("+ row+","+col+")");
                return true;
            }
            else if(key <matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
            
        }
        System.out.println("key not found!");
        return false;

    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        printspiral(matrix);
        System.out.println("Diagonal sum = " + diagonalSum(matrix));
        staircaseSearch(matrix,14);

    }
}

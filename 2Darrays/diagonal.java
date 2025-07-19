public class diagonal {

    public static void diagonals(int matrix[][]){
        int sum1 =0;
        int sum2=0;
        for(int i=0;i<matrix.length;i++){
            sum1 = sum1+matrix[i][i];
            if(i != (matrix.length-(i+1))){
                sum2=sum2+ matrix[i][(matrix.length-(i+1))];
            }
        
        }

        for(int i=0;i<matrix.length;i++){
            
            
        }

        System.out.println("the sum of diagonal :" + (sum1+sum2));

        
    }


    public static void time(int matrix[][],int key){
        int count =0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    count++;
                }
            }
        }
        System.out.println(count);
    }


    public static void sum2(int matrix[][]){
        int sum=0;
        for(int j=0;j<matrix[0].length;j++){
            sum = sum+matrix[1][j];
        }
        System.out.println(sum);
    }

    public static void transpose(int matrix[][]){
        int mat[][]=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                mat[j][i] = matrix[i][j];
            }
        }

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3},
                        {5,9,6},
                        {6,9,10},
                        {6,9,10},
                        };
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        transpose(matrix);

    }
}

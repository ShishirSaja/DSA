public class spiral {

    public static void spiral(int matrix[][]){
        int startR=0;
        int endR=matrix.length-1;
        int startC=0;
        int endC=matrix[0].length-1;

        //top

        while(startC<=endC && startR<=endR){
            //top

            for(int j=startC;j<=endC;j++){
                System.out.print(matrix[startR][j]+" ");
            }

            //right

            for(int i=startR+1;i<=endR;i++){
                System.out.print(matrix[i][endC]+" ");
            }

            //bottom

            for(int j=endC-1;j>=startC;j--){
                if(startR==endR){
                    break;
                }
                System.out.print(matrix[endR][j]+" ");
            }

            //left

            for(int i=endR-1;i>=startR+1;i--){
                if(startC==endC){
                    break;
                }
                System.out.print(matrix[i][startC]+" ");
            }

            startC++;
            startR++;
            endC--;
            endR--;
        }

    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,3,5},
                        {5,6,7,5,6},
                        {8,9,10,4,3},
                        };
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        spiral(matrix);
    }
}

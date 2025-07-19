import java.util.*;
public class large_samll{

    
    

    public static void large(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                largest = Math.max(largest,matrix[i][j]);
            }
        }
        System.out.println("the largest value is :"+largest);
    }


    public static void small(int matrix[][]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                smallest = Math.min(smallest,matrix[i][j]);
            }
        }

        System.out.println("the samllest value is :"+smallest);
    }


    public static void main(String args[]){
        int matrix[][] = new int[3][4];
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        large(matrix);
        small(matrix);



    }
}
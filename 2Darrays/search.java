import javax.swing.text.StyledEditorKit;

public class search {
    public static void earch(int matrix[][],int key){
        int start =0;
        int end=matrix[0].length-1;

        for(int i=0;i<matrix.length;i++){
            if(key<=matrix[i][matrix[0].length-1] && key>=matrix[i][0]){
                while(start<=end){
                    int mid = (start+end)/2;
                    if(key==matrix[i][mid]){
                        System.out.println("the key found at i :"+i+" and j : "+mid);
                        return;
                    }
                    else if(key<matrix[i][mid]){
                        end = mid-1;
                    }else{
                        start=mid+1;
                    }

                }
            }
        }
        System.out.println("the key wasn't found ");
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3},
                        {5,6,7},
                        {8,9,10},
                        };
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        earch(matrix, 88);
    }
}

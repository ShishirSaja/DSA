package sorting;

public class bubble{
    public static void main (String []args){
        int arr[]={4,5,3,2,1};
        bub(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

    public static void bub(int arr[]){
        int temp=0;
        for(int i=arr.length-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}

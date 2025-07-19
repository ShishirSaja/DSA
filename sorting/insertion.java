public class insertion{
    public static void insert(int arr[]){
        int temp =0;
        for(int i=1;i<arr.length;i++){
            int key = i;
            for(int j=i-1;j>=0;j--){
                if(arr[key]<arr[j]){
                    temp = arr[j];
                    arr[j]=arr[key];
                    arr[key]=temp;
                    key =j;

                }
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        insert(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\s");

        }

    }
}
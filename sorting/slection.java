public class slection {
    public static void select(int arr[]){
        int min=Integer.MAX_VALUE;
        int temp =0;
        int key =0;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){

                //find min and it's index
                if(min>arr[j]){
                    min = arr[j];
                    key = j;
                }

            }

            //swap
            temp = arr[i];
            arr[i]=arr[key];
            arr[key]=temp;
            min = Integer.MAX_VALUE;
        }
    }

    public static void main(String []args){
        int arr[]= {5,4,1,3,2};
        select(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\s");
        }

    }
}

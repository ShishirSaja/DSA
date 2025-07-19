

public class desecend {
    public static void bubble(int arr[]){
        int temp =0;

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<((arr.length-1)-i);j++){
                if(arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }

    }

//selection
    public static void selection(int arr[]){
        
        int index =0;
        int temp =0;
        for(int i=arr.length-1;i>0;i--){
            int min = Integer.MAX_VALUE;
            for(int j=0;j<=i;j++){
                if(min>arr[j]){
                    min = arr[j];
                    index = j;
                }
            }
            temp = arr[i];
            arr[i]=arr[index];
            arr[index]=temp;

        }
    }

    //insertion

    public static void insertion(int arr[]){
        int temp=0;
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    // counting

    public static void count(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max, arr[i]);
        }
        int count[]=new int[max+1];

        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;

        }
        int index=0;
        for(int i=count.length-1;i>=0;i--){
            while(count[i]>0){
                arr[index]=i;
                index++;
                count[i]--;
            }
        }
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\s");
        }
    }
    public static void main(String args []){
        int arr[]= {-3,6,2,1,8,7,4,5,3,1};
        count(arr);
        print(arr);


    }
}
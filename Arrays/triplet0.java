public class triplet0 {
    public static void main(String args[]){
        int num[]={-1,0,1,2,-2,-4};
        trip(num);

    }

    public static void trip(int arr[]){
        int k=0;
        int sum=0;
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<=i+3;j++){
                if(j>arr.length-1){
                    j= j-arr.length;
                }
                
                if(j==arr.length-1){
                    k=0;
                }else{
                    k=j+1;
                }

                sum = arr[i]+arr[j]+arr[k];

                if(sum==0){
                    System.out.print("[ "+arr[i]+","+arr[j]+","+arr[k]+" ]\t");
                }


                if(j<i){
                    j=j+arr.length;
                }
            }
        }
    }
    
}

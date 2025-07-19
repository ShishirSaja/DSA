public class binaryTarget {
    public static int asse(int arr[],int tar){
        int start =0;
        int skey = 0;
        int end =0;
        int ekey=0;


        
        for(int i=0;i<arr.length-1;i++){
            System.out.println("dffftu"+arr[i+1]);
            if(arr[i]>arr[i+1]){
                skey=i+1;
                ekey=i;
            }
            
        if(tar>=arr[0]){
            start = 0;
            end=ekey;

        }else{
            start=skey;
            end=arr.length-1;
        }
        }
        while(start<=end){
            int mid = (start+end)/2;
            
            if(arr[mid]==tar){
                return mid;
            }
            else if(tar<mid){
                end = mid-1;

            }else{
                start=mid+1;
            }
        }
        return -1;


        
    }

    public static void main (String args[]){
        int numbers[]={4};
        System.out.println(asse(numbers, 4));

    }
    
}


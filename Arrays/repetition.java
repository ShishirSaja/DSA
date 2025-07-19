public class repetition {
    public static void rep(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("true");
                    
                    
                }
            }
        }
        System.out.println("false");

        
    }
    public static void main (String args[]){
        int num[]={1,2,3,4,53,};
        rep(num);
        // if(){
            
        // }else{
            
        // }
    }
    
}

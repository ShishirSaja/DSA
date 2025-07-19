public class Lsearch {
    public static int linear(int num[],int n){
        
        for(int i=0; i<num.length;i++){
            if(num[i]==n){
               return i; 
            }
            
        }
        return -1;
        
    }

    public static int largest(int numbers[]){
        int large = -100;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>large){
                large = numbers[i];
            }
            
        }
        return large;
    }
    public static void main (String Args []){
         int number[]={23,45,67,23,659,66,76};
         int large = largest(number);
         System.out.println(large);
       
    }
    
}

public class binarysearch {
    public static void sort(int numbers[]){
        int temp = 0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]>numbers[j]){
                    temp = numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp; 
                }

            }
        }
    }

    //Bsearch

    public  static int Bsearch(int Num[], int key){
        int start = 0;
        int end=Num.length-1;
        
        while(start <= end){
            int mid = (start+end)/2;
            int midValue = Num[mid];
            if(midValue == key){
                return mid;
            }    
            
            else if(midValue>key){
                end = mid;
            }else{
                start = mid+1;
            }
        
        }
        return -1;

    }
    public static void main (String Args[]){
        int numbers[]={23,44,66,2,4,78};
        sort(numbers);

        for(int i =0;i<numbers.length;i++){
            System.out.print(numbers[i]+"\t");
        }
        

        Bsearch(numbers, 44);
        System.out.println("so the key at index "+Bsearch(numbers, 66));
        
    }
}

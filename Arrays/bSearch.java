public class bSearch {
    public static void sort(int arr[] ){
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
                
            }
        }
        
    }

    //bsearch

    public static int bSea(int arr[],int key){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            System.out.println(arr[mid]);
            if(key==arr[mid]){
                return mid;
            }
            else if(key<arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }

        }
        return -1;
    }


    //reverse
    public static void reverse(int arr[]){
        int dummy[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            for(int j=(arr.length-(i+1));j<dummy.length;j++){
                dummy[j]=arr[i];
            }
        }

        for(int i=0;i<dummy.length;i++){
            System.out.print(dummy[i]+"\t");
        }
    }


    //optreverse
    public static void rev(int arr[]){
        int temp = 0;
        for(int i=0;i<arr.length/2;i++){
            for(int j=(arr.length-(1+i));j>=(arr.length-(1+i));j--){
                temp = arr[i];
                arr[i]=arr[j];
                arr[j]= temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }


    public static void pair(int arr[]){
        for(int i=0;i<(arr.length-1);i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("( "+arr[i]+" , "+arr[j]+" )\s");
            }
        }
    }

    public static void sArr(int arr[]){
        int count = 0;
        int sum = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        

        for(int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length;j++){
                System.out.print("( ");
                for(int s=i;s<=j;s++){
                    sum = sum + arr[s];
                    if(sum <max){
                        max=sum;
                    }
                    if(sum>min){
                        min = sum;
                    }
                    
                }
                
                System.out.print(sum+" ) ");
                sum = 0;
                count++;
            }
            System.out.println();
        }
        System.out.println("the sub array number  "+count);
        System.out.println("the smallest sum is   "+max);
        System.out.println("largest sum is  "+min);
    }


    //subarray sum with prefix method

    public static void pre(int arr[]){
        int sum =0;
        int largestSum = Integer.MIN_VALUE;
        int pre[] = new int[arr.length]; 
        for(int i=0;i<arr.length;i++){
            
            sum =sum+ arr[i];
            
            pre[i]=sum;
            System.out.print(sum+"\s");
            if(largestSum <sum){
                largestSum=sum;
            }
            
        }

        System.out.println();
        for(int i=0;i<pre.length-1;i++){
            for(int j=i+1;j<pre.length;j++){
               sum = pre[j]-pre[i];

               System.out.print(sum+"\s");
               if(largestSum <sum){
                largestSum=sum;
            }
            }
            System.out.println();
            
            

        }

        System.out.println("the largest sum is :"+ largestSum);
    }

    //kadans algo for max sum of subArrays
    public static void kadans(int arr[]){
        int sum = 0;
        int Msum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
            
            if(sum <0){
                sum = 0;

            }
            System.out.print(sum+"\s");
            Msum = Math.max(Msum, sum);
        }
        if(Msum == 0){
            int Maxv = Integer.MIN_VALUE;
            for(int i =0;i<arr.length;i++){
                if(arr[i]>Maxv){
                    Maxv=arr[i];
                }
            }
            Msum = Maxv;
        }
        System.out.println();
        System.out.println("the max for kadans :"+Msum);
    }
    

    public static void main(String Args[]){
        int number[] = {-2,-6,5,-3,10,-8};
        // sort(number);
        // for(int i =0;i<number.length;i++){
        //     System.out.print(number[i]+ "\t");
        // }
        pre(number);
        kadans(number);


        // System.out.println("the key is at index :"+ bSea(number, 567));
    //    sArr(number);

    }
}

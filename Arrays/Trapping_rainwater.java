public class Trapping_rainwater {
    public static void main (String args[]){
        int arr[]={0,1,0,2,1,0,1,3};
        // trapped(arr);
        rain(arr);
    }

    public static void trapped(int arr[]){
        int leftB[]=new int[arr.length];
        int rightB[]=new int[arr.length];
        leftB[0]=arr[0];
        rightB[arr.length-1]=arr[arr.length-1];
        int totalWater =0;

        for(int i=1;i<arr.length;i++){
            int max = Math.max(arr[i], leftB[i-1]);
            leftB[i]=max;
            
        }

        for(int j=rightB.length-1;j>0;j--){
            int max = Math.max(rightB[j],arr[j-1] );
            rightB[j-1]=max;
        }

        for(int i=0;i<arr.length;i++){
            int water = Math.min(leftB[i],rightB[i]);
            int watrArea = water - arr[i];
            totalWater= totalWater + watrArea;

        }

        System.out.println("The total volume of water trapped in the building is "+ totalWater);


    }

    public static void rain(int arr[]){
        int left[]=new int[arr.length];
        int right[]=new int[arr.length];
        left[0]=arr[0];
        right[arr.length-1]=arr[arr.length-1];
        int waterL= 0;
        int waterT=0;
        int total =0;


        for(int i=1;i<arr.length;i++){
           
            left[i]=Math.max(arr[i],left[i-1]);
            System.out.print(left[i]+"\s");
            
        }
        System.out.println();
        for(int i=arr.length-2;i>=0;i--){
            right[i]=Math.max(arr[i], right[i+1]);
            System.out.print(right[i]+"\s");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            waterL=Math.min(left[i], right[i]);
            System.out.print(waterL+"\s");
            waterT = waterL - arr[i];
            total = total+waterT;
        }

        System.out.println("the total trapped water is :"+total);

    }
    
}

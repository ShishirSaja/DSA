public class Buy_sell {

    public static void bs(int price[]){
        int sell = 0;
        int buy =Integer.MAX_VALUE;
        int Maxp = Integer.MIN_VALUE;


        for(int i=1;i<price.length;i++){
            sell = price[i];
            if(buy>price[i-1]){
                buy = price[i-1];
            }
            int diff = sell-buy;
            if(Maxp < diff){
                Maxp = diff;
            }

        }
        System.out.println("the max profit is "+Maxp+" at the buying price of "+ buy+" and the selling price of "+(Maxp+buy));
    }
    public static void main (String args[]){
        int arr[]={7,6,4};
        System.out.println(buy(arr));

    }

    public static int buy(int arr[]){
        int bp=arr[0];
        int sp=0;
        int profit=0;
        int MProfit = Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++){
            if(bp>arr[i]){
                bp=arr[i];
            }
            sp = arr[i];
            profit = sp - bp;
            MProfit = Math.max(profit, MProfit);
        }
        if(MProfit<0){
            return 0;

        }

        return MProfit;
    }    
}

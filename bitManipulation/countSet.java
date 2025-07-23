public class countSet {
    public static int count(int num){
        int count =0;
        while(num>0){
            if((num&1)!=0){
                count++;
            }
            num = num>>1;
        }

        return count;
    }
    public static void main(String srgs[]){
        System.out.print(count(124455));
    }
}
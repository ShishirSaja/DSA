public class Exponentiation {
    public static int exponent(int base,int pow){
        int ans =1;
        while(pow>0){
            int val=0;
            if((pow&1)==0){
                val=1;
            }else{
                val=base;
            }

            pow =pow >>1;
            base=base*base;
            ans=ans*val;
        }

        return ans;
    }
    public static void main(String args[]){
        int base = 5;
        int pow = 3;
        System.out.println(exponent(base, pow));
    }
}

public class binary {

    public static int bi2dec(int b){
        int ld = 0;
        int dec = 0;
        for(int i = 0;b>0;i++){
            ld = b%10;
            dec = (int) (dec + ld * Math.pow(2,i));
            b = b/10;
        }
        return dec;
    }

    public static int decToBi(int d){
        int bNo = 0;
        int sum =0;
        int dec = 0;
        for(int i=0 ; d>0; i++){
            bNo = d%2;
            d = d / 2;

            dec = dec + bNo*(int)(Math.pow(10,i));
            
            //System.out.println(dec);
        }
        return dec;
    }

    public static void main (String []args){
        int bin = decToBi(889);
        System.out.println(bin);
    }
    
}

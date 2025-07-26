public class XORswap {
    public static void swap(int a,int b){
        a=(a^b);
        b=(a^b);
        a=(b^a);
        System.out.println("a value is : "+a+" ,b value is : "+b);
    }
    public static void main(String args[]){
        int a=5;
        int b=3;
        // swap(a, b);
        System.out.println((-~3));
        
    }
}

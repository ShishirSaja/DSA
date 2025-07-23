public class power2 {
    public static void power(int num){
        if((num&(num-1))==0){
            System.out.println("the number is power of 2");
        }else{
            System.out.println("the number is not power of 2");
        }
    }
    public static void main (String args[]){
        power(4);
    }
}

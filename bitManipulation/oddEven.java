import java.util.Scanner;

public class oddEven {

    public static void power(int var0) {
      if ((var0 & var0 - 1) == 0) {
         System.out.println("the number is power of 2");
      } else {
         System.out.println("the number is not power of 2");
      }

   }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("give the number :");
        
        int n = sc.nextInt();
        
        if((n&1)==0){
            System.out.println("the given number is even");

        }else{
            System.out.println("the given number is odd");
        }
    }
}

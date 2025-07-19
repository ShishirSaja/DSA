import  java.util.*;
public class largest{
    public static void main (String []args){
        Scanner saja = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = saja.nextInt();
        System.out.print("Enter second number: ");
        int b = saja.nextInt();
        if (a > b) {
            System.out.println(a + " is greater than " + b);

        } else {
            System.out.println(b + " is greater than " + a);
        }
    }


}

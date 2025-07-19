import java.util.*;
public class sum{
    public static void main (String args[]){
        System.out.println("give two numbers that needs to be added");
        Scanner saja = new Scanner(System.in);
        System.out.print("a = ");
        int a = saja.nextInt();
        System.out.println("& \n b=");

        int b = saja.nextInt();
        int sum = a + b;
        System.out.println("sum is " + sum);


    }
}
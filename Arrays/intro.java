import java.util.*;
public class intro{

    public static void num(int numb[],int n){
        n = 500;
        numb[0]=100;
    }
    public static void main (String Args[]){
        
        // Scanner sc = new Scanner(System.in);
        int numbers[]= {34,45,67};
        // numbers[1]= sc.nextInt();
        int n = 400;
        num(numbers,n);
        System.out.println(n);

        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

        // System.out.println(numbers[1]);

    }
}
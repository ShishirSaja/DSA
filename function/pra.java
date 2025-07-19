
import java.util.*;
public class pra {


    public static int Average(int a ,int b,int c){
        int Average = (a+b+c)/3;
        return Average;
    }

    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }else{
            return false;
        }
        
    }

    public static boolean palindrome(int a ){
        int newNo = 0;
        
        int b = a;
        while(a>0){
           int I = a%10 ;
           newNo = newNo * 10 +I;
           a = a/10;

           
           
        }
        
        if(newNo == b){
            return true;
           }

           return false;
    }

    public static int sumD(int a){
        int sum = 0;
        int ld = 0;
        while(a>0){
            ld = a%10;
            sum = sum + ld ;
            a = a/10;
        }
        return sum;
    }

    public static void print(String a){
        System.out.println(a);
    }



    public static void main(String [] args){
        int a = sumD(123);
        print(""+a);


    }
    
}

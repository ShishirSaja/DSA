import java.util.*;
public class multiply{

    public static boolean prime(int a){
        if(a==2){
            return true;
        }
        for(int i =2; i<=Math.sqrt(a); i++){
            if(a%i==0){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int range = 20;
        for (int i =2;i<=range;i++){
            if(prime(i)){
                System.out.println(i +" is prime");
            }else{
                System.out.println(i +" is not prime");
            }
        }
    }   
}
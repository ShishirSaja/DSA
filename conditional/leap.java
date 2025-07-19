import java.util.*;
public class leap{
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);
        System.out.println("enter the number");
        int j = num.nextInt();
        int even = 0;
        int odd = 0;
        
        while(j>0){
            int n = j%10;
            if(n%2==0){
                even = even+n;
            }else{
                odd = odd+n;
            }
            j = j/10;
        }
        System.out.println(even +" " + odd);
    }

}
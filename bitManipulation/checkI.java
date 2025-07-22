import java.util.Scanner;

public class checkI {
    public static void ithBit(int n, int i){
        if((n&1<<i)==0){
            System.out.println("the bit is 0");
        }else{
            System.out.println("the bit is 1");
        }
    }
    public static void itBit(int n, int i){
        int bitMass = (int) Math.pow(2, i);
        if((n & bitMass)==0){
            System.out.println("the bit is 0");
        }else{
            System.out.println("the bit is 1");
        }
    }


    public static int setI(int n,int i){
        int bitMass = 1<<i;
        return (n|bitMass);
    }

    public static int clear(int n,int i){
        int bitMass = ~(1<<i);
        return (n&bitMass);
    }

    public static int clearI(int n,int i){
        int bitMass =(~0)<<i+1;
        return (n&bitMass);
    }

    public static void action(int n,int i,int y){
        if(y==0){
            
            System.out.println(clear(n, i));
        }else if(y==1){
            System.out.println(setI(n, i));
        }
    }

    public static int range(int n,int i,int j){
        int bitmass = (((~0)<<(i+1))|(~(~0<<j)));
        return n&bitmass;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("give the number :"+((~0)<<2));
        int n = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        
        System.out.println(range(n, i, j));

    }
}

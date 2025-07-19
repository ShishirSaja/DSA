import java.util.*;


public class number {
    public static void main(String[] args) {
       System.out.println("enter the number : ");
       Scanner num = new Scanner(System.in);
       int numb = num.nextInt();

       switch(numb){
        case 1 :
        System.out.println("number is 1");
        break;
        case -4 :
        System.out.println("number is 2");
        break;
        default :
        System.out.println("it s not 1 either 2");

       }

    }
}

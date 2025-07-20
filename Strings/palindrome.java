import java.util.Scanner;

public class palindrome {
    public static void palindromes(String pal){
        int count=0;
        int mid = pal.length()/2;
        if(pal.length()%2==0){
            for(int i=mid;i<pal.length();i++){
                if(pal.charAt(i)==pal.charAt(pal.length()-(i+1))){
                    count++;
                }
            }
            if(count==mid){
                System.out.println("the given string is palindrome");
                return;
            }


        }else{
            for(int i=mid+1;i<pal.length();i++){
                if(pal.charAt(i)==pal.charAt(pal.length()-(i+1))){
                    count++;
                }
            }
            if(count==mid){
                System.out.println("the given string is palindrome");
                return;
            }
        }
        System.out.println("the given string is not a palindrome");

    }
    public static void main(String args[]){
        String firstName ;
        // firstName = "Shishir";
        int num;
        num = 23;
        String lastName;
        // lastName = "Saja";
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your first name :");
        firstName = sc.nextLine();
        // System.out.println("Type your last name :");
        // lastName = sc.next();
        // String fullName = firstName + " "+lastName;
        // System.out.println("your full name is :"+fullName);
        // System.out.println("fist charcter : "+fullName.charAt(0));
        // System.out.println("length of your name :" + firstName.length()/2);
        palindromes(firstName);



    }
}

import java.util.*;

public class lower {
    public static void vowels(String str ){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }

        }
        System.out.println(count);
    }

    public static boolean anagrams(String str1,String str2){
        int count=0;
        StringBuilder str3 = new StringBuilder(str2);

        if(str1.length()==str2.length()){
            for(int i=0;i<str1.length();i++){
                for(int j=0;j<str3.length();j++){
                    if(Character.toLowerCase(str1.charAt(i))==Character.toLowerCase(str3.charAt(j))){
                        count++;
                        str3.deleteCharAt(j);
                    }
                    

                }
                if(count==i){
                        return false;
                    }
            }
        }else{
            return false;
        }
        return true;

        
    }

    public static void main(String args[]){
        String str = "race";
        String str1 ="Cere";
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        
        System.out.println(anagrams(str, str1));
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

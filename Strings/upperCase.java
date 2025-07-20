public class upperCase {

    public static String large(String str[]){
        String largest = str[0];
        for(int i=1;i<str.length;i++){
            if(0<str[i].compareTo(largest)){
                largest=str[i];
            }
        }

        return largest;
    }


    public static String upper(String str){
        StringBuilder st = new StringBuilder("");

        char ch2 = Character.toUpperCase(str.charAt(0));
        st.append(ch2);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1) ==' '){
                char ch3 = Character.toUpperCase(str.charAt(i));
                st.append(ch3);
            }else{
                st.append(str.charAt(i));
            }
        }
        return st.toString();
    }
    public static void main(String args[]){
        String str[] ={"Mango","Anana","Z"};
        System.out.println(large(str));
        String str1 = "iam the superman of world ";

        System.out.println(upper(str1));
    }
    
}

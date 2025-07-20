public class sCompression {
    public static void comp(String str){
        StringBuilder st = new StringBuilder("");
        
        
        for(int i =0;i<str.length();i++){
            int count = 1;
            char ch = str.charAt(i);
            st.append(ch);
            while(i+1<str.length() && ch==str.charAt(i+1)   ){
                count++;
                i++;
            }
            if(count >1){
                st.append(count);
            }
        }

        System.out.println(st);
    }
    public static void main(String args[]){
        String str = "abdsssggttTT";
        comp(str);
    }
}

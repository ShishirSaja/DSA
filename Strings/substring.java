public class substring {
    public static String subStrings(String str,int si,int ei){
        String sub = "";
      
        for(int i=si;i<ei;i++){
            sub += str.charAt(i);
        }
        return sub;
    }
    public static void main(String args[]){
        String str = "hello world";
        char s = 's';
        char f = 'f';
        String na = "";
        na += s+f;
        System.out.println(na);
        System.out.println(subStrings(str, 2, 6));
         System.out.println(s+" "+f);
        for(int i='a';i<'d';i++){
        System.out.println(i);
    }
}
    }

    

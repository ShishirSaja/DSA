public class shortest {
    public static double direct(String dir){
        char E = 'E';
        char W = 'W';
        char N = 'N';
        char S = 'S';
        int x=0;
        int y=0;
        for(int i=0;i<dir.length();i++){
            char ch = dir.charAt(i);
            if(ch==E){
                x++;
            }
            else if(ch==W){
                x--;
            }
            else if(ch==N){
                y++;
            }
            else if(ch==S){
                y--;
            }
        }

        double shortpath = Math.sqrt(x*x+y*y);
        return shortpath;

    }
    public static void main(String args[]){
        String direction = "EEEE";
        
        System.out.println(direct(direction));
    }
}

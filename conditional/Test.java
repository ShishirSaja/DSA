package conditional;
public class Test {
    public static void main(String[] args){
        int x, y, z;
        x = y = z = 2;
        x += y;
        y -= z;
        z = z / (x + y);
        System.out.println(x + " " + y + " " + z);
    }
}


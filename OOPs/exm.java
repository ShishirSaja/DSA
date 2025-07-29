
public class exm {

    public static void main(String args[]){
        dog puppy = new dog();
        puppy.eat();
        puppy.mouth = "one";

        pummorian pm = new pummorian();
        pm.eat();

        fish fs = new fish();
        fs.eat();

    }
    
}


class Animal{
    String mouth;
    void eat(){
        System.out.println("eating something");

    }
}

class dog extends Animal{
    void bark(){
        System.out.println("dogs barks");
    }
}

class fish extends Animal{
    void swim(){
        System.out.println("fish swims");
    }
}

class pummorian extends dog {
    void height(){
        System.out.println("short");
    }
}


public class exm {
    void eat(){
        System.out.println("eating  in the main something");

    }


    public static void main(String args[]){

        // exm et = new exm();
        // et.eat();

        dog puppy = new dog();
        // puppy.eat();
        // puppy.mouth = "one";

        // pummorian pm = new pummorian();
        // pm.eat();

        // fish fs = new fish();
        // fs.eat();

        Animal an = new Animal();
        an.eat("bone");
        an.eat();
        puppy.eat();

    }
    
}


class Animal{
    String mouth;
    void eat(){
        System.out.println("eating something");

    }

    String eat(String food){
        return food;
    }

    
}

class dog extends Animal{
    void bark(){
        System.out.println("dogs barks");
    }

    void eat(){
        System.out.println("dog eating something");

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

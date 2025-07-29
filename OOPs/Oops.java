public class Oops {
    public  static void main(String args[]){
        Pen pn = new Pen();
        pn.setTip(2);
        System.out.println(pn.getTip());

        pn.color = "blue";
        // pn.setColor("red");
        System.out.println(pn.getcolor());


        Pen pn1 = new Pen(pn);
        System.out.println(pn1.getcolor());
        System.out.println(pn1.getTip());
        
    }
}


class Pen{
    private String color;
    
    int tip;

    public Pen(){
        System.out.println("creating new object of class pen");
    }

    public Pen(Pen pn){
        this.color = pn.color; 

    }

    private void  setColor(String color){
        this.color = color;
    }
    public void  setTip(int tip){
        this.tip = tip;
    }
    public int getTip(){
        return this.tip;
    }
    public String getcolor(){
        return this.color;
    }
}
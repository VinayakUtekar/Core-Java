abstract class MU{
    void Fe(){
        System.out.println("MU will do it");
    }
    abstract void Se();
    abstract void Te();
    void Be(){
        System.out.println("MU will do it");
    }
}
    
class Clg extends MU{
    
    void Se(){
        System.out.println("Clg will do it");
    }
    
    void Te(){
        System.out.println("Clg will do it");
    }
}
    
public class P3{
    public static void main(String args[]){
        Clg c = new Clg();
        c.Fe();
        c.Se();
        c.Te();
        c.Be();
    }
}
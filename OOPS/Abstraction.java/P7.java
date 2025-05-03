abstract class MU{
    abstract void Fe();
    abstract void Se();
    abstract void Te();
    abstract void Be();
    }
    
    class Clg extends MU{
    void Fe(){
        System.out.println("Clg will do it");
    }
    
    void Se(){
        System.out.println("Clg will do it");
    }
    
    void Te(){
        System.out.println("Clg will do it");
    }
    
    void Be(){
        System.out.println("Clg will do it");
    }
}
    
class P7{
    public static void main(String args[]){
        Clg c = new Clg();
        c.Fe();
        c.Se();
        c.Te();
        c.Be();
    }
}
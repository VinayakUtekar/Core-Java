interface MU{
    abstract void Fe();
    abstract void Se();
    abstract void Te();
    abstract void Be();
    }
    
    class Clg implements MU{
    
    public void Fe(){
        System.out.println("Clg will do it");
    }
    
    public void Se(){
        System.out.println("Clg will do it");
    }
    
    public void Te(){
        System.out.println("Clg will do it");
    }
    
    public void Be(){
        System.out.println("Clg will do it");
    }
}
    
class P4{
    public static void main(String args[]){
    Clg c = new Clg();
    c.Fe();
    c.Se();
    c.Te();
    c.Be();
    }
}
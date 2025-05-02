abstract class Meeting{
    void micOnOff(){
        System.out.println("KS will do it ");
    }
    
    abstract void changeName();
    }
    
    class Participants extends Meeting{
    void changeName(){
        System.out.println("Pa will do it");
    }
}
    
class P3{
    public static void main(String args[]){
    Participants p = new Participants();
    p.micOnOff();
    p.changeName();
    
    }
}
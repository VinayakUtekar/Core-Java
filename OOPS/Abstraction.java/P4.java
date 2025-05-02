abstract class Meeting{
    abstract void micOnOff();
    abstract void changeName();
    }
    
    class Participants extends Meeting{
    void micOnOff(){
        System.out.println("Pa will do it ");
    }
    
    void changeName(){
        System.out.println("Pa will do it ");
    }
}
    
class P4{
    public static void main(String args[]){
    Participants p = new Participants();
    p.micOnOff();
    p.changeName();
    
    }
}
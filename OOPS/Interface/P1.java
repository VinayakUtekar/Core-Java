package OOPS.Interface;

interface Meeting{
    void micOnOff();
    void changeName();
    }
    
    class Participants implements Meeting{
    public void micOnOff(){
        System.out.println("Pa will do it ");
    }
    
    public void changeName(){
        System.out.println("Pa will do it ");
    }
}
    
public class P1{
    public static void main(String args[]){
        Participants p = new Participants();
        p.micOnOff();
        p.changeName();
    }
}

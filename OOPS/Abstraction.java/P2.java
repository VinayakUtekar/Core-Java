package OOPS.Abstraction.java;

class Meeting{
        void micOnOff(){
            System.out.println("KS will do it ");
        }
        
        void changename(){
            System.out.println("KS will do it ");
        }
}
        
class Participants extends Meeting{}
        
class P2{
        public static void main(String args[]){
        Participants p = new Participants();
        p.micOnOff();
        p.changeName();
        
        }
}

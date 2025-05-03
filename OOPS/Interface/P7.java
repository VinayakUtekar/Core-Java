interface M{
    default void q(){
    p();
    }
    
    private static void p(){
    System.out.print("p");
    }
}
    
class N implements M{}
    
class P7{
    public static void main(String args[]){
    N m = new N();
    m.q();
    }
}
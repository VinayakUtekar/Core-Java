interface Mango{
    static void q(){
    m();
    }
    
    private static void m(){
    System.out.print("m");
    }
}
    
class P8{
    public static void main(String args[]){
    Mango.q();
    }
}
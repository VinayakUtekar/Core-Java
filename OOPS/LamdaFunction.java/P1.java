interface A{
    void f1();
}
    
public class P1{
    public static void main(String args[]){
    A a = () -> System.out.println("Hello");
    a.f1();
    }
}
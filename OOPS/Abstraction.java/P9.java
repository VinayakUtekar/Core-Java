abstract class A{
    abstract void f1();
}
    
class B extends A{
    void f1(){
    System.out.println("Hello");
    }
}
    
class P9{
    public static void main(String args[]){
    B b = new B();
    b.f1();
    }
}
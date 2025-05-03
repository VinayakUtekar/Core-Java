interface A{
    void m();
    default void n(){
    System.out.println("hi");
    }
}
    
class B implements A{
    public void m(){
    System.out.println("Hello");
    }
}
    
class C implements A{
    public void m(){
    System.out.println("hey");
    }
    
    public void n(){
    System.out.println("bye");
    }
    
}
    
class P5{
    public static void main(String args[]){
        B b = new B();
        b.m();
        b.n();
        
        C c = new C();
        c.m();
        c.n();
    }
}
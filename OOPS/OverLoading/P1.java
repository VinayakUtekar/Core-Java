class A{
    void compute(double num){
        double res = num * num;
        System.out.println("Square = "+res);
    }
}
    
    class B extends A{
        void compute(double num){
        double res = Math.sqrt(num);
        System.out.println("Square root = "+res);
    }
}
    
class P1{
    public static void main(String args[]){
        A a = new A();
        a.compute(7);
        
        B b = new B();
        b.compute(8);
    }
}
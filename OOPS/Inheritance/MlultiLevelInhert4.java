class A{
    void compute(double num){
        double res = num * num;
        System.out.println("Square = "+res);
    }
}
    
class B extends A{
    void compute(double n1, double n2){
        double res = n1 + n2;
        System.out.println("Addition = "+res);
    }
}
    
class MultiLevelInhert{
    public static void main(String args[]){
        A a = new A();
        a.compute(7);
        
        B b = new B();
        b.compute(8);
        b.compute(8,9);
    }
}
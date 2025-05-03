interface Compute{
    void add(int a,int b);
}
    
public class P2{
    public static void main(String args[]){
    //direct call by value
    Compute c1 = (int a, int b) -> System.out.println("addition = " + (a+b));
    c1.add(10, 20);
    
    //call by refernce
    Compute c2 = (int p, int q) -> System.out.println("addition = " + (p+q));
    c1.add(10, 20);
    
    //no datatypes
    Compute c3 = (p,q) -> System.out.println("addition = " + (p+q));
    c3.add(10, 20);
    
    //{}optional for single statements
    Compute c4 = (p,q) -> {System.out.println("addition = " + (p+q));};
    c4.add(10, 20);
    
    //{}compulsory for multiple line
    Compute c5 = (p,q) -> { int res = p+q ; System.out.println("addition = " + res);};
    c5.add(10, 20);
    }
}
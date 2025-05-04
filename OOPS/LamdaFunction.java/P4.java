interface MyMath{
    void square(double num);
}
    
class P4{
    public static void main(String args[]){
    
    MyMath m1 = (double num) -> System.out.println("square =" + (num * num));
    m1.square(4);
    
    MyMath m2 = (num) -> System.out.println("square =" + (num * num));
    m2.square(4);
    
    MyMath m3 = num -> System.out.println("square =" + (num * num));
    m3.square(4);
    
    MyMath m4 = num -> {System.out.println("square =" + (num * num));};
    m4.square(4);
    }
}
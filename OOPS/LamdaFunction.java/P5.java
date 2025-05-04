interface MyMath{
    double sqrt(double num);
}
    
class P5{
    public static void main(String args[]){
    
    MyMath m1 = (double num) -> {return Math.sqrt(num);};
    System.out.println("square =" + m1.sqrt(4));
    
    MyMath m2 = (num) -> {return  Math.sqrt(num);};
    System.out.println("square =" + m2.sqrt(4));
    
    MyMath m3 = num -> {return Math.sqrt(num);};
    System.out.println("square =" + m1.sqrt(4));
    
    MyMath m4 = num -> Math.sqrt(num);
    System.out.println("square =" + m4.sqrt(4));
    
    }
}
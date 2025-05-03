interface Compute{
    int add(int a,int b);
}
    
class P6{
    public static void main(String args[]){
    
    //return type
    Compute c1 = (int a, int b) -> {return (a+b);};
    System.out.println(c1.add(10, 20));
    
    //no curly bracket no return but if curlt brackets then return needed
    Compute c2 = (int a, int b) -> a+b;
    System.out.println(c2.add(10, 20));
    
    //no datatypes
    Compute c3 = (a, b) -> a+b;
    System.out.println(c3.add(10, 20));
    
    //better understanding of c2
    Compute c4 = (a, b) -> a+b;
    int res = c4.add(10, 20);
    System.out.println("res = " + res);
    }
}
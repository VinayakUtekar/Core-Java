class P3{
    public static void main(String args[]){
    System.out.println("Welcome");
    
    try{
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int res = a/b;
        System.out.println("Result = " + res);
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("u should 2 Integres");
    }catch(NumberFormatException e){
        System.out.println("u should Integres");
    }catch(ArithmeticException e){
        System.out.println("2nd input could not be 0");
    }
    
    System.out.println("bye");
    }
}
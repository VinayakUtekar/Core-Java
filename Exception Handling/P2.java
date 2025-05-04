class P2{
    public static void main(String args[]){
    System.out.println("Welcome");
    
    try{
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int res = a/b;
        System.out.println("Result = " + res);
    }catch(Exception e){
        System.out.println("Input Issue " + e);
    }
    
    System.out.println("bye");
    }
}
import java.io.*;
class P9{
    public static void main(String args[]){

        System.out.println("Welcome");
        Console c = System.console();

        try{
        int a = Integer.parseInt(c.readLine("Enter a : "));
        int b = Integer.parseInt(c.readLine("Enter b : "));
        int ans = a/b ;
        System.out.print("ans =  + ans");
        }catch(NumberFormatException e){
            System.out.println("u should enter integers only ");
        }catch(ArithmeticException e){
            System.out.println("2nd integer should not be ");
        }

        System.out.println("Bye");
    }
}
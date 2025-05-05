import java.io.*;
import java.util.*;

class P4{
    public static void main(String args[]){
        System.out.println("Welcome");

        Scanner s = new Scanner(System.in);

        try{
            System.out.println("enter the integer");
            int a = s.nextInt();
            System.out.println("enter the integer");
            int b = s.nextInt();
            int res = a / b;
            System.out.println("Result = " + res);
        }catch(InputMismatchException e){
            System.out.println("u should enter two integer ");
        }catch(ArithmeticException e){
            System.out.println("2nd input cannot be 0");
        }
        System.out.println("Bye");
    }
}
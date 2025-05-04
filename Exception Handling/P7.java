import java.io.*;
import java.util.*;

class P7{
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
        }catch(Exception e){
            System.out.println("Issues = " + e);
        }
        System.out.println("Bye");
    }
}
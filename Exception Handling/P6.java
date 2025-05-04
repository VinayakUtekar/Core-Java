package Exception Handling;

import java.io.*;
class P6{
    public static void main(String args[]){
        System.out.println("Welcome");

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try{
            System.out.println("enter the integer");
            int a = Integer.parseInt(br.readLine());
            System.out.println("enter the integer");
            int b = Integer.parseInt(br.readLine());
            int res = a / b;
            System.out.println("Result = " + res);
        }catch(IOException e){
            System.out.println("Issue - " + e);
        }catch(NumberFormatException e){
            System.out.println("u should enter two integer");
        }catch(ArithmeticException e){
            System.out.println("2nd input should not be zero");
        }
        System.out.println("Bye");
    }
}
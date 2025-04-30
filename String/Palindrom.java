import java.io.*;
class Palindrom{
    public static void main(String args[]){
        Console c = System.console();
        String str = c.readLine("enter the string : ");

        String rev = new StringBuffer(str).reverse().toString();

        if(str.equals(rev))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");
    }
}
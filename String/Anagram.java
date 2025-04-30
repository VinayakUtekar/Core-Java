import java.io.*;
import java.util.*;

class Anagrams{
    public static void main(String args[]){
        Console c = System.console();

        String str1 = c.readLine("Enter the string : ");
        String str2 = c.readLine("Enter the string : ");

        System.out.println(" String is : " + str1);
        System.out.println(" String is : " + str2);

        //String to Character Array
        char ch1 [] = str1.toCharArray();
        char ch2 [] = str2.toCharArray();

        //sort
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        //Array converted to String
        str1 = new String (ch1);
        str2 = new String (ch2);

        if(str1.equals(str2))
            System.out.println(" Strings are anagrams");	
        else 
            System.out.println(" Strings are not anagrams");

    }
}
import java.io.*;
class StringLength{
    public static void main(String args[]){
        Console c = System.console();
        String str = c.readLine("enter the string : ");

        int len1 = str.length();
        System.out.println("len1 = " + len1);

        char ch[] = str.toCharArray();
        int len2 = 0;
        for(char d : ch)
            len2++;
        System.out.println("Len2 = "+len2);
    }
}
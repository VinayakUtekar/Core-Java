import java.io.*;
class StringBuffCharacter{
    public static void main(String args[]){
        Console c = System.console();
        StringBuffer sb = new StringBuffer(c.readLine("Enter the string : "));
        System.out.println(sb);

        int lc=0,dc=0;
        for(int i=0; i < sb.length() ; i++){
            char ch = sb.charAt(i);
            if(Character.isLetter(ch))
                lc++;
            else if(Character.isDigit(ch))
                dc++;
        }
        System.out.println("lc ="+lc+ "  dc = "+dc);

    }
}
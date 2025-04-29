import java.io.*;
class CharacterCheck{
    public static void main(String args[]){
        Console c = System.console();

        String str = c.readLine("Enter a character : ");
        char ch = str.charAt(0);

        if (Character.isLetter(ch)){
            System.out.printf("Input is Character ");
        }
        else if(Character.isDigit(ch)){
            System.out.printf("Input is Digit ");
        }
        else{
            System.out.printf("Input is Other Character ");
        }
    }
}
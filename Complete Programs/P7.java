import java.io.*;
class P7{
    public static void main(String args[]){

        System.out.println("Welcome");
        Console c = System.console();

        try{
            double num = Double.parseDouble(c.readLine("Enter Number : "));
            if (num >= 0.0){
                double ans = Math.sqrt(num);
                System.out.println("ans = " + ans);
            }else{
                throw new Exception("number should be >= 0.0");
            }
        }catch(NumberFormatException e){
            System.out.println("u should enter number only");
        }catch(Exception e){
            System.out.print(e.getMessage());
        }

        System.out.println("Bye");
    }
}
import java.io.*;
class P12{
    public static void Compute(double num) throws Exception{
        if (num >= 0.0){
                double ans = Math.sqrt(num);
                System.out.println("ans = " + ans);
        }else{
                throw new Exception("number should be >= 0.0");
        }
    }

    public static void main(String args[]){
        System.out.println("Welcome");
        Console c = System.console();

        try{
            double num = Double.parseDouble(c.readLine("Enter Number : "));
            Compute(num);
        }catch(NumberFormatException e){
            System.out.println("u should enter number only");
        }catch(Exception e){
            System.out.print(e.getMessage());
        }

        System.out.println("Bye");
    }
}
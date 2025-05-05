import java.io.*;
import java.util.*;

class SumAvg{
    public static void main(String args[]){
        Console c = System.console();
        ArrayList<Double>data = new ArrayList<>();

        String res = c.readLine("wud u like to enter some number y/n : ");
        while (res.equals("y")) {

            double n = Double.parseDouble(c.readLine("Enter number : "));
            data.add(n);
            res = c.readLine("wud u like to enter  more y/n : ");
        }

        double sum = 0,avg = 0.0; 
        for(Double d : data){
            sum = sum + d;
        }

        avg = sum /data.size() ;

        System.out.println("Sum = " + sum);
        System.out.println("Avg = " + avg);

    }
}
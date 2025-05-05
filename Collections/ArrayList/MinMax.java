import java.io.*;
import java.util.*;

class MinMax{
    public static void main(String args[]){
        Console c = System.console();
        ArrayList<Double>data = new ArrayList<>();

        String res = c.readLine("wud u like to enter some number y/n : ");
        while (res.equals("y")) {

            double n = Double.parseDouble(c.readLine("Enter number : "));
            data.add(n);
            res = c.readLine("wud u like to enter  more y/n : ");
        }

        Collections.sort(data);
        Double low = data.get(0);
        Double high = data.get(data.size() - 1);

        System.out.println("Lowest = " + low);
        System.out.println("Highest = " + high);
    }
}
package Collections.ArrayList;

import java.io.*;
import java.util.*;

class CountDigitType{
    public static void main(String args[]){
        Console c = System.console();
        ArrayList<Double>data = new ArrayList<>();

        String res = c.readLine("wud u like to enter sokme number y/n : ");
        while (res.equals("y")) {

            double d = Double.parseDouble(c.readLine("Enter number : "));
            data.add(d);
            res = c.readLine("wud u like to enter  more y/n : ");
        }
        int c1 = 0, c2 = 0, c3 = 0;
        for (Double d : data){
        if (d>0)	c1++;
        else if (d<0)	c2++;
        else		c3++;
        }

        System.out.println("C1 = " + c1+ "     C2 = " + c2 + "     C3 = " + c3);
    }
}

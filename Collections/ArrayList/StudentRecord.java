package Collections.ArrayList;

import java.io.*;
import java.util.*;

class StudentRecord{
    public static void main(String args[]){
        Console c = System.console();
        ArrayList<Double>marks = new ArrayList<>();

        String res = c.readLine("wud u like to enter some marks y/n : ");
        while (res.equals("y")) {

            double m = Double.parseDouble(c.readLine("Enter marks : "));
            marks.add(m);
            res = c.readLine("wud u like to enter  more y/n : ");
        }
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        for (Double m : marks){
        if (m>=80)	c1++;
        else if (m>=60)	c2++;
        else if (m>=40)	c3++;
        else		c4++;
        }

        System.out.println("C1 = " + c1+ "     C2 = " + c2 + "     C3 = " + c3+"     C4 = " + c4);
    }
}
import java.io.*;
import java.util.*;

class EvenOddList{
    public static void main(String args[]){
        Console c = System.console();
        ArrayList<Integer> data = new ArrayList<>();
        ArrayList<Integer> even_data = new ArrayList<>();
        ArrayList<Integer> odd_data = new ArrayList<>();

        String res = c.readLine("do u want to enter some data y/n : ");
        while (res.equals("y")){
            int d = Integer.parseInt(c.readLine("enter data : "));
            data.add(d);
            res = c.readLine("do u want to enter more data y/n :");
        }

        for(Integer d : data){
            if(d % 2 == 0) 	even_data.add(d);
            else  		odd_data.add(d);
        }

        System.out.println(data);
        System.out.println(even_data);
        System.out.println(odd_data);
    }
}
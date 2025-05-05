import java.io.*;
import java.util.*;

class P1{
    public static void main(String args[]){
        Console c = System.console();
        ArrayList<String>foodList = new ArrayList<>();

        String res = c.readLine("wud u like to place some  order y/n : ");
        while (res.equals("y")) {

            String name = c.readLine("Enter food name : ");
            foodList.add(name);
            res = c.readLine("wud u like to order  more y/n : ");
        }
            System.out.println("Food Ordered = "+ foodList);
    }
}
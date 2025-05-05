import java.io.*;
import java.util.*;

class NameAlphaSort{
    public static void main(String args[]){
        Console c = System.console();
        ArrayList<String>names = new ArrayList<>();

        String res = c.readLine("wud u like to enter some name y/n : ");
        while (res.equals("y")) {

            String n = c.readLine("Enter name : ");
            names.add(n);
            res = c.readLine("wud u like to enter  more y/n : ");
        }

        System.out.println(names);

        Collections.sort(names);

        System.out.println(names);
    }
}
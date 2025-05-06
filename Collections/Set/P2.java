import java.io.*;
import java.util.*;
class P2{
    public static void main(String args[]){
        Console c = System.console();
        LinkedHashSet<String> tn = new LinkedHashSet<>();

        while(true){
        int op = Integer.parseInt(c.readLine("1.Create  2.View  3.Remove  and  4.Exit :  "));
            switch(op){
                case 1 -> {
                        String name = c.readLine("ENter team name : ");
                        if(tn.add(name))
                            System.out.println(name + "  added");
                        else 
                            System.out.println(name +"  already exists"); 
                    }
                case 2 -> System.out.println(tn);
                case 3 -> {
                        String name = c.readLine("ENter team name : ");
                        if(tn.remove(name))
                            System.out.println(name + "  removed");
                        else 
                            System.out.println(name +"  doesn't exists"); 
                    }
                case 4 -> System.exit(0);
                case 5 -> System.out.println("Sorry i don't understand");

            }//end of switch case
        }//end of while loop
    }//end of main() function
}//end of class
import java.io.*;
import java.util.*;

class StackPgrm{
    public static void main(String args[]){
        Console c = System.console();
        ArrayList<Integer> stack =  new ArrayList<>();

        while(true){
            int op = Integer.parseInt(c.readLine("1.push    2.pop    3.display    4.exit  : "));
            if(op == 1){
                int ele = Integer.parseInt(c.readLine("Enter ele to push : "));
                stack.add(ele);
                System.out.println(ele +" is pushed on stack ");
            }
            else if (op == 2){
                if (stack.size() == 0){
                    System.out.println("stack is empty ");
                }
                else{
                    int ele = stack.remove(stack.size()-1);
                    System.out.println(ele +" element is poped ");
                }
            }
            else if (op == 3){
                System.out.println(stack);
            }
            else if (op == 4){
                break;
            }
            else {
                System.out.println(" Sorry i don't understand ");
            }
        }//end of while loop
    }//end of main function
}//end of class
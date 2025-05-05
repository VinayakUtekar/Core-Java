import java.io.*;
import java.util.*;

class QueuePgrm{
    public static void main(String args[]){
        Console c = System.console();
        ArrayList<Integer> queue =  new ArrayList<>();

        while(true){
            int op = Integer.parseInt(c.readLine("1.Enqueue    2.Dequeue    3.display    4.exit  : "));
            if(op == 1){
                int ele = Integer.parseInt(c.readLine("Enter ele to Enqueue/added : "));
                queue.add(ele);
                System.out.println(ele +" is added on stack ");
            }
            else if (op == 2){
                if (queue.size() == 0){
                    System.out.println("Queue is empty ");
                }
                else{
                    int ele = queue.remove(0);
                    System.out.println(ele +" element is removed/dequeued ");
                }
            }
            else if (op == 3){
                System.out.println(queue);
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
import java.io.*;
import java.util.*;
class P3{
    public static void main(String args[]){
        Console c = System.console();

        HashMap<String, String> convo = new HashMap<>();
        convo.put("hi", "hello");
        convo.put("hello", "hi");
        convo.put("i love u", "welcome to the club");
        convo.put("java", "july batch");
        convo.put("fees", "Rs 12,000");
        convo.put("phone", "7498405040");
        convo.put("bye", "bye");

        while(true){
            String req = c.readLine("enter ur request and press q for quit : ");
            if (req.equals("q")){
                break;
            }
            else if(convo.get(req) != null){
                String res = convo.get(req);
                System.out.println(res);
            }
            else{
                System.out.println("Sorry i don not understand");
            } 
        }

    }
}
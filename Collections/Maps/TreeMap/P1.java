package Collections.Maps.TreeMap;

import java.io.*;
import java.util.*;
class Student{
    private int rno;
    private String name;

    public Student(int rno, String name){
    this.rno = rno;
    this.name = name;
    }

    public String toString(){
        return rno + "  " + name;
    }
}

class P1{
    public static void main(String args[]){
        Console c = System.console();
        TreeMap<Integer, Student> data = new TreeMap<>();

        while(true){
            int op = Integer.parseInt(c.readLine("1.Creat   2.Read   3.Delete   4.Exit : "));
            switch(op){
                case 1 ->{
                        int rno = Integer.parseInt(c.readLine("Enter roll no : "));
                        if(data.get(rno) == null){
                        String name = c.readLine("Enter Name :");
                        Student s = new Student(rno, name);
                        data.put(rno ,s);
                        System.out.println(rno + " added");
                        }
                        else{
                        System.out.println(rno + " already exists");
                        }
                    }
                case 2 ->{
                        for(Map.Entry<Integer, Student> entry : data.entrySet()){
                            Integer key = entry.getKey();
                            Student value = entry.getValue();
                            System.out.println(key + "->  " + value);
                        }
                    }
                case 3 ->{
                        int rno = Integer.parseInt(c.readLine("Enter roll no : "));
                        if(data.get(rno) != null){
                        data.remove(rno);
                        System.out.println(rno + " removed");
                        }
                        else{
                        System.out.println(rno + " does not exists");
                        }
                    }
                case 4 -> {
                        System.exit(0);
                    }
            }//end of switch case
        }//end of while loop
    } //end of main()
} //end of class

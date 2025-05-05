import java.io.*;
class Student{
    private int rno;
    private String name;
    private int mrks;

    public Student(int rno, String name, int mrks){
    this.rno = rno;
    this.name = name;
    this.mrks = mrks;
    }

    public String toString(){
        return rno+" " + name + " " + mrks;
    }
}

class P9{
    public static void main(String args[]){

        System.out.println("Welcome");

        Console c = System.console();

        try{
            String r = c.readLine("Enter roll no = ");
            int rno = Integer.parseInt(r); 
            if (rno <=0)
                throw new Exception("rno should be <=0");
            String name = c.readLine("Enter name = ");
            if (! (name.matches("[a-zA-Z ]+")))
                throw new Exception("name should conatins only letters");
            String m = c.readLine("Enter marks = ");
            int mrks = Integer.parseInt(m);
            if((mrks < 0) || (mrks > 100))
                throw new Exception("Invalid marks");
            Student s = new Student(rno, name, mrks);
            System.out.print(s.toString());
        }catch(NumberFormatException e){
            System.out.println("Enter integers only");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
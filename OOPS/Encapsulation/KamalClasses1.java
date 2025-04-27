//W oop to form class student
//ISR,Br

import java.io.*;   //package contaning inputstram,bufferstream etc  
//import ->bring java-> language/class,i.o-> input output sub class, *-> for all class function

class Student{

private static String pn = "Kamal Sir";  //ek professor to many students

private int rno;
private String name;

public Student(int rno, String name){
this.rno = rno;
this.name = name;
}

public void display(){
	System.out.println("roll no = " + rno + " "+ " name = " + name);
}
}

class KamalClasses1{
public static void main(String args[]) throws IOException{

InputStreamReader isr = new InputStreamReader(System.in);         //call input system or gives access to keyboard to give input in run time
BufferedReader br = new BufferedReader(isr);          //bffer reader is a way to store large number of memory as user passes manu inputs buffer class will store all inputs and pass them according to the need or requirments
// System.in -> keyboard access input-> input given stored in input stream-> values of input stream stored in buffer


System.out.print("Enter roll no : ");  //print to notify user to what to input
int r1 = Integer.parseInt(br.readLine()); //taking input and storing it  in buffer
System.out.print("Enter name : ");
String n1 = br.readLine();
Student s1 = new Student (r1,n1); //object making
s1.display();

System.out.print("Enter roll no : ");
int r2 = Integer.parseInt(br.readLine());
System.out.print("Enter name : ");
String n2 = br.readLine();
Student s2 = new Student (r2,n2);
s2.display();
}
}

/* comman line argument -> blind way ->need to know datatype->need to kno 
positioins->-> need to kno no of paraeters their locations their positions

input ouput -> this will notify u befor given input ehat to give ani what 
datatype to give */
//W oop to form class student
//ISR,Br
//arrays group of elemts of same type nak ek kam anek ease of processig
// import ->  bring , java -> language, io -> imput/output, *->all for all classes functions and all

import java.io.*;
class Student{

private static String pn = "Kamal Sir";

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

class KamalClasses2{
public static void main(String args[]) throws IOException{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);

System.out.println("Enter the number of students : ");
int n = Integer.parseInt(br.readLine());
Student  data[] = new Student [n];
// datatype arrayname[] = new datatype [size]

for (int i = 0 ; i < n ; i++){
	System.out.print("Enter roll no : ");
	int r1 = Integer.parseInt(br.readLine());
	System.out.print("Enter name : ");
	String n1 = br.readLine();
	data [i] = new Student (r1,n1);

/* or Student s = new Student(r1,n1);
      Student s = data[i]; */  
}

for (int i = 0 ; i < n ; i++){
	data[i].display();
}
}
}



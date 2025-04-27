//W oop to form class student
//
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

class KamalClasses{
public static void main(String args[]){
int r1 = Integer.parseInt(args[0]);
String n1 = args[1];
Student s1 = new Student(r1,n1);
s1.display();


}
}

//args Command line arguments inputoutput method

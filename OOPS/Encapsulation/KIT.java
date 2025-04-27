//W oop to form class employee
//ISR,Br
//arrays group of elemts of same type nak ek kam anek ease of processig
// import ->  bring , java -> language, io -> imput/output, *->all for all classes functions and all


import java.io.*;
class Employee{

private static String cn = "KIT";

private int id;
private String name;
private Double salary;

public Employee(int id, String name, double salary){
this.id = id;
this.name = name;
this.salary = salary;
}

public void display(){
	System.out.println("Employee ID = " + id + " "+ " Employee name = " + name + " "  +  " Employee salary = " + salary);
}
}

class KIT{
public static void main(String args[]) throws IOException{
InputStreamReader isr = new InputStreamReader(System.in);  //system.in -> gives acces input devise to system
BufferedReader br = new BufferedReader(isr);

System.out.println("Enter the number of Employee : ");
int n = Integer.parseInt(br.readLine());
Employee   emp []= new Employee [n];
//Employee-> collection of all datatype used for operations

for (int i = 0 ; i < emp.length ; i++){
	System.out.print("Enter Employee ID : ");
	int id = Integer.parseInt(br.readLine());
	System.out.print("Enter Employee name : ");
	String name = br.readLine();
	System.out.print("Enter Employee salary : ");
	double salary = Double.parseDouble(br.readLine());

	emp [i] = new Employee (id, name, salary);

/* or Employee e = new Employee(id,name,salary);
      Employee e = emp[i]; */  
}

//traditional for loop ->1995 -> itterate by index
for (int i = 0 ; i <emp.length  ; i++){
	emp[i].display();
}

//enhanced for loop or for each -> 2005 -> ittarte by every elememts
//Employee to define datatype because accessing all the employee data if accessing to integer data then we use int
for (Employee e : emp){
	e.display();
}

}
}
//
//ittrate for elements 2005


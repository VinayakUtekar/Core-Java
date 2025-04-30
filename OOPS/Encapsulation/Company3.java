import java.util.Scanner;

class Employee3
{
	private int EmpId;
	String EmpName;
	private double Salary;
	double Experience;

	Employee3(int  EmpId, String EmpName, double Salary, double Experience)
	{
		this.EmpId = EmpId;
		this.EmpName = EmpName;
		this.Salary = Salary;
		this.Experience = Experience;
	}

	public int getEmpId(){return EmpId;}

	public double getSalary(){return Salary;}

	public void setEmpId(int EmpId){this.EmpId = EmpId;}

	public void setSalary(double Salary){this.Salary = Salary;}

}

public class Company3
{
	Employee3 e;
	public void data()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------->");
		System.out.println("Enter Employee Id : ");
		int id = sc.nextInt(); sc.nextLine();
		System.out.println("Enter Employee Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Employee Salary : ");
		double Salary = sc.nextDouble();
		System.out.println("Enter Employee Year of Experience : ");
		double Experience = sc.nextDouble();
		e = new Employee3(id, name, Salary, Experience);
	}

	public void details()
	{
		System.out.println("########################################################");
		System.out.println("Employee Id : " + e.getEmpId());
		System.out.println("Employee Name : " + e.EmpName);
		System.out.println("Employee Salary : " + e.getSalary());
		System.out.println("Employee Year of Experience : " + e.Experience);
	}

	public static void main(String[] args) 
	{
		//Employee 1
		Company3 ref1 = new Company3();
		ref1.data();

		//Employee 2
		Company3 ref2 = new Company3();
		ref2.data();
		
		//Employee 3
		Company3 ref3 = new Company3();
		ref3.data();

		
		ref1.details();
		
		ref2.details();
		System.out.println("Employee Deducted Salary : " + (ref2.e.getSalary() - ref2.e.getSalary()* 4.5 / 100));

		ref3.details();
		System.out.println("Employee Incremented Salary : " + (ref3.e.getSalary() + ref3.e.getSalary() * 25 / 100));
	}
}
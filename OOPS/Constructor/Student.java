package Constructor;

public class  Student
{
	Student()
	{
		System.out.println("Hello Student");
		System.out.println("------------------------------------------>");
	}

	Student(int a, String name)
	{
		System.out.println("Roll No : " + a);
		System.out.println("Name : " + name);
		System.out.println("------------------------------------------>");
	}

	Student(int a, String name, String course)
	{
		System.out.println("Roll No : " + a);
		System.out.println("Name : " + name);
		System.out.println("Course : " + course);
		System.out.println("------------------------------------------>");
	}

	Student(int a, String name, String course, long phno)
	{
		System.out.println("Roll No : " + a);
		System.out.println("Name : " + name);
		System.out.println("Course : " + course);
		System.out.println("Phone Number : " + phno);
		System.out.println("------------------------------------------>");
	}

	Student(int a, String name, String course, long phno, String add)
	{
		System.out.println("Roll No : " + a);
		System.out.println("Name : " + name);
		System.out.println("Course : " + course);
		System.out.println("Phone Number : " + phno);
		System.out.println("Address : " + add);
		System.out.println("------------------------------------------>");
	}

	Student(int a, String name, String course, long phno, String add, char grade)
	{
		System.out.println("Roll No : " + a);
		System.out.println("Name : " + name);
		System.out.println("Course : " + course);
		System.out.println("Phone Number : " + phno);
		System.out.println("Address : " + add);
		System.out.println("Grade : " + grade);
		System.out.println("------------------------------------------>");
	}

	public static void main(String[] args) 
	{
		Student ref = new Student();
		Student ref3 = new Student(10, "Vinayak");
		Student ref4 = new Student(10, "Vinayak", "Bsc");
		Student ref5 = new Student(10, "Vinayak", "Bsc", 9502435410L);
		Student ref6 = new Student(10, "Vinayak", "Bsc", 9502435410L, "Mumbai");
		Student ref7 = new Student(10, "Vinayak", "Bsc", 9502435410L,"Mumbai",'A');
	}
}
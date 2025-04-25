class School {
	static int roll_no = 1;
	static String name = "Aardhya";
	double percentage = 90.00;
	boolean check = true;

	public void student()
	{
		System.out.println("Non Static-Default Values");
		System.out.println("roll_no : " + roll_no);
		System.out.println("name : " + name);
		System.out.println("percentage : " + this.percentage);
		System.out.println("check : " + this.check);

		String name = "Vinayak";
		double percentage = 86.50;

		System.out.println("Non Static-Values");
		System.out.println("roll_no : " + roll_no);
		System.out.println("name : " + School.name);
		System.out.println("percentage : " + this.percentage);
		System.out.println("check : " + this.check);
		System.out.println("name : " + name);
		System.out.println("percentage : " + percentage);
	}

	static
	{
		School ref2 = new School();

		System.out.println("Static-Default Values");
		System.out.println("roll_no : " + roll_no);
		System.out.println("name : " + name);
		System.out.println("percentage : " + ref2.percentage);
		System.out.println("check : " + ref2.check);

		String name = "Vinayak";
		double percentage = 86.50;

		System.out.println("Static-Values");
		System.out.println("roll_no : " + roll_no);
		System.out.println("name : " + School.name);
		System.out.println("percentage : " + ref2.percentage);
		System.out.println("check : " + ref2.check);
		System.out.println("name : " + name);
		System.out.println("percentage : " + percentage);
	}

	public static void main(String[] args) 
	{
		School ref = new School();
		ref.student();

		System.out.println("Main Method-Default Values");
		System.out.println("roll_no : " + roll_no);
		System.out.println("name : " + name);
		System.out.println("percentage : " + ref.percentage);
		System.out.println("check : " + ref.check);

		String name = "Vinayak";
		double percentage = 86.50;

		System.out.println("Main Method-Values");
		System.out.println("roll_no : " + roll_no);
		System.out.println("name : " + School.name);
		System.out.println("percentage : " + ref.percentage);
		System.out.println("check : " + ref.check);
		System.out.println("name : " + name);
		System.out.println("percentage : " + percentage);

		
	}
}
class School2 {
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
		School2.roll_no = 3;
		School2.name = "Aghao";
		percentage = 70.00;
		check = true;

		System.out.println("Non Static-Updated Values");
		System.out.println("roll_no : " + roll_no);
		System.out.println("name : " + School2.name);
		System.out.println("percentage : " + this.percentage);
		System.out.println("check : " + this.check);
		System.out.println("name : " + name);
		System.out.println("percentage : " + percentage);
	}

	static
	{
		School2 ref2 = new School2();

		System.out.println("Static-Default Values");
		System.out.println("roll_no : " + roll_no);
		System.out.println("name : " + name);
		System.out.println("percentage : " + ref2.percentage);
		System.out.println("check : " + ref2.check);

		String name = "Vinayak";
		double percentage = 86.50;
		School2.roll_no = 2;
		School2.name = "Omkar";
		ref2.percentage = 60.00;
		ref2.check = false;

		System.out.println("Static-Updated Values");
		System.out.println("roll_no : " + roll_no);
		System.out.println("name : " + School2.name);
		System.out.println("percentage : " + ref2.percentage);
		System.out.println("check : " + ref2.check);
		System.out.println("name : " + name);
		System.out.println("percentage : " + percentage);
	}

	public static void main(String[] args) 
	{
		School2 ref = new School2();
		ref.student();

		System.out.println("Main Method-Default Values");
		System.out.println("roll_no : " + roll_no);
		System.out.println("name : " + name);
		System.out.println("percentage : " + ref.percentage);
		System.out.println("check : " + ref.check);

		String name = "Vinayak";
		double percentage = 86.50;
		School2.roll_no = 2;
		School2.name = "Omkar";
		ref.percentage = 60.00;
		ref.check = false;

		System.out.println("Main Method-Updated Values");
		System.out.println("roll_no : " + roll_no);
		System.out.println("name : " + School2.name);
		System.out.println("percentage : " + ref.percentage);
		System.out.println("check : " + ref.check);
		System.out.println("name : " + name);
		System.out.println("percentage : " + percentage);

		
	}
}
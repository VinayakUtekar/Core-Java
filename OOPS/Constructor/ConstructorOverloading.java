class  ConstructorOverloading
{
	ConstructorOverloading()
	{
		System.out.println("No Argument Constructor");
	}

	ConstructorOverloading(int a)
	{
		System.out.println("1 Paramiterized Constructor");
		System.out.println("a : " + a);
	}

	ConstructorOverloading(int a, int b)
	{
		System.out.println("2 Paramiterized Constructor");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}

	ConstructorOverloading(int a, int b, int c)
	{
		System.out.println("3 Paramiterized Constructor");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
	}

	ConstructorOverloading(int a, int b, int c, int d)
	{
		System.out.println("4 Paramiterized Constructor");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
	}

	public static void main(String[] args) 
	{
		ConstructorOverloading ref = new ConstructorOverloading(10,20,30);
		ConstructorOverloading ref2 = new ConstructorOverloading();
		ConstructorOverloading ref3 = new ConstructorOverloading(10,20,30,40);
		ConstructorOverloading ref4 = new ConstructorOverloading(10,20);
		ConstructorOverloading ref5 = new ConstructorOverloading(10);
	}
}
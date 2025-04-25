package Constructor;

class  ConstructorTypes
{
	ConstructorTypes()
	{
		System.out.println("No Argument Constructor");
	}

	ConstructorTypes(int a)
	{
		System.out.println("Paramiterized Constructor");
		System.out.println("a : " + a);
	}

	public static void main(String[] args) 
	{
		int a = 10;

		ConstructorTypes ref = new ConstructorTypes();
		System.out.println(ref);
	
		ConstructorTypes ref2 = new ConstructorTypes(a);
		System.out.println(ref2);
	}
}
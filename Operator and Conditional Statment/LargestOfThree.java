public class LargestOfThree {
    public static void Largest(int a, int b, int c)//Called Method //Parameterized Argument//2 Formal Arguments
	{
		if((a>b)&&(a>c))
		{
			System.out.println(a + " Is The Largest Number");
		}
		else if((b>a)&&(b>c))
		{
			System.out.println(b + " Is The Largest Number");
		}
		else
		{
			System.out.println(c + " Is The Largest Number");
		}
	}
	public static void main(String[] args) // Calling Method
	{
		Largest(35,-10,-5);
		Largest(5,2,1);
		Largest(2,5,1);
		Largest(0,2,10);
		Largest(5,2,-1);
	}
}

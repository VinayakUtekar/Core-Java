public class SmallestFive {
    public static void Smallest(int a, int b, int c, int d, int e)//Called Method //Parameterized Argument//2 Formal Arguments
	{
		if((a<b)&&(a<c)&&(a<d)&&(a<e))
		{
			System.out.println(a + " Is The Smallest Number");
		}
		else if((b<c)&&(b<d)&&(b<e))
		{
			System.out.println(b + " Is The Smallest Number");
		}
		else if((c<d)&&(c<e))
		{
			System.out.println(c + " Is The Smallest Number");
		}
		else if((d<e))
		{
			System.out.println(d + " Is The Smallest Number");
		}
		else
		{
			System.out.println(e + " Is The Smallest Number");
		}
	}
	public static void main(String[] args) // Calling Method
	{
		Smallest(35,-10,-5,5,2);//Method Calling Statment
		Smallest(35,10,5,5,2);
	}
}

public class NLargest {
    public static double Largest(double a, double b)
	{
		double res = 0;
		if(a<b)
		{
			a=b;
		}
		res = a;
		return res;
	}

	public static double Largest(double a, double b, double c)
	{
		if(a<b)
		{
			a=b;
		}
		else if(a<c)
		{
			a=c;
		}
		double res = a;
		return res;
	}

	public static double Largest(double a, double b, double c, double d)
	{
		if(a<b)
		{
			a = b;
		}
		else if(a<c)
		{
			a=c;
		}
		else if(a<d)
		{
			a=d;
		}
		double res = a;
		return res;
	}

	public static double Largest(double a, double b, double c, double d, double e)
	{
		if(a<b)
		{
			a = b;
		}
		else if(a<c)
		{
			a=c;
		}
		else if(a<d)
		{
			a=d;
		}
		else if(a<e)
		{
			a=e;
		}
		double res = a;
		return res;
	}

	public static double Largest(double a, double b, double c, double d, double e, double f)
	{
		if(a<b)
		{
			a = b;
		}
		else if(a<c)
		{
			a=c;
		}
		else if(a<d)
		{
			a=d;
		}
		else if(a<e)
		{
			a=e;
		}
		else if(a<f)
		{
			a=f;
		}
		double res = a;
		return res;
	}
	public static void main(String[] args) 
	{
		double res1 = Largest(10,20);
		double res2 = Largest(10,20,30);
		double res3 = Largest(10,20,30,40);
		double res4 = Largest(10,20,30,40,50);
		double res5 = Largest(10,20,30,40,50,60);
		System.out.println("Largest of 2 Nos : " + res1);
		System.out.println("Largest of 3 Nos : " + res2);
		System.out.println("Largest of 4 Nos : " + res3);
		System.out.println("Largest of 5 Nos : " + res4);
		System.out.println("Largest of 6 Nos : " + res5);
	}
}

class Specs2
{
	private String Brand ; //State//Variables
	private double Price ; //State//Variables

	public void Myopia() //Behaviour//Method
	{
		System.out.println("Long Distance Powered Glasses");	
	}

	public void Presbyopia() //Behaviour//Method
	{
		System.out.println("Close Distance Powered Glasses");	
	}

	public void Hetropiya() //Behaviour//Method
	{
		System.out.println("Both Long and Close Distance Powered Glasses");	
	}

	public void UV_Protection() //Behaviour//Method
	{
		System.out.println("Day and Night Glasses");	
	}

	public void Screen_Protection() //Behaviour//Method
	{
		System.out.println("Screen_Protection Glasses");	
	}
}

//Driver Class
public class MumbaiOptics2
{
	public static void main(String[] args) 
	{
		Specs2 ref = new Specs2();
		System.out.println("Brand : " + ref.Brand);
		System.out.println("Price : " + ref.Price);
		ref.Myopia();
		ref.Presbyopia();
		ref.Hetropiya();
		ref.UV_Protection();
		ref.Screen_Protection();
	}
}
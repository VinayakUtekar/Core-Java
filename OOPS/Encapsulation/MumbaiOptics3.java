class Specs3
{
	private String Brand ; //State//Variables
	private double Price ; //State//Variables

	public void setBrand(String Brand)
	{
		this.Brand = Brand;
	}

	public void setPrice(double Price)
	{
		this.Price = Price;
	}

	public String getBrand()
	{
		return Brand;	
	}

	public double getPrice()
	{
		return Price;	
	}

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
public class MumbaiOptics3
{
	public static void main(String[] args) 
	{
		Specs3 ref = new Specs3();

		ref.setBrand("Lenskart");
		ref.setPrice(2000);
		System.out.println("Brand : " + ref.getBrand());
		System.out.println("Price : " + ref.getPrice());
		ref.Myopia();
		ref.Presbyopia();
		ref.Hetropiya();
		ref.UV_Protection();
		ref.Screen_Protection();
	}
}
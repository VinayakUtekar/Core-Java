public class ProductOverloading 
{
	int prd_id;
	String prd_name;
	String prd_brand;
	double price;

	ProductOverloading()
	{
		System.out.println("No Argument Constructor");
	}

	ProductOverloading(int prd_id)
	{
		System.out.println("1 FA Constructor");
		this.prd_id = prd_id;
	}

	ProductOverloading(int prd_id, String prd_name)
	{
		this(prd_id);
		System.out.println("2 FA Constructor");
		this.prd_name = prd_name;
	}

	ProductOverloading(int prd_id, String prd_name, String prd_brand)
	{
		this(prd_id, prd_name);
		System.out.println("3 FA Constructor");
		this.prd_brand = prd_brand;
	}

	ProductOverloading(int prd_id, String prd_name, String prd_brand, double price)
	{
		this(prd_id, prd_name, prd_brand);
		System.out.println("4 FA Constructor");
		this.price = price;
	}

	public void ProductOverloading_details()
	{
		System.out.println("ProductOverloading Prd_id : " + this.prd_id);
		System.out.println("ProductOverloading Prd_name : " + this.prd_name);
		System.out.println("ProductOverloading Prd_brand : " + this.prd_brand);
		System.out.println("ProductOverloading Price : " + this.price);
		System.out.println("--------------------------------------------->");
	}

	public static void main(String[] args) 
	{
		ProductOverloading ref1 = new ProductOverloading(1, "Bat", "SM", 4500.50);
		ref1.ProductOverloading_details();
	}
}
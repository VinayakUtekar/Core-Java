class ATM2 
{
	private double money = 1000000; //State//Variables
	public void withdraw() //Behaviour//Method
	{
		System.out.println("Withdraw Cash ------>");	
	}
	
}

//Driver Class
public class Bank2
{
	public static void main(String[] args) 
	{
		ATM2 ref = new ATM2();
		System.out.println("Money : " + ref.money);
		ref.withdraw();
	}
}
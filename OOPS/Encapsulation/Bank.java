class ATM 
{
	double money = 1000000; //State//Variables
	public void withdraw() //Behaviour//Method
	{
		System.out.println("Withdraw Cash ------>");	
	}
	
}

//Driver Class
public class Bank
{
	public static void main(String[] args) 
	{
		ATM ref = new ATM();
		System.out.println("Money : " + ref.money);
		ref.withdraw();
	}
}
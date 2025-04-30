class ATM3
{
	private double money = 1000000; //State//Variables

	public double getMoney()
	{
		return money;	
	}

	public void setMoney(double money)
	{
		this.money = money;
	}

	public void withdraw() //Behaviour//Method
	{
		System.out.println("Withdraw Cash ------>");	
	}
	
}

//Driver Class
class Bank3
{
	public static void main(String[] args) 
	{
		ATM3 ref = new ATM3();

		ref.setMoney(130000);
		System.out.println("Money : " + ref.getMoney());
		ref.withdraw();
	}
}
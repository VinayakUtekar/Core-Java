class ICICIBankSavingAccount4 
{
	String un;
	int acc_number;
	double balance;
	static String b_name = "ICICI_BANK";

	public void account_details()
	{
		
		System.out.println("New User -------------------> ");
		System.out.println("Account Holder Name : " + un);
		System.out.println("Account Number : " + acc_number);
		System.out.println("Account Balance : " + balance);
		System.out.println("Bank Name : " + b_name);
	}
	
	static
	{
		System.out.println("Login Successfully");
	}
	//IIB
	{
		System.out.println("ICICI Bank Saving Account is Ready to Use!!");
	}

	public static void main(String[] args) 
	{
		ICICIBankSavingAccount4 ref1 = new ICICIBankSavingAccount4();
		ref1.un = "Vinayak";
		ref1.acc_number = 9524253;
		ref1.balance = 20000.145;
		ref1.account_details();

		ICICIBankSavingAccount4 ref2 = new ICICIBankSavingAccount4();
		ref2.un = "Omkar";
		ref2.acc_number = 9542846;
		ref2.balancen = 1000.6;
		ref2.account_details();

		
		ICICIBankSavingAccount4 ref3 = new ICICIBankSavingAccount4();
		ref3.un = "Aaradhya";
		ref3.acc_number = 2586496;
		ref3.balance = 100000.89;
		ref3.account_details();
	}
}
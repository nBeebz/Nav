// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, and get a String representation
// of the account.
//************************************************************
public class Account
{
	private static int numAccounts = 0;
	private double balance;
	private String name;
	private long acctNum;
	//-------------------------------------------------
	//Constructor -- initializes balance, owner, and account number
	//-------------------------------------------------
	public Account(double initBal, String owner, long number)
	{
		balance = initBal;
		name = owner;
		acctNum = number;
		++numAccounts;
	}
	
	public Account(double initBal, String owner){
		balance = initBal;
		name = owner;
		acctNum =(long)(1+(Math.random()*Long.MAX_VALUE));
		++numAccounts;
		
	}
	
	public Account(String owner){
		balance = 0;
		name = owner;
		acctNum =(long)(1+(Math.random()*Long.MAX_VALUE));
		++numAccounts;
	}
	
	//-------------------------------------------------
	// Checks to see if balance is sufficient for withdrawal.
	// If so, decrements balance by amount; if not, prints message.
	//-------------------------------------------------
	public void withdraw(double amount)
	{
		if (balance >= amount)
			balance -= amount;
		else
			System.out.println("Insufficient funds");
	}
	
	public void withdraw(double amount, double fee){
		if (balance >= amount+fee)
			balance -= amount+fee;
		else
			System.out.println("Insufficient funds");
	}
	//-------------------------------------------------
	// Adds deposit amount to balance.
	//-------------------------------------------------
	public void deposit(double amount)
	{
		balance += amount;
	}
	//-------------------------------------------------
	// Returns balance.
	//-------------------------------------------------
	public double getBalance()
	{
		return balance;
	}
	//-------------------------------------------------
	// Returns a string containing the name, account number, and balance.
	//-------------------------------------------------
	public String toString()
	{
		return "Name:" + name +
				"\nAccount Number: " + acctNum +
				"\nBalance: " + balance + "\n";
	}
	
	public static int getNumAccounts(){
		return numAccounts;
	}
	
	public void close(){
		name+="CLOSED";
		balance = 0;
		--numAccounts;
	}
	
	public static Account consolodate(Account acct1, Account acct2){
		String newName;
		double newBalance;
		Account newAcct;
		if(acct1.name.equals(acct2.name) && acct1.acctNum != acct2.acctNum){
			newName = acct1.name;
			newBalance = acct1.balance+acct2.balance;
			newAcct = new Account(newBalance, newName);
			acct1.close();
			acct2.close();
		}else{
			System.out.println("Error, accounts cannot be consolodated");
			newAcct = null;
		}
		return newAcct;
	}
}
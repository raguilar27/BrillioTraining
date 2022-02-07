
public class AccountManagement {
	int balanceCheck;
	
	public AccountManagement(int balanceCheck) {
		this.balanceCheck = balanceCheck;
	}
	
	public void moneyDeposit(int deposit) {
		this.balanceCheck += deposit;
	}
	
	public void modeWithdrawl(int withdrawl) {
		this.balanceCheck -= withdrawl;
	}
	
	public void freshBalanceCheck() {
		System.out.println(this.balanceCheck);
	}
	
	/*
	 * //Java Program to demonstrate the working of a banking-system  
	//where we deposit and withdraw amount from our account.  
	//Creating an Account class which has deposit() and withdraw() methods  
	
	class Account{  
	int acc_no;  
	String name;  
	float amount;  
	
	//Method to initialize object  
	void insert(int a,String n,float amt){  
		acc_no=a;  
		name=n;  
		amount=amt;  
	}  
	
	//deposit method  
	void deposit(float amt){  
		amount=amount+amt;  
		System.out.println(amt+" deposited");  
	}  
	
	//withdraw method  
	void withdraw(float amt){  
		if(amount<amt){  
			System.out.println("Insufficient Balance");  
		}else{  
			amount=amount-amt;  
		System.out.println(amt+" withdrawn");  
		}  
	}  
	
	//method to check the balance of the account  
	void checkBalance(){System.out.println("Balance is: "+amount);}  
	
	//method to display the values of an object  
	void display(){System.out.println(acc_no+" "+name+" "+amount);}  
	}  
	
	//Creating a test class to deposit and withdraw amount  
	class TestAccount{  
	public static void main(String[] args)
*/
}
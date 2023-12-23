import java.util.*;
class BankAcc
{
	int accno;
	double balance;
	String cname;
	void setData(String c,int a,double b)
	{
		accno=a;
		cname=c;
		balance=b;
	}
	void getData()
	{
		System.out.println("Account number:"+accno);
		System.out.println("Customer name:"+cname);
		System.out.println("Balance:"+balance);
	}
	void Withdraw(double amt)
	{
		if(balance>=amt)
		{
			balance=balance-amt;
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
	void Deposit(double amt)
	{
		balance=balance+amt;
		
	}
	void checkBalance()
	{
		System.out.println("Balance is:"+balance);
	}
	void updatename()
	{
		//String name;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter new name:");
		cname=scan.nextLine();
		getData();
	}
		
}

class BankAccount
{
	public static void main(String args[])
	{
		int ano;
		String cn;
		double bal;
		System.out.println("Navaneeth K.B   Roll no.:6");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter account number:");
		ano=scan.nextInt();
		System.out.println("Enter customer name:");
		cn=scan.nextLine();
		cn=scan.nextLine();
		System.out.println("Enter balance:");
		bal=scan.nextDouble();
		BankAcc b1=new BankAcc();
		b1.setData(cn,ano,bal);
		b1.getData();
		b1.checkBalance();
		System.out.println("\n");
		double wt;
		System.out.println("Enter amount to withdraw:");
		wt=scan.nextDouble();
		b1.Withdraw(wt);
		System.out.println("\n");
		System.out.println("Enter amount to deposit:");
		double amount;
		amount =scan.nextDouble();
		b1.Deposit(amount);
		b1.updatename();
	}
}

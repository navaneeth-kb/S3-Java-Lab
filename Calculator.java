import java.util.*;
class Calculator
{
	public static void main(String args[])
	{
		int ch;
		System.out.println("Navaneeth K.B   Roll no.:6");
		double num1,num2,sum=0,prod=1,div=1,sub=0;
		do
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("\n");
			System.out.println("Enter 1st number:");
			num1=scan.nextDouble();
			System.out.println("Enter 2nd number:");
			num2=scan.nextDouble();
			System.out.println("Enter your choice(1-Addition\n 2-Subtraction\n 3-Multiplication\n 4-Division)");
			
			ch=scan.nextInt();
			switch(ch)
			{
				case 1:sum=num1+num2;
					System.out.println("Sum="+sum);
					break;
				case 2:sub=num1-num2;
					System.out.println("Difference="+sub);
					break;
				case 3:prod=num1*num2;
					System.out.println("Product="+prod);
					break;
				case 4:sum=num1/num2;
					System.out.println("Quotient="+div);
					break;
				default: System.out.println("Invalid choice");
					break;
			}
		}while (true);
		
	}
}

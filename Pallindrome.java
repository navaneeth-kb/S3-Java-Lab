import java.util.*;
class Pallindrome
{
	public static void main(String args[])
	{
		int num,n=0,dig=1,rev=0,i;
		System.out.println("Navaneeth K.B.  roll no=6 ");
		System.out.println("Enter the number:");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		
		for(i=num;i>0;i=i/10)
		{
			dig=i%10;
			rev=(rev*10)+dig;
			//num=num/10;
		}
		System.out.println("Reversed number is "+rev);
		if(rev==num)
		{
			System.out.println("The given number is a pallindrome");
		}
		else
		{
			System.out.println("The given number is not a pallindrome");
		}
	}
}

import java.util.*;
class OddEven
{
	public static void main(String args[])
	{
		int num,n=0,dig=1,rev=0;
		System.out.println("kiran km  56");
		System.out.println("enter no");
		Scanner s =new Scanner(System.in);
		while (num>0)
		{
			 dig=num%10;
			 rev=(rev*10)+dig;
			 num=num/10;
		}
		System.out.println("rev is "+rev);
		}
	}	
		

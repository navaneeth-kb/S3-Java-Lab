import java.util.*;
class Bubble
{
	public static void main(String args[])
	{
		int arr[]=new int[50];
		int n,i=0,j=0,temp=0,num;
		System.out.println("Sagar  SK  Roll no.:40");
		System.out.println("Enter size:");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		System.out.println("Enter array elements:");
		for (i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(i=0;i<(n-1);i++)
		{
			for(j=0;j<(n-i-1);j++)
			{
				if(arr[j]>arr[j+1])
				{	
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted array:");
		for (i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}

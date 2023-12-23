import java.util.*;
class Grade
{
	public static void main(String args[])
	{
		int score;
		System.out.println("Navaneeth K.B   Roll no.:6");
		System.out.println("Enter your score:");
		Scanner scan=new Scanner(System.in);
		score=scan.nextInt();
		if(score>=90)
		{
			System.out.println("Grade:A");
		}
		else if(score>=80)
		{
			System.out.println("Grade is B");
		}
		else if(score>=70)
		{
			System.out.println("Grade is C");
		}
		else if(score>=60)
		{
			System.out.println("Grade is D");
		}
		else if(score>=50)
		{
			System.out.println("Grade is E");
		}
		else 
		{
			System.out.println("Grade is F");
		}
	}
}


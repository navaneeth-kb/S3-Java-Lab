import java.util.*;
class Animals 
{
	String name;
	int age;
	int legs;
	Animals(String n,int a,int l)
	{
		name=n;
		age=a;
		legs=l;
	}
	void getData()
	{
		System.out.println("The name of the animal is"+name);
		System.out.println("The age of the animal is"+age);
	}
	void Move()
	{
		System.out.println(name+ "is moving");
	}
	void legs()
	{
		System.out.println("The number of legs"+legs);
	}
}
class Mammals extends Animals
{
	String type;
	int gest;
	Mammals(String n,int a,int l,String t,int g)
	{
		super(n,a,l);
		type=t;
		gest=g;
	}
	void Data()
	{
		System.out.println("The type of the mammal is "+type);
		System.out.println("Gestation period"+gest);
	}
	void givesBirth()
	{
		System.out.println("Gives birth");
	}
	
}
class NonMammals extends Animals
{
	int incub;
	NonMammals(String n,int a,int l,int i)
	{
		super(n,a,l);
		incub=i;
	}
	void Incubation()
	{
		System.out.println("Incubation period:"+incub);
	}
	void layEggs()
	{
		System.out.println("lay eggs");
	}
}
class AnimalsDemo
{
	public static void main(String args[])
	{
		int ch,ag,lg;
		String nm;
		Scanner scan=new Scanner(System.in);
		System.out.println("Kiran ");
		while(true)
		{
			System.out.println("\n");
			System.out.println("Enter your choice(1-Mammals 2-Non mammals 3-exit)");
			ch=scan.nextInt();
			
		
		
			switch(ch)
			{		
				case 1:
				String ty;
				int gs;
				System.out.println("Enter the name of the animal:");
				nm=scan.nextLine();
				nm=scan.nextLine();
				System.out.println("Enter its age:");
				ag=scan.nextInt();
				System.out.println("Enter the number of legs:"); 
				lg=scan.nextInt();
				System.out.println("Enter type:");
				ty=scan.nextLine();
				ty=scan.nextLine();
				System.out.println("Enter gestation period:");
				gs=scan.nextInt();
				Mammals m1=new Mammals(nm,ag,lg,ty,gs);
				m1.getData();
				m1.Data();
				m1.Move();
				m1.legs();
				m1.givesBirth();
				break;
				
				case 2:
				int ic;
				System.out.println("Enter the name of the animal:");
				nm=scan.nextLine();
				nm=scan.nextLine();
				System.out.println("Enter its age:");
				ag=scan.nextInt();
				System.out.println("Enter the number of legs:"); 
				lg=scan.nextInt();
				System.out.println("Enter incubation period:");
				ic=scan.nextInt();
				NonMammals n1=new NonMammals(nm,ag,lg,ic);
				n1.getData();
				n1.Incubation();
				n1.layEggs();
				break;
			
				case 3:
				System.exit(0);
				break;
			}
		}
	}
}




		
	

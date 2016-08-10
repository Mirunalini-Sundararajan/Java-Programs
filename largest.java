import java.util.*;
class largest
{
	public static void main(String [] args)
	{
		Scanner S=new Scanner(System.in);
		int []n=new int[3];
		System.out.println("Enter the 3 numbers");
		for(int i=0;i<3;i++)
		{
			n[i]=S.nextInt();
		}
		if(n[0]>n[1]&&n[1]>n[2])
		{
			System.out.println(n[0] + " is the Largest number");
		}
		else if(n[1]>n[2])
		{
			System.out.println(n[1] +" is the Largest number");
		}
		else
		{
			System.out.println(n[2] +" is the Largest number");
	
		}
	}
}
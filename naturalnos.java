import java.util.*;
class naturalnos
{
	public static void main(String [] args)
	{
		Scanner S=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the Range of the Natural numbers to be added");
		int n=S.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("The sum of "+n+" natural numbers is "+ sum);
	}
}
import java.util.*;
class sum
{
	public static void main(String args[])
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=S.nextInt();
		int sum=0;
		for(int i=0;i<=3;i++)
		{
			sum+=i;
		}
		System.out.println("Sum = "+sum);
	}
}	
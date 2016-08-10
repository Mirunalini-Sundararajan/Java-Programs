import java.util.*;
class sum
{
	public static void main(String [] args)
	{
		Scanner S=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the N value");
		int N=S.nextInt();
		for(int i=1;i<=N;i++)
		{
			sum+=i;
		}
		System.out.println("Sum = "+ sum);
	}
}
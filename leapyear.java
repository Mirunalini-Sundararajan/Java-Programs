import java.util.*;
class leapyear
{
	public static void main(String [] args)
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the year ");
		int year=S.nextInt();
		if(year%4==0)
			System.out.println("Leap Year");
		else
			System.out.println("Not a Leap Year");
	}
}	
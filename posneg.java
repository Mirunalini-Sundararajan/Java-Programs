package posneg;

import java.util.Scanner;

public class posneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
		if(n!=0)
		{
			if(n>0)
			{
				System.out.println("Positive");
			}
			else
			{
				System.out.println("Negative");
			}
		}
		else
		{
			System.out.println("Zero");
		}
	}
}

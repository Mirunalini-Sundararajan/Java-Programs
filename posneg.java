package posneg;

import java.util.Scanner;

public class posneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=S.nextInt();
		if(n>0)
		{
			System.out.println("Given number is a Positive number");
		}
		else if(n==0)
		{
			System.out.println("Given number is zero");
		}
		else
		{
			System.out.println("Given no is a negative number");
		}

	}

}

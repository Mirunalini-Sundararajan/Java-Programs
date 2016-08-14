package temporary;

import java.util.Scanner;

public class temporary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		int a,b,temp=0;
		System.out.println("Enter the two number for Swapping");
		a=S.nextInt();
		b=S.nextInt();
		temp=a;
		a=b;b=temp;
		System.out.println("The numbers after swapping...");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		

	}

}

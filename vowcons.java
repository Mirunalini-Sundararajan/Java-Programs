package vowcons;

import java.util.Scanner;

public class vowcons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the character");
		String s=S.next();
		if(s.equals('a') || s.equals('e') || s.equals('i') || s.equals('o') || s.equals('u') || s.equals('A') || s.equals('E') || s.equals('I') || s.equals('O') || s.equals('U') )
		{
			System.out.println(s+" - Vowel");
		}
		else
		{
			System.out.println(s+" - Consonant");
		}

	}

}

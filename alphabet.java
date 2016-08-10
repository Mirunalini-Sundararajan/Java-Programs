import java.util.*;
class alphabet
{
	public static void main(String [] args)
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter One character to check");
		String s=S.next();
		char[] ss=s.toCharArray();
		if(Character.isAlphabetic(ss[0]))
			System.out.println("Alphabet");
		else
			System.out.println("Not an Alphabet");
	}
}
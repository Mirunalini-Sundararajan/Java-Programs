import java.util.*;
class wordcount
{
	public static void main(String args[])
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=S.nextLine();
		String ss[]=s.split(" ");
		System.out.println("The total number of words in the given sentences are "+ss.length);
	}
}
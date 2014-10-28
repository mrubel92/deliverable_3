import java.util.*;

public class StringModify
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		String inString;
		
		System.out.println("Welcome to the String Modify program!");
		System.out.println("Please enter the String you would like to modify");
		inString = input.next();
		
		System.out.println("1. Reverse String");
		System.out.println("2. Remove Letters");
		System.out.println("3. Add Letters");
		System.out.println("Please enter the number corresponding to the modification you would like: ");
		int modtype = input.nextInt();
		
		if(modtype < 1 || modtype > 3)
		{
			System.out.println("Invalid modtype entered");
			System.exit(0);
		}
		if(modtype == 1)
		{
			String reversed = reverse(inString);
			System.out.println("Your reversed string is: " + reversed);
		}
		if(modtype == 2)
		{
			System.out.println("Please enter number of characters you would like to remove from the string");
			int chars = input.nextInt();
			String removed = remove(inString, chars);
			System.out.println("Your modified string is: " + removed);
			
		}
		if(modtype == 3)
		{
			System.out.println("Please enter the string you would like to add to your original string: ");
			String toAdd = input.next();
			String added = add(inString, toAdd);
			System.out.println("Your appended string is: " + added);
		}	
		
	}
	
	public static String reverse(String in)
	{
		String rev = new StringBuilder(in).reverse().toString();
		return rev;
	}
	
	public static String remove(String in, int chars)
	{
		int length = in.length();
		if(chars > length || length < 0)
		{
			System.out.println("Error with remove function");
			System.exit(0);
		}
		return in.substring(0, length-chars);
	}
	
	public static String add(String in, String add)
	{
		String ret = in + add;
		return ret;
	}

}
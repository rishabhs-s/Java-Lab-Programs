/*4.Write a program in Java to create a String object. Initialize this object with your name. Find the length of your name using the appropriate String method. Find whether the character ‘a’ is in your name or not; if yes find the number of times ‘a’ appears in your name. Print locations of occurrences of ‘a’ .Try the same for different String objects*/
public class Exp8d
{
	public static void main(String args[])
	{
		String name="rishabh sharma";
		int c=0;
		int l=name.length();
		for (int i=0;i<l;i++)
		{
			if (name.charAt(i)=='a')
			{
				c=c+1;
			}
		}
		if (c==0)
		{
			System.out.println("THERE IS NO a IN YOUR NAME");
		}
		else
		{
			System.out.println("TOTAL NUMBER OF A:"+c);
			System.out.println("POSSITION OF a:");
			for (int i=0;i<l;i++)
			{
				if(name.charAt(i)=='a')
				{
					System.out.println(i);
				}
			}
		}
	}
}

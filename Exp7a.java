/*1. Write a program in Java to display the names and roll numbers of students. Initialize respective array variables for 10 students. Handle ArrayIndexOutOfBoundsExeption, so that any such problem doesn't cause illegal termination of program*/
import java.util.*;
class Exp7a
{
	public static void main(String args[])
	{
		String name[]=new String[10];
		int roll[]=new int[10];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			System.out.println("enter your name - ");
			name[i]=s.nextLine();
			System.out.println("enter your rollNumber - ");
			roll[i]=s.nextInt();
			s.nextLine();
		}
		try
		{
			System.out.println("enter the student number whose details you want to see");
			int n=s.nextInt();
			System.out.println(name[n]);
			System.out.println(roll[n]);
			
}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Occured: "+e);
			
}
	}
}


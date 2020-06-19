//Q.Write a program to add two number using command line arguments.

import java.util.*;
public class Exp2b{
    public static void main(String []args)
    {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=a+b;
		System.out.println("Add is:"+c);
	}
}

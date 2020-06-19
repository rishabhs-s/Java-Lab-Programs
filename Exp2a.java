import java.util.*;
public class Exp2a{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		if (x >= y && x >= z)
		System.out.println( x + " is the maximum number.");
		else if (y >= x && y >= z)
		System.out.println( y + " is the maximum number.");
		else
		System.out.println( z + " is the maximum number.");
}
}

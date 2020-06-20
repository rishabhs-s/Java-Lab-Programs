/*Write a program in Java to create a Player class. Inherit the classes Cricket _Player, Football _Player and Hockey_ Player from Player class*/
import java.util.*;
class Player
{
	public String player_name,state;
	public int age;
	Scanner s=new Scanner(System.in);
	public void getinfo()
	{
		System.out.println("enter the name");
		player_name=s.nextLine();
	}
	public void showinfo()
	{
		System.out.println("Name:"+player_name);
	}
}
class Cricket extends Player
{
	public Cricket()
	{
		System.out.println("CRICKET");
	}
	public void show()
	{
		System.out.println("Plays cricket");
		System.out.println();
	}
}
class Football extends Player
{
	public Football()
	{
		System.out.println("FOOTALL");
	}
	public void show()
	{
		System.out.println("Plays Football");
		System.out.println();
	}
}
class Hockey extends Player
{
	public Hockey()
	{
		System.out.println("HOCKEY");
	}
	public void show()
	{
		System.out.println("plays hockey");
	}
}
public class Exp4b
{
	public static void main(String args[])
	{
		Cricket c=new Cricket();
		c.getinfo();
		c.showinfo();
		c.show();
		Football f=new Football();
		f.getinfo();
		f.showinfo();
		f.show();
		Hockey h=new Hockey();
		h.getinfo();
		h.showinfo();
		h.show();
	}
}

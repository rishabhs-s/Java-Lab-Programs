/*Write a class Worker and derive classes DailyWorker and SalariedWorker from it. Every worker has a name and a salary rate. Write method ComPay (int hours) to compute the week pay of every worker. A Daily Worker is paid on the basis of the number of days he/she works. The Salaried Worker gets paid the wage for 40 hours a week no matter what the actual hours are. Test this program to calculate the pay of workers. You are expected to use the concept of polymorphism to write this program.*/
import java.util.*;
class Worker
{
	public String name;
	public double salary_rate,salary;
	public void compay()
	{
	}	
	public void getinfo()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		name=s.nextLine();
		System.out.println("Enter the salary rate");
		salary_rate=s.nextDouble();
	}
	public void showinfo()
	{
		System.out.println("Name:"+name);
		System.out.println("SAlary:"+salary);
	}
}
class Daily_worker extends Worker
{
	public Daily_worker()
	{
		System.out.println("daily worker");
	}
	
	public void compay(int hours)
	{
		salary=hours*salary_rate;
	}
}
class Salaried_worker extends Worker
{
	public Salaried_worker()
	{
		System.out.println("salaried worker");
	}
	public void compay()
	{
		salary=40*salary_rate;
	}
}
public class Exp4c
{
	public static void main(String args[])
	{
		int h;
		Scanner s=new Scanner(System.in);
		Daily_worker d=new Daily_worker();
		System.out.println("enter the hours");
		h=s.nextInt();
		d.getinfo();
		d.compay(h);
		d.showinfo();
		System.out.println();
		Salaried_worker sa=new Salaried_worker();
		sa.getinfo();
		sa.compay();
		sa.showinfo();
	}
}

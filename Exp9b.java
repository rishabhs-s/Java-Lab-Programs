/*Q2. Write a program for generating 2 threads, one for printing even numbers and the other for printing odd numbers.*/
class MyThread1 extends Thread {
public void run(){
System.out.println("\nPrinting even numbers");
for(int i=0;i<=10;i+=2) {
System.out.println("EVEN" + i);
        }
    }
}
class MyThread2 extends Thread{
public void run(){
System.out.println("\nPrinting odd numbers");
for(int i=1;i<=10;i+=2) {
System.out.println("ODD" + i);
        }
    }  
 }
public class Exp9b {

public static void main(String[] args) {
       MyThread1 t1= new MyThread1();
	t1.run();
	   MyThread2 t2= new MyThread2();
	t2.run();
	
    }
}

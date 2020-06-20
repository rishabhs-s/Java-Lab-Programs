/*WRITE A PROGRAM TO MAKE A PACKAGE BALANCE. THIS HAS AN ACCOUNT CLASS WITH DISPLAY_BALANCE METHOD. IMPORT BALANCE PACKAGE IN ANOTHER PROGRAM TO ACCESS DISPLAY_BALANCE METHOD OF ACCOUNT CLASS. */
import rishabh.Balance.Account;
import java.util.*;
public class Exp6b
{
public static void main(String args[])
 {
  Scanner i=new Scanner(System.in);
System.out.println("Enter amount to pay");
double amount=i.nextDouble();

  Account obj=new Account();
obj.Display_Balance(amount);
 }
}

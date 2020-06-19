//Q)	Write a program to implement a command line calculator
import java.util.*;
public class Exp2d{
public static void main(String args[])
{ 
        int x = Integer.parseInt(args[0]);
        String op = args[1];
        int y = Integer.parseInt(args[2]);
        int z=0;
        
        if (op.equals("+")) {
            z = x+y;
        } else if (op.equals("-")){
            z = x-y;
        } else if (op.equals("*")){
            z = x*y;
        } else if(op.equals("/")){
            z = x/y;
        } 
        System.out.println(z);
    }
}
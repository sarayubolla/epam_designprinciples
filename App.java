package cal.task3;

import java.util.Scanner;

 
public class App {
    	    public static void main(String args[])
    	    {
    	       int a, b, res;
    	       char ch;
    	       Scanner scan = new Scanner(System.in);
    		   
    	       System.out.print("Enter 1st Number : ");
    	       a = scan.nextInt();
    	       System.out.print("Enter 2nd Number : ");
    	       b = scan.nextInt();
    	       System.out.print("Enter Operator to be selected(+, -, *, /) : ");
    	       ch = scan.next().charAt(0);
    		   
    	       if(ch == '+')
    	       {
    	            res = a + b;
    	            System.out.print("Result = " +res);
    	       }
    	       else if(ch == '-')
    	       {
    	            res = a - b;
    	            System.out.print("Result = " +res);
    	       }
    	       else if(ch == '*')
    	       {
    	            res = a * b;
    	            System.out.print("Result = " +res);
    	       }
    	       else if(ch == '/')
    	       {
    	            res = a / b;
    	            System.out.print("Result = " +res);
    	       }
    	       else
    	       {
    	            System.out.print("Wrong Operator !!!");
    	       }
    	            
    	    }
    	
    }


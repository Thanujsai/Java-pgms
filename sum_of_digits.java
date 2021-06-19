/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class sum_of_digits
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n;
		int y;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of test cases:");
		n=sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.print("Enter the number");
			int x=sc.nextInt();
		    int sum=0;
		    while(x>0){
		        y=x%10;
		        x=x/10;
		        sum=sum+y;
		    }
		    System.out.println(sum);
		}
	}
}

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.lang.Math;
public class reverse_the_number
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of test cases:");
	    int n=sc.nextInt();
	    int[] a=new int[n];
	    for(int i=0;i<n;i++){
			System.out.print("Enter the number:");
	        int x=sc.nextInt();
	        int m=0;
	        double k=0;
	        int r=x;
	        while(r>0){
	            m++;
	            r=r/10;
	        }
	        while(x>0){
	            int y=x%10;
	            k=k+y*(Math.pow(10,m-1));
	            m--;
	            x=x/10;
	       }
	       System.out.println((int)k);
	    }
	}
}

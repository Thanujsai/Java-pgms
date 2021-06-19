import java.util.*;
class addtwonumbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of test cases:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a,b;
            System.out.print("Enter the first number:");
            a=sc.nextInt();
            System.out.print("Enter the second number:");
            b=sc.nextInt();
            System.out.println(a+b);
        }
    }
}
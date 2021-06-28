import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            Scanner sc=new Scanner(System.in);
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            int c=a/b;
            System.out.println(c);
        }
        /*catch(InputMismatchException f){
            System.out.println(f.getMessage());
        }*/
        catch (InputMismatchException e){

    System.out.println("java.util.InputMismatchException");

}
        catch(Exception e){
            System.out.println(e);
        }
    }
}

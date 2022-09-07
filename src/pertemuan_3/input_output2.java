package pertemuan_3;
import java.io.*;
import java.util.*;

public class input_output2 {
	public static void main(String args[]) throws IOException{
		Scanner scan = new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
	    System.out.println("================================");
	     for(int i=0;i<3;i++)
	     {
	         String angka =sc.next();
	         int x=sc.nextInt();
	         System.out.printf("%-15s%03d%n",angka,x);
	     }
	     System.out.println("================================");
	}
	
}

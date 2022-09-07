package pertemuan_3;
import java.io.*;
import java.util.*;
import java.math.*;
import java.io.IOException;

public class big_number {
	public static void main(String args[]) throws IOException{
		String numberA, numberB;
		Scanner scan = new Scanner(System.in);
		numberA = scan.nextLine();
		numberB = scan.nextLine();
		scan.close();
		System.out.println(new BigInteger(numberA).add(new BigInteger(numberB)));
		System.out.println(new BigInteger(numberA).multiply(new BigInteger(numberB)));
	}
}

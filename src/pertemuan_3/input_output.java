package pertemuan_3;
import java.io.*;
import java.util.*;

public class input_output {
	public static void main(String args[]) throws IOException{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		s  = s.trim();
		if(s.length() == 0) {
			System.out.println(0);
		} else {
			String[] strings = s.split("['!?,._@ ]+");
			System.out.println(strings.length);
			for (String str: strings) {
				System.out.println(str);
			}
		}
	}
}

package maven.brokenlink;

import java.util.Scanner;

public class Reverse {
	
public static void main(String[] args) {
	Scanner scann = new Scanner(System.in);
	System.out.println("Enter the string : ");
	String a = scann.nextLine();
	 StringBuffer s=new StringBuffer();
	 s.append(a);
	 System.out.println(s.reverse());
		
	}
}

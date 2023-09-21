package maven.brokenlink;

import java.util.Scanner;

public class Palindrome1 {

	public static void main(String[] args) {
		Scanner scann=new Scanner(System.in);
		System.err.println("ENTER THE VALUE HERE : ");
		String str = scann.nextLine();
		String str2="";
		for (int i = str.length()-1; i >=0;i--) {
			str2 = str2 + str.charAt(i);
		}
		System.out.println(str2);
		
        if (str.equals(str)) {
			System.out.println("Is a palindrome");
		} else {
            System.out.println("is not a  palindrome");
		}
	}
      
	
}

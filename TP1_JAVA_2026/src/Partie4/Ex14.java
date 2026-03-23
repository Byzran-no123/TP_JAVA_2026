package Partie4;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("entrer votre chaine de caractere :");
		String chaine=s.nextLine();
		String inverse =new String();
		for(int i=chaine.length()-1;i>=0;i--) {
			char c=chaine.charAt(i);
			inverse+=c;
		}
		if(inverse.equalsIgnoreCase(chaine)) {
			System.out.println("cette chaine :"+chaine+" est palindrome");
		}
		else {
			System.out.println("cette chaine :"+chaine+" n'est pas palindrome");

		}

	}

}

package Partie4;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("entrer votre chaine de caractere :");
		String chaine=s.nextLine();
		String inverse =new String();
		for(int i=chaine.length()-1;i>=0;i--) {
			char c=chaine.charAt(i);
			inverse+=c;
		}
		System.out.println(inverse);
	}

}

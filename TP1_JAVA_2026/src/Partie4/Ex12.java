package Partie4;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("entrer votre chaine de caractere :");
		String chaine=s.nextLine();
		int compt=0;
		for(int i=0;i<chaine.length();i++) {
			char c=chaine.charAt(i);
			if(c=='a'|| c=='e' || c=='u'|| c=='i'|| c=='o' || c=='y') {
				compt+=1;
			}
		}
		System.out.println("le nombre de voyelles dans votre chaine de caractere est:"+compt);
			
		

	}

}

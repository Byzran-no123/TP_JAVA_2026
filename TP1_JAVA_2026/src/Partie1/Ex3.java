package Partie1;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("entrer votre nombre:");
		int n=s.nextInt();
		System.out.println("la table de multiplication de "+n+" est :");
		for( int i=0;i<=9;i++) {
			System.out.println((n*i));
		}
		

	}

}

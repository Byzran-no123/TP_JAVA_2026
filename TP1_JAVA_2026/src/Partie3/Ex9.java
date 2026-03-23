package Partie3;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int resultat=0;
		int n;
		int [][]tab=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("entrer votre elemnt:");
				n=s.nextInt();
				tab[i][j]=n;
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				resultat+=tab[i][j];
			}
		}
		System.out.println("la somme des elements de votre matrice est :"+resultat);
	}

}

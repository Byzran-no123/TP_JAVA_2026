package Partie2;
import  java.util.*;
public class Ex05 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("entrer la taille de votre tableau:");
		int taille=s.nextInt();
		int []tab=new int[taille];
		for (int i=0; i<taille;i++) {
			System.out.println("entrer votre element:");
			int n=s.nextInt();
			tab[i]=n;
		}
		for(int j=0;j<taille;j++)
			System.out.print(tab[j]);

	}

}

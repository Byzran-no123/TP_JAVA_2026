package Partie3;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("entrer le nombre de ligne de votre matrice:");
		int l=s.nextInt();
		System.out.println("entrer le nombre de coulonne de votre matrice:");
		int c=s.nextInt();
		
		int [][]tab=new int[3][3];
		for(int i=0;i<l;i++) {
			for(int j=0;j<c;j++) {
				System.out.println("entrer votre elemnt:");
				n=s.nextInt();
				tab[i][j]=n;
			}
		}
		for(int i=0;i<l;i++) {
			System.out.print("[");
			for(int j=0;j<c;j++) {
				System.out.print(tab[i][j]);
				System.out.print(" ");
				
			
			}
			System.out.print("]");
			System.out.print("\n");
			
		}
	
		System.out.println(" transposée");
		for(int i=0;i<c;i++) {
			System.out.print("[");
			for(int j=0;j<l;j++) {
				System.out.print(tab[j][i]);
				System.out.print(" ");
				
			
			}
			System.out.print("]");
			System.out.print("\n");
			
		}
	
	
	
		
	}

}

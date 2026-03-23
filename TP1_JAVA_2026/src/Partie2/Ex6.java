package Partie2;

import java.util.*;

public class Ex6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		// si vous voulez remplir le tableau automatiquement vous pouvez utiliser random
		int[] tab= {1,2,3,4,5,6,7,8,9,10};
		System.out.print("entrer le nombre que vous voulez savoir sa position");
		int nb=s.nextInt();
		for(int i=0;i<tab.length;i++) {
			if (tab[i] == nb) {
				System.out.println("la position de votre nombre est "+i);
			}
		}
		
		
	}

}

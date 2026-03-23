package Partie3;
import java.util.*;
public class Ex8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
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
			System.out.print("[");
			for(int j=0;j<3;j++) {
				System.out.print(tab[i][j]);
				System.out.print(" ");
				
			
			}
			System.out.print("]");
			System.out.print("\n");
			
		}
	
		

	}

}

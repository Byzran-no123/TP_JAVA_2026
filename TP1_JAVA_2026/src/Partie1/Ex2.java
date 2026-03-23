package Partie1;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("entrer le nombre N°1");
		int n1=s.nextInt();
		System.out.println("entrer le nombre N°2");
		int n2=s.nextInt();
		System.out.println("entrer le nombre N°3");
		int n3=s.nextInt();
		if (n1 >n2 && n2>n3 || n1> n3 && n3>n2 ) {
			System.out.println("le max est votre premier nombre");
		}
		else if(n2>n1 && n1>n3 || n2> n3 && n3>n1) {
			System.out.println("le max est votre deuxieme nombre");
		}
		else if(n3>n2 && n2>n1 || n3>n1 && n1>n2)
				 {
			System.out.println("le max est votre troisieme nombre");
		}
	}

}

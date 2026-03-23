package Partie1;
 import java.util.Scanner; 

public class Ex1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("entrer votre nombre");
		int n=s.nextInt();
		if ( n>0){
			System.out.println("votre nombre est positive");
		}
		else if(n<0){
			System.out.println("votre nombre est negative");
		
		}
		else if(n == 0) {
			System.out.println("votre nombre est null");
		}
		else  {
			System.out.println("erreur de saisir");
		}
			

	}

}

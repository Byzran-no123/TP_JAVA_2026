package Partie1;
import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("entrer le nombre des entiers");
		int n=s.nextInt();
		 int i=0;
		 int result=0;
		while(n>=i) {
			 result+=i;
			 i++;
		}
		System.out.println(result);
	}

}

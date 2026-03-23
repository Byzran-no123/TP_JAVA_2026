package Partie2;
import java.util.*;
public class Ex5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n;
		int i=0;
		 ArrayList<Integer> tab=new ArrayList<Integer>();
	
		System.out.println("si vous voulez terminer le programme  tapez #");
		while(true) {
			System.out.println("entrer votre element");
			n=s.nextLine();
			if(n.equals("#")) {
				break;
			}
			int nb=Integer.parseInt(n);
			tab.add(nb);
			i++;
		}
		
			System.out.println("votre tableau est "+tab);
			System.out.print("la taille du  tableau est "+i);

			


	}

}

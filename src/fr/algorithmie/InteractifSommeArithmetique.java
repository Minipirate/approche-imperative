/**
 * 
 */
package fr.algorithmie;

import java.util.Scanner;

/**
 * @author Ness'ti
 *
 */
public class InteractifSommeArithmetique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("------------- Programme qui demande à l'utilisateur un nombre puis calcule la somme de tous les entiers entre 1 et ce nombre ------------- ");
		System.out.println(" ");
		
		int number;
		int somme = 0;
		
		System.out.println("Veuillez saisir un nombre svp !");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		
		System.out.println("La somme des entiers compris entre 1 et " + number + " est : ");
		
		
		for (int i = 1; i <= number; i++) {
			somme = somme + i;
		}
		System.out.println(somme);
	}
}

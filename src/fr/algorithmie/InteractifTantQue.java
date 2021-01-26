/**
 * 
 */
package fr.algorithmie;

import java.util.Scanner;

/**
 * @author Ness'ti
 *
 */
public class InteractifTantQue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("------------- Programme qui demande à l'utilisateur un nombre compris entre 1 et 10 ------------- ");
		System.out.println(" ");
		
		int number;
		
		do { 
			System.out.println("Veuillez saisir un nombre compris entre 1 et 10 svp !");
			Scanner scan = new Scanner(System.in);
			number = scan.nextInt();
			System.out.println(number);
			
			if (number < 1 || number > 10) {
				System.out.println(number + " n'est pas un nombre compris entre 1 et 10 !");
			}
		}
		while (number < 1 || number > 10);
	}
}
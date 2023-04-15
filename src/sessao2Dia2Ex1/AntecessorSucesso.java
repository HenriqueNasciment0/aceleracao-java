package sessao2Dia2Ex1;

import java.util.Scanner;

//Ao digitar um número, recebe um texto com o número antecessor e sucessor.
 
public class AntecessorSucesso {

	public static void main(String[] args) {	
		try(Scanner scan = new Scanner(System.in)){

		System.out.println("Digite um número:");
		int numero = scan.nextInt();
		
		int antecessor = numero - 1;
		int sucessor = numero + 1;
	
		System.out.println("O número " + numero + " tem "+ antecessor + " como seu antecessor e " + sucessor + " como seu sucessor.");
		}
	}

}

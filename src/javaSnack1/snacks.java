package javaSnack1;

import java.util.Scanner;

public class snacks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci numero: ");
		int pairNumber = sc.nextInt();
		int oddNumber = pairNumber + 1;
		
		if(pairNumber%2 == 0) {
			System.out.println("Dato che è pari stampiamo il numero inserito dall'utente: " + pairNumber);
		} else {
			System.out.println("Dato che il numero è dispari stampiamo il successivo: " + oddNumber);
		}
	}
}

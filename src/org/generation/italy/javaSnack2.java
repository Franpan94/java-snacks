package org.generation.italy;

import java.util.Random;

public class javaSnack2 {
	public static void main(String[] args) {
		Random rnd = new Random();
		String [] names = {"Giuseppe", "Vito", "Franco", "Piero"};
		String [] surnames = { " Rossi", " Fantozzi", " Pelè", " Baresi"};
		System.out.println("Questa è la lista degli invitati:" );
		for(int i=0; i<names.length; i++) {
			    String name = names[i];
			    int surnameIndex = rnd.nextInt(surnames.length);
			    String surname = surnames[surnameIndex];
			    System.out.println(name + " " + surname);
			}
		}
		
	}	


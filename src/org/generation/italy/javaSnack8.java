package org.generation.italy;

import java.util.Random;

public class javaSnack8 {
	public static void main(String[] args) {
		Random rnd = new Random(128);
		int [] numbers = new int[10];
		int max = 0;
		int min = numbers.length;
		int sum = 0;
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = rnd.nextInt(100)-50;
			int number = numbers[i];
			System.out.println(number);
			min = Math.min(min, Math.abs(number));
			max = Math.max(max, Math.abs(number));
			
			if(number % 5 == 0) {
				sum += number;
			}
		}
		
		
		System.out.println("Valore assoluto più grande = " + max);
		System.out.println("Valore assoluto più piccolo = " + min);
		System.out.println("La sommatoria dei valori multipli di 5 è = " + sum);
		
	}
}

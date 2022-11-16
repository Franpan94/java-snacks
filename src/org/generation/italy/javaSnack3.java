package org.generation.italy;

public class javaSnack3 {
	public static void main(String[] args) {
		int [] numbers = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		for(int i=1; i<numbers.length; i=i+2) {
			int number = numbers[i];
			System.out.println(number);
			sum += number;
		}
		System.out.println("La somma è pari a: " + sum);
	}
}

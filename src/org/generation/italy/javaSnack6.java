package org.generation.italy;

public class javaSnack6 {
	public static void main(String[] args) {
		int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };
		int[] arr3 = new int[arr1.length];
		int min1 = arr1.length;
		int min2 = arr2.length;
		int max1 = 0;
		int max2 = 0;
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		float avg = 0;
		System.out.println("Sommatoria dei 2 array: ");
		for(int i=0; i<arr3.length; i++) {
			int number1 = arr1[i]; 
			int number2 = arr2[i]; 
			arr3[i] = number1 + number2;
			System.out.print(arr3[i] + " ");
			sum += arr3[i];
			avg = sum/(float)(arr1.length + arr2.length);
			sum1 += arr1[i];
			sum2 += arr2[i];
			if(number1 < min1) {
				min1 = number1;
			}
			if(number2 < min2) {
				min2 = number2;
			}
			if(number1 > max1) {
				max1 = number1;
			}
			if(number2 > max2) {
				max2 = number2;
			}
		}
		System.out.println("");
		System.out.println("La media di entrambi gli array assieme è: " + avg);
		System.out.println("Somma di tutti gli elementi del primo array: " + sum1);
		System.out.println("Somma di tutti gli elementi del secondo array: " + sum2);
		System.out.println("Valore minimo del primo array: " + min1);
		System.out.println("Valore minimo del secondo array: " + min2);
		System.out.println("Valore massimo del primo array: " + max1);
		System.out.println("Valore massimo del secondo array: " + max2);
	}
}

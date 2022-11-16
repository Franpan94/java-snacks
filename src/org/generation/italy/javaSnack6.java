package org.generation.italy;

public class javaSnack6 {
	public static void main(String[] args) {
		int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };
		int[] arr3 = new int[arr1.length];
		int min1 = arr1[0];
		int min2 = arr2[0];
		int max1 = arr1[0];
		int max2 = arr2[0];
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		double avg = 0;
		System.out.println("Sommatoria: ");
		for(int i=0; i<arr3.length; i++) {
			arr3[i] = arr1[i] + arr2[i];
			System.out.println(arr3[i]);
			sum += arr3[i];
			avg = sum/10d;
			sum1 += arr1[i];
			sum2 += arr2[i];
		}
		System.out.println("La media di entrambi gli array assieme è: " + avg);
		System.out.println("Somma di tutti gli elementi del primo array: " + sum1);
		System.out.println("Somma di tutti gli elementi del secondo array: " + sum2);
		
		for (int j : arr1) {
			if(j < min1)
			min1 = j;
		}
		System.out.println("Valore minimo del primo array: " + min1);
		
		for (int c : arr2) {
			if(c < min2)
			min2 = c;
		}
		System.out.println("Valore minimo del secondo array: " + min2);
		
		for (int x : arr1) {
			if(x > max1)
			max1 = x;
		}
		System.out.println("Valore massimo del primo array: " + max1);
		
		for (int y : arr2) {
			if(y > max2)
				max2 = y;
		}
		System.out.println("Valore massimo del secondo array: " + max2);
	}
}

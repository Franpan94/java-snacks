package org.generation.italy;

public class javaSnack5 {
	public static void main(String[] args) {
		int[] arr = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int maxNum = arr[0];
		int minNum = arr[0];
        int sum = 0;
        float avg = 0;
	    for (int j : arr) {
	            if (j > maxNum)
	                maxNum = j;
	            if(j < minNum) 
		        	minNum = j;
	    }
	    for(int i=0; i<arr.length; i++) {
	    	sum += arr[i];
	    	avg = sum / 10f;
	    }
     
	    System.out.println("Numero minimo = " + minNum);
	    System.out.println("Numero massimo = " + maxNum);
	    System.out.println("Sommatoria = " + sum);
	    System.out.println("Media = " + avg);
			
		}
		

	}


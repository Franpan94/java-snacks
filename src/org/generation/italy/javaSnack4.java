package org.generation.italy;

import java.util.Random;

public class javaSnack4 {
	public static void main(String[] args) {
		int [] bigArr = new int [9];
		int [] smallArr = new int [3];
		Random rnd = new Random();
		int [] arr = new int [bigArr.length - smallArr.length];
		for(int i=0; i<arr.length; i++) {
			int arrIndex = rnd.nextInt(arr.length);
			System.out.println(arrIndex);
		}
	}
}

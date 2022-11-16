package org.generation.italy;

public class javaSnack7 {
	public static void main(String[] args) {
		String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit" };
		int max = 0;
		String maxWord = "";
		int min = words.length;
		String minWord = "";
		
		for(int i=0; i<words.length; i++) {
			String word = words[i];
			System.out.print(word + " ");
			if(word.length() < min) {
				min = word.length();
				minWord = word;
			}
			if(word.length() > max) {
				max = word.length();
				maxWord = word;
			  }	
		}
		
		System.out.println("");
		for(int j=words.length-1; j>=0; j--) {
			String word2 = String.valueOf(words[j]);
			System.out.print(word2 + " ");
		}
		
		System.out.println("");
		System.out.println("La parola più lunga è: " + maxWord + " di lunghezza = " + max);
		System.out.println("La parola più corta è: " + minWord + " di lunghezza = " + min);
		
	}
}

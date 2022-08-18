package com.maratona_java.colecoes.equals;

public class EqualsTestPt1 {
	public static void main(String[] args) {
		String nome="Gabriel Melim";
		String nome2=new String("Gabriel MelIm");
		
		System.out.println(nome.equalsIgnoreCase(nome2));
	}
}

package com.maratona_java.colecoes.test.equals;

import com.maratona_java.colecoes.dominio.Smartphone;

public class EqualsTestPt1 {
	public static void main(String[] args) {
		Smartphone s1=new Smartphone("1ABC1", "IPHONE");
		Smartphone s2=new Smartphone("1ABC1", "IPHONE");
		
		System.out.println(s1.getSerialNumber().equals(s2.getSerialNumber()));
	}
}
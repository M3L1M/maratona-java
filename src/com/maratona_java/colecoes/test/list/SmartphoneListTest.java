package com.maratona_java.colecoes.test.list;

import java.util.ArrayList;
import java.util.List;

import com.maratona_java.colecoes.dominio.Smartphone;

public class SmartphoneListTest {
	public static void main(String[] args) {
		Smartphone s1=new Smartphone("1111", "iPhone");
		Smartphone s2=new Smartphone("2222", "Samsung");
		Smartphone s3=new Smartphone("3333", "Motorola");
		Smartphone s4=new Smartphone("4444", "Sony");
	
		List<Smartphone> sp=new ArrayList<Smartphone>();
		sp.add(s1);
		sp.add(s2);
		sp.add(s3);
		//sp.add(s4);
		for(Smartphone smt:sp) {
			System.out.println(smt);
		}
		System.out.println("---");
		sp.remove(0);
		sp.add(0,s4);
		for(Smartphone smt:sp) {
			System.out.println(smt);
		}
		
		System.out.println();
		
	}
}

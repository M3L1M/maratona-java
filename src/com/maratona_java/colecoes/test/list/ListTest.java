package com.maratona_java.colecoes.test.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<String> nomes=new ArrayList<>();
		List<String> nomes2=new ArrayList<>();
		nomes.add("Gabriel");
		nomes.add("Zé");
		nomes.add("Pauta");
		
		for(String nome:nomes) {
			System.out.println(nome);
		}
		
		
		nomes2.add("Play");
		nomes2.add("Pause");
		nomes2.add("ArrayList");
		
		nomes.addAll(nomes2);
		
		System.out.println("----");
		int nome=nomes.size();
		for(int i=0;i<nome;i++) {
			System.out.println(nomes.get(i));
		}
		
		System.out.println(nomes);
	}
}

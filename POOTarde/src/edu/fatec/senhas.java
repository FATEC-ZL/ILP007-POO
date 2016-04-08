package edu.fatec;

import java.util.*;

public class senhas {

	public static void main(String[] args){
		
		Map<String, String> senhas = new HashMap<String, String>(); //TreeMap
		
		senhas.put("FACEBOOK", "123456");
		senhas.put("GMAIL", "654321");
		senhas.put("ACADEMIASOFT", "66666");
		senhas.put("FACEBOOK", "55555");
		
		System.out.println(senhas.get("ACADEMIASOFT"));
		
		Set<String> keys = senhas.keySet();
		//Collection<String> val = senhas.values();
		for(String k : keys){
			System.out.println("Chave : " + k + " Valor : " + senhas.get(k));
		}
	}
}

package edu.fatec;

import java.util.*;

public class testeSet {
	public static void main(String [] args){
		Aluno maria = new Aluno();
		Aluno jose = new Aluno();
		//Aluno pedro = new Aluno();

		/*Set<Aluno> alunos = new HashSet<Aluno>();
		System.out.println("Adicionado Maria :" + alunos.add(maria));
		System.out.println("Adicionado José :" + alunos.add(jose));
		System.out.println("Adicionado Pedro :" + alunos.add(pedro));
		System.out.println("Adicionado Null :" + alunos.add(null));

		System.out.println("Adicionado Pedro :" + alunos.add(pedro));

		Iterator<Aluno> it = alunos.iterator();
		while (it.hasNext()){
			Aluno aluno = (Aluno) it.next();

			System.out.println("Aluno :" + aluno);*/

		Aluno pedro = new Aluno();
		pedro.setNome("Pedro Taques");
		
		List<Aluno> alunos = new ArrayList<Aluno>(); //LinkedList, VectorList
		System.out.println("Adicionado Maria :" + alunos.add(maria));
		System.out.println("Adicionado José :" + alunos.add(jose));
		System.out.println("Adicionado Pedro :" + alunos.add(pedro));
		System.out.println("Adicionado Null :" + alunos.add(null));
		System.out.println("Adicionado Pedro :" + alunos.add(pedro));

		System.out.println("Adicionado Pedro :" + alunos.add(pedro));

		pedro.setNome("Pedro Rogério");

		Iterator<Aluno> it = alunos.iterator();
		while (it.hasNext()){
			Aluno aluno = (Aluno) it.next();
			if(aluno != null){
				System.out.println("Aluno : " + aluno.getNome());
			}

			System.out.println("Aluno :" + alunos.contains(jose));
		}
		System.out.println("Contem José : " + alunos.get(2).getNome());
		System.out.println(alunos.get(2).getNome());
	}
}

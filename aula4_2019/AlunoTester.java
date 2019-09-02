package aula4_2019;

import java.util.Scanner;

public class AlunoTester {

	public static void main(String[] args) {
		
		Aluno a = new Aluno();
		String mat, nome, curso;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite a matrícula: ");
		mat = leitura.next();
		
		System.out.println("Digite o nome: ");
		nome = leitura.next();
		
		System.out.println("Digite o curso: ");
		curso = leitura.next();
		
		a.setMat(mat);
		a.setNome(nome);
		a.setCurso(curso);
		
		a.listar();

	}

}

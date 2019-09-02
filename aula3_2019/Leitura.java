package aula3_2019;

import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) {
		String nome;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o seu nome?");
		nome = entrada.next();
		System.out.println("Olá, "+nome+"! Seja bem vindo(a)!");

	}

}

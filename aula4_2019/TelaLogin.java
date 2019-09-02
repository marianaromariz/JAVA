package aula4_2019;

import java.util.Scanner;

public class TelaLogin {

	public static void main(String[] args) {
		String login, senha, libera;
		libera = "Semana2";
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("LOGIN:");
		login = entrada.next();
		System.out.println("SENHA:");
		senha = entrada.next();
		
		if (senha.equals(libera)) {
			System.out.println("ACESSO LIBERADO!");
		}
		else {
			System.out.println("ACESSO NEGADO!");
		}

	}

}

package aula3_2019;

import java.util.Scanner;

public class Soma {
	public static void main(String[] args) {
		int n1, n2, soma;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Entre com o valor de n1:");
		n1 = entrada.nextInt();
		System.out.println("Entre com o valor de n2:");
		n2 = entrada.nextInt();
		soma = n1+n2;
		System.out.println("Total = "+soma);
		
	}

}

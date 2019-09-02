package aula3_2019;

import java.util.Scanner;

public class LerVetor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] num = new int [5];
		int i;
		
		for (i=0;i<5;i++) {
			System.out.println("Entre com o número da posição "+(i+1));
			num[i] = input.nextInt();
		}
		
		int maior = 0;
		
		for(i=0;i<5;i++) {
			if(num[i] > maior) {
				maior = num[i];
			}
		}
		
		System.out.println("O maior valor é = "+maior);
	}

}

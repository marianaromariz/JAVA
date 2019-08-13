package aula2_2019;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampado;
	
	void rabiscar()
	{
		if (tampado)
		{
			System.out.println("\nErro! Caneta tampada.");
		}
		else
		{
			System.out.println("\nRabiscando...");
		}
	}
	void tampar()
	{
		tampado = true;
	}
	void destampar()
	{
		tampado = false;
	}
	
	void status ()
	{
		System.out.println("\n-----------------------");
		System.out.println("\nEu sou uma caneta!");
		System.out.println("\nModelo: " + modelo);
		System.out.println("Cor: " + cor);
		System.out.println("Ponta: " + ponta);
		System.out.println("Carga: " + carga);
		System.out.println("Tampado: " + tampado);
	}
}

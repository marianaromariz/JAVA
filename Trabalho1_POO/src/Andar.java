
public class Andar {
	
	String pessoa;
	String sexo;
	int idade;
	boolean calcado;
	
	void anda(){
		if(calcado)
		{
			System.out.println("Andando!");
		}
		else
		{
			System.out.println("Voc� est� descal�o! Calce os sapatos!");
		}
	}
	
	void calcar()
	{
		calcado = true;
	}
	
	void descalcar()
	{
		calcado = false;
	}
	
	void status()
	{
			System.out.println("\n-----------------------");
			System.out.println("\nPessoa: " + pessoa);
			System.out.println("Sexo: " + sexo);
			System.out.println("Idade: " + idade);
			System.out.println("Cal�ado: " + calcado);
	}

}

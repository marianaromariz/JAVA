package aula2_2019;

public class CanetaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testar caneta
				Caneta c1;
				c1 = new Caneta();
				c1.modelo = "Bic";
				c1.cor = "Roxo";
				c1.carga = 100;
				c1.ponta = 0.5f;
				c1.tampado = true;
				
				c1.status();
				
				c1.destampar();
				c1.rabiscar();
				
				c1.tampar();
				c1.rabiscar();
				
				c1.destampar();
				c1.rabiscar();
				
				Caneta c2 = new Caneta();
				
				c1.modelo = "Compactor";
				c1.cor = "Azul";
				c1.carga = 50;
				c1.ponta = 0.7f;
				c1.tampado = false;
				
				c1.status();
				
				c1.rabiscar();
				c1.tampar();
				c1.rabiscar();
				
				c1.destampar();
				c1.rabiscar();

	}

}
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
				
				c2.modelo = "Compactor";
				c2.cor = "Azul";
				c2.carga = 50;
				c2.ponta = 0.7f;
				c2.tampado = false;
				
				c2.status();
				
				c2.rabiscar();
				c2.tampar();
				c2.rabiscar();
				
				c2.destampar();
				c2.rabiscar();

	}

}
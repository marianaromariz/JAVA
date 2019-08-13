
public class Caminhando {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Andar and = new Andar();
				
				and.pessoa = "Arlinda";
				and.sexo = "Mulher";
				and.idade = 36;
				and.calcado = false;
				
				and.status();
				
				and.anda();
				and.calcar();
				and.anda();
				
				and.anda();
				and.descalcar();
				
				and.anda();
				and.calcar();
				and.anda();
				
				Andar and1 = new Andar();
				and1.pessoa = "Astrogildo";
				and1.sexo = "Homem";
				and1.idade = 79;
				and1.calcado = true;
				
				and1.status();
				
				and1.anda();
				
				and1.descalcar();
				and1.anda();

				and1.calcar();
				and1.anda();
			
	}
	
}

import java.util.Scanner;

public class TestTweet{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		String u, s, libera;
		libera = "POO";
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Usuário: ");
		u = leitura.next();
		
		System.out.println("Senha: ");
		s = leitura.next();
		
		Usuario sessao = new Usuario(u, s);
		
		String continua = "s";
		
		if (s.equalsIgnoreCase(libera)){
			
			System.out.println("ACESSO LIBERADO!");
			while (continua.equals("s")) {
				System.out.println("Escreva o Tweet:");
				String tt = leitura.next();
				sessao.tweeta(tt);
				System.out.println("Digite 'S' para um novo tweet:");
				continua = leitura.next();
			}	
		}
		
		else{
				System.out.println("ACESSO NEGADO!");
				System.exit(0);
		}
		
		sessao.listatts();
		leitura.close();
		
	}
}

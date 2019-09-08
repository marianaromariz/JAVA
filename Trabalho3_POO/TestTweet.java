//Mariana Fernandes Campos Romariz
//0050008393

import java.util.Scanner;

//programa principal
public class TestTweet{

	public static void main(String[] args){
		//definição de variáveis para usuário e senha
		String u, s, libera;
		libera = "POO";
		//iniciando a inserção de dados
		Scanner leitura = new Scanner(System.in);
		//entrando com um valor para usuário
		System.out.println("Usuário: ");
		u = leitura.next();
		//entrando com um valor para senha
		System.out.println("Senha: ");
		s = leitura.next();
		//criando instancia da classe Usuario
		Usuario sessao = new Usuario(u, s);
		
		//criando variável para verificar continuação
		String continua = "s";
		//se a senha for igual ao conteúdo da variável "libera" o programa prossegue
		if (s.equalsIgnoreCase(libera)){
			
			System.out.println("ACESSO LIBERADO!");
			//repete trecho de código enquanto a variável "continua" for igual a "s"
			while (continua.equalsIgnoreCase("s")) {
				//entrando com o tweet
				System.out.println("Escreva o Tweet:");
				String tt = leitura.next();
				//utilizando o metodo tweeta
				sessao.tweeta(tt);
				System.out.println("Digite 'S' para um novo tweet:");
				//recebe novo valor para variavel "continua"
				continua = leitura.next();
			}	
		}
		//caso a senha seja diferente de "poo"
		else{
				System.out.println("ACESSO NEGADO!");
				System.exit(0);
		}
		//após verificações imprime o nome do usuário e seus tweets em ordem de inserção
		sessao.listatts();
		//finaliza a inserção de dados
		leitura.close();
		
	}
}

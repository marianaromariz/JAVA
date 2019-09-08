//Mariana Fernandes Campos Romariz
//0050008393

import java.util.ArrayList;

//classe Usuario
public class Usuario {
	//definição de variáveis do tipo string para armazenar usuário e senha
	private String u;
	private String s;
	
	//definição de vetor para armazenar os tweets utilizando a classe Tweet
	private ArrayList<Tweet> tts;
	//construtor da classe Usuario
	public Usuario(String u, String s){
		// instancia de vetor pra classe Tweet
		this.tts = new ArrayList<>();
		//armazenando usuário e senha
		this.setU(u);
		this.setS(s);
		//verificando valor da senha
		if (!s.equalsIgnoreCase("poo")) { 
			System.out.println("ACESSO NEGADO! SENHA INCORRETA!");
			System.exit(0);
		}
	}
	
	//criando método para acesso da variável u na classe Usuario
	public String getU() {
		return this.u;
	}
	
	//criando método para modificação da variável u na classe Usuario
	public void setU(String u) {
		this.u = u;
	}
	
	//criando método para acesso da variável s na classe Usuario
	public String getS() {
		return this.s;
	}
	
	//criando método para acesso da variável s na classe Usuario
	public void setS(String s) {
		this.s = s;
	}
	
	//metodo para criar tweets
	public void tweeta(String msg){
		//instancia da classe Tweet
		Tweet tt = new Tweet(msg);
		//criando tweet
		this.tts.add(tt);
	}
	
	//método para listar tweets
	public void listatts(){
		//imprime o usuário logado
		System.out.printf("\nUsuário: %s\n", this.getU());
		//enquanto houver tweets, imprime os tweets
		for (int i = 0; i < this.tts.size(); i++){
			Tweet tt = this.tts.get(i);
			System.out.printf("TT %s:" , i+1 );
			System.out.println(tt.getTweet());
		}
	}	
}

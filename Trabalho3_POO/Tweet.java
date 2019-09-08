//Mariana Fernandes Campos Romariz
//0050008393

//classe Tweet
public class Tweet{
	//define variável para armazenar o tweet
	private String desc;
	//verificando tamanho do tweet
	public Tweet(String msg){
		if (msg.length() >= 140){
			//se for maior que 140 caracteres, trunca o tweet em 140 caracteres e o armazena
			msg = msg.substring(0, 140);
		}
		else{
			//armazena o tweet na variável msg
			this.desc = msg;
		}
	}
	//criando método para acesso
	public String getTweet(){
		return this.desc;
	}
	//criando método para modificação
	public void setTweet(String msg){
		this.desc = msg;
	}
}

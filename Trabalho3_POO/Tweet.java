//Mariana Fernandes Campos Romariz
//0050008393

//classe Tweet
public class Tweet{
	private String desc;
	//verificando tamanho do tweet
	public Tweet(String msg){
		if (msg.length() >= 140){
			//truncando a mensagemem 140 caracteres
			msg = msg.substring(0, 140);
		}
		else{
			this.desc = msg;
		}
	}

	public String getTweet(){
		return this.desc;
	}
	public void setTweet(String msg){
		this.desc = msg;
	}
}

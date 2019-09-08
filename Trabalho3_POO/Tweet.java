
public class Tweet{
	private String desc;
	
	public Tweet(String msg){
		if (msg.length() >= 140){
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

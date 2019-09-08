import java.util.ArrayList;

public class Usuario {

	private String u;
	private String s;
	
	private ArrayList<Tweet> tts;
	
	public Usuario(String u, String s){
		// TODO Auto-generated constructor stub
		this.tts = new ArrayList<>();
		
		this.setU(u);
		this.setS(s);
		
		if (!s.equalsIgnoreCase("poo")) { 
			System.out.println("Senha incorreta");
			System.exit(0);
		}
	}

	public String getU() {
		return this.u;
	}

	public void setU(String u) {
		this.u = u;
	}

	public String getS() {
		return this.s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
	public void tweeta(String msg){
		Tweet tt = new Tweet(msg);
		this.tts.add(tt);
	}

	public void listatts(){
		System.out.printf("\nUsuário: %s\n", this.getU());

		for (int i = 0; i < this.tts.size(); i++){
			Tweet tt = this.tts.get(i);
			System.out.printf("TT %s:" , i+1 );
			System.out.println(tt.getTweet());
		}
	}	
}

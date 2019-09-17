import java.util.Scanner;

public class PartidaTester {

	public static void main(String[] args) 
	{
		Partida p1 = new Partida();
     
		Time l = new Time();      
		Time v = new Time();
		
      	Scanner leitura = new Scanner(System.in);
		
		System.out.println("Time Local: ");
		String t1 = leitura.next();
		l.setNome(t1);
		
		System.out.println("\nTime Visitante: ");
		String t2 = leitura.next();
		v.setNome(t2);
            
		p1.iniciarPartida(l, v);
		p1.mostraResultado();
		p1.finalizarPartida();
      
		v.listar();
		l.listar(); 
		
	}

}

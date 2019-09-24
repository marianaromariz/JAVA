//Nomes dos integrantes: Daniel Guimarães Faria, Jonatan Pereira da Silva e Mariana Fernandes Campos Romariz
//link do video: https://youtu.be/aVBkG1Fs_xM

import java.util.Date;
import java.util.Random;


public class Partida implements IPartida
{
   private int scoreVisitante;
   private int scoreLocal;
   private Date dataPartida;
   private Time visitante;
   private Time local;
 
   
  @Override

	public void iniciarPartida(Time timeLocal, Time timeVisitante) 
	{
		Random r = new Random();
                
		this.scoreVisitante = r.nextInt(10);
		this.scoreLocal = r.nextInt(10);
		this.local = timeLocal;
		this.visitante = timeVisitante;
                
	}



	@Override
	public void mostraResultado() 
	{
	System.out.println(this.visitante.getNome() + " "+ this.scoreVisitante + "x" +  this.scoreLocal +" " +  this.local.getNome());
	}

	@Override
	public void finalizarPartida() 
	{
            
		int vit = 0, der = 0 ,emp = 0, pts = 0;
		if (scoreVisitante > scoreLocal)
		{
			vit ++;
			visitante.setQtdVitorias(vit);
			pts = 3;
			visitante.setQtdPontos(pts);
			der ++;
			local.setQtdDerrotas(der);
		}
		else if (scoreVisitante < scoreLocal)
		{
			vit ++;
			local.setQtdVitorias(vit);
			pts = 3;
			local.setQtdPontos(pts);
			der ++;
			visitante.setQtdDerrotas(der);
		}
		else
		{
			emp ++;
			visitante.setQtdEmpates(emp);
			local.setQtdEmpates(emp);
			pts ++;
			visitante.setQtdPontos(pts);
			local.setQtdPontos(pts);
		}
                        

	}
    


}

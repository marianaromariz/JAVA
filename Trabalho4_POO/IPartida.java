//Nomes dos integrantes: Daniel Guimarães Faria, Jonatan Pereira da Silva e Mariana Fernandes Campos Romariz
//link do video: https://youtu.be/aVBkG1Fs_xM

public interface IPartida 
{
  public abstract void iniciarPartida(Time timeLocal, Time timeVisitante);
  public abstract void mostraResultado();
  public abstract void finalizarPartida();
}

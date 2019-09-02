package aula4_2019;

public class Aluno {
	
	private String mat;
	private String nome;
	private String curso;
	private String faculdade = "UNILASALLE-RJ";
	
	
	public String getMat() {
		return mat;
	}
	public void setMat(String mat) {
		this.mat = mat;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		if (curso.equalsIgnoreCase("SI")) {
			this.curso = "Sistemas de Informação";
		}
		else {
			this.curso = curso;
		}
	}
	
	public void listar() {
		System.out.println("Matrícula = "+this.mat);
		System.out.println("Nome = "+this.nome);
		System.out.println("Curso = "+this.curso);
		System.out.println("Faculdade = "+this.faculdade);
		
	}

}

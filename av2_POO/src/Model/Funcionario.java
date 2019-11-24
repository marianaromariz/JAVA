package Model;

public class Funcionario {
	private String cpf;
	private String nome;
	private Produto produto;
	private String email;
	
	
	public Funcionario(String cpf, String nome, Produto produto, String email) {
		
		this.cpf = cpf;
		this.nome = nome;
		this.produto = produto;
		this.email = email;
		
	}


	public String getCpf() {
		return cpf;
	}


	public String getNome() {
		return nome;
	}


	public Produto getProduto() {
		return produto;
	}


	public String getEmail() {
		return email;
	}
	
	public String toString() {
    return this.nome;
	}
	
}

package Controller;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.Produto;
import Banco.Conexao;

public class ProdutoController {
	public void create(Produto produto)
	{
		try {
			Conexao con = new Conexao();
			String query = "INSERT INTO produto(nome) VALUES ('" + produto.getNome()+"')";
			Statement st = con.conexao.createStatement();
			st.executeUpdate(query);
			con.conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		
		}
		

	}
	public void remover(Produto produto)
	{
		
		
		try {
			Conexao con = new Conexao();
			Statement st = con.conexao.createStatement();
			String query = "DELETE FROM produto where id=" + produto.getId()+"";
			st = con.conexao.createStatement();
			st.executeUpdate(query);
			con.conexao.close();
		} catch (SQLException e) {
			System.out.println("DR");
			e.printStackTrace();
		} finally {
		
		}
		

	}
	public void editar(Produto produto)
	{
		
		
		try {
			Conexao con = new Conexao();
			Statement st = con.conexao.createStatement();
			String query = "UPDATE produto SET nome='"+produto.getNome()+"' WHERE id=" + produto.getId()+"";
			st = con.conexao.createStatement();
			st.executeUpdate(query);
			con.conexao.close();
		} catch (SQLException e) {
			System.out.println("DE");
			e.printStackTrace();
		} finally {
		
		}
		

	}
	
	public List<Produto> listar() {
		
		List<Produto> l= new ArrayList<Produto>();
		try {
			Conexao con = new Conexao();
			String query = "SELECT * FROM produto";
			Statement st = con.conexao.createStatement();
			ResultSet r = st.executeQuery(query);
		    while (r.next())
		      {
		    	Produto produto = new Produto(r.getString("nome"));
		    	produto.setId(r.getInt("id"));
		        l.add(produto);
		      }	
			con.conexao.close();

		} catch (SQLException e) {
			System.out.println("DL");
			e.printStackTrace();
		} finally {
		
		}
		return l;
	}
	
}



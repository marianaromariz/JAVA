package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Banco.Conexao;
import Model.Produto;
import Model.Cliente;

public class ClienteController {
	public void create(Cliente cliente)
	{
		if(canCreate(cliente)) {
			int id = cliente.getProduto().getId();
			try {
				Conexao con = new Conexao();
				Statement st = con.conexao.createStatement();
				String query = "INSERT INTO cliente VALUES('"+cliente.getCpf()+"', "
						+ "'"+cliente.getNome()+"', '"+cliente.getEmail()+"', "+id+" )";
				st = con.conexao.createStatement();
				st.execute(query);
				ResultSet r = st.getResultSet();
				con.conexao.close();
				
			} catch (SQLException e) {
				System.out.println("PC");
				e.printStackTrace();
			} finally {
			
			}	
			
			
			
		}
		

	}
	public void remover(Cliente cliente)
	{
		
		try {
			Conexao con = new Conexao();
			Statement st = con.conexao.createStatement();
			String query = "DELETE FROM cliente WHERE cpf = '"+cliente.getCpf()+"';";
			st = con.conexao.createStatement();
			st.execute(query);
			ResultSet r = st.getResultSet();
			con.conexao.close();
		} catch (SQLException e) {
			System.out.println("PR");
			e.printStackTrace();
		} finally {
		
		}	
	
		

	}
	public void editar(Cliente cliente)
	{
		
		
		try {
			Conexao con = new Conexao();
			Statement st = con.conexao.createStatement();
			int id = cliente.getProduto().getId();
			String query = "UPDATE cliente SET nome='"+cliente.getNome()+"', email='"+cliente.getEmail()+"', produto='"+id+"' WHERE cpf="+cliente.getCpf();
			st = con.conexao.createStatement();
			st.execute(query);
			ResultSet r = st.getResultSet();
			con.conexao.close();
		} catch (SQLException e) {
			System.out.println("PE");
			e.printStackTrace();
		} finally {
		
		}	
		

	}
	
	
	public boolean canCreate(Cliente cliente) {
		
		try {
			Conexao con = new Conexao();
			Statement st = con.conexao.createStatement();
			String query = "SELECT * FROM cliente WHERE cpf='" +cliente.getCpf() +"'";
			st = con.conexao.createStatement();
			st.executeQuery(query);
			ResultSet r = st.getResultSet();

			if(!r.next()) {
				con.conexao.close();
				return true;
			} else {
				con.conexao.close();
				return false;
			}
			
		} catch (SQLException e) {
			System.out.println("ERRO");
			e.printStackTrace();
			
		} finally {
		
		}	
		return false;
	}
	
	public Produto getProduto(int id) {
		try {
			Conexao con = new Conexao();
			String query = "SELECT * FROM produto WHERE id="+id;
			Statement st = con.conexao.createStatement();
			ResultSet r = st.executeQuery(query);
			r.next();
			Produto produto = new Produto(r.getString("nome"));
			
			produto.setId(r.getInt("id"));
			con.conexao.close();
			return produto;


		} catch (SQLException e) {
			
			System.out.println("GetProduto");
			e.printStackTrace();
		} finally {
		
		}
		return null;
	}

	public List<Cliente> listar() {
		
		
		List<Cliente> l= new ArrayList<Cliente>();
		try {
			Conexao con = new Conexao();
			String query = "SELECT * FROM cliente";
			Statement st = con.conexao.createStatement();
			ResultSet r = st.executeQuery(query);
		    while (r.next())
		      {
		    	Cliente cliente = new Cliente(r.getString("cpf"), r.getString("nome"), getProduto(r.getInt("produto")), r.getString("email"));
		        l.add(cliente);
		      }	
			con.conexao.close();

		} catch (SQLException e) {
			System.out.println("PL");
			e.printStackTrace();
		} finally {
		
		}
		return l;
	}
	
	
	}


package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Banco.Conexao;
import Model.Produto;
import Model.Funcionario;

public class FuncionarioController {
	public void create(Funcionario funcionario)
	{
		if(canCreate(funcionario)) {
			int id = funcionario.getProduto().getId();
			try {
				Conexao con = new Conexao();
				Statement st = con.conexao.createStatement();
				String query = "INSERT INTO funcionario VALUES('"+funcionario.getCpf()+"', "
						+ "'"+funcionario.getNome()+"', '"+funcionario.getEmail()+"', "+id+" )";
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
	public void remover(Funcionario funcionario)
	{
		
		try {
			Conexao con = new Conexao();
			Statement st = con.conexao.createStatement();
			String query = "DELETE FROM funcionario WHERE cpf = '"+funcionario.getCpf()+"';";
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
	public void editar(Funcionario funcionario)
	{
		
		
		try {
			Conexao con = new Conexao();
			Statement st = con.conexao.createStatement();
			int id = funcionario.getProduto().getId();
			String query = "UPDATE funcionario SET nome='"+funcionario.getNome()+"', email='"+funcionario.getEmail()+"', produto='"+id+"' WHERE cpf="+funcionario.getCpf();
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
	
	
	public boolean canCreate(Funcionario funcionario) {
		
		try {
			Conexao con = new Conexao();
			Statement st = con.conexao.createStatement();
			String query = "SELECT * FROM funcionario WHERE cpf='" +funcionario.getCpf() +"'";
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

	public List<Funcionario> listar() {
		
		
		List<Funcionario> l= new ArrayList<Funcionario>();
		try {
			Conexao con = new Conexao();
			String query = "SELECT * FROM funcionario";
			Statement st = con.conexao.createStatement();
			ResultSet r = st.executeQuery(query);
		    while (r.next())
		      {
		    	Funcionario funcionario = new Funcionario(r.getString("cpf"), r.getString("nome"), getProduto(r.getInt("produto")), r.getString("email"));
		        l.add(funcionario);
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


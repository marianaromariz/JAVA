package Banco;

import java.sql.Connection;

public class TesteBD 
{
	public static void main(String[] args) 
	{
		Connection con = Conexao.getConnection();
		System.out.println("Conexão OK!");

	}

}
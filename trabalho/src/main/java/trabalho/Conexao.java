package trabalho;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	Connection connection;

	public Conexao() throws SQLException {
		abrirConexao();
		inserir();
		alterar();
		deletar();
		pesquisar();
		fecharConexao();

	}

	private void fecharConexao() throws SQLException {
		connection.close();
	}

	private void pesquisar() {
		// TODO Auto-generated method stub

	}

	private void deletar() {
		// TODO Auto-generated method stub

	}

	private void alterar() {
		// TODO Auto-generated method stub

	}

	private void inserir() {
		// TODO Auto-generated method stub

	}
	//Abrir Conexão ao banco de dados
	private void abrirConexao() {
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://hostname:5432/PokemonCompany", "postgres", "univel");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Conectado com sucessoo!!!");
	}
}

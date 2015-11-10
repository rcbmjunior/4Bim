package trabalho;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	Connection connection;


	public void fecharConexao() throws SQLException {
		connection.close();
	}
	//Abrir Conexão ao banco de dados
	public void abrirConexao() {
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PokemonCompany", "postgres", "univel");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Conectado com sucessoo!!!");
	}
}

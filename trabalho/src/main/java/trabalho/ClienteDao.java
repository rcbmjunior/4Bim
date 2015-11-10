package trabalho;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import trabalho.Conexao;

public class ClienteDao {
	PreparedStatement ps;
	Conexao con = new Conexao();

	public void inserir(Cliente cliente) {
		try {
			con.abrirConexao();
			ps = con.connection.prepareStatement(
					"INSERT INTO cliente(idCliente, nome, telefone, cidade,estado, email, genero) VALUES(?,?,?,?,?,?,?)");

			ps.setInt(1, cliente.getId());
			ps.setString(2, cliente.getNome());
			ps.setString(3, cliente.getTelefone());
			ps.setString(4, cliente.getCidade());
			ps.setString(5, cliente.getEstado().toString());
			ps.setString(6, cliente.getEmail());
			ps.setString(7, cliente.getGenero().toString());

			// execute insert SQL stetement
			ps.executeUpdate();

			System.out.println("Gravado com Sucesso");

			con.fecharConexao();
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
	}

	public void deletar(Cliente cliente) throws SQLException {

		ps = con.connection.prepareStatement(
				"DELETE INTO cliente(idCliente, nome, telefone, cidade,estado, email, genero) VALUES(?,?,?,?,?,?,?)");

		try {
			ps.setInt(1, cliente.getId());
			ps.setString(2, cliente.getNome());
			ps.setString(3, cliente.getTelefone());
			ps.setString(4, cliente.getCidade());
			ps.setString(5, cliente.getEstado().toString());
			ps.setString(6, cliente.getEmail());
			ps.setString(7, cliente.getGenero().toString());

			// execute delete SQL stetement
			ps.executeUpdate();

			System.out.println("Record is deleted!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (ps != null) {
				ps.close();
			}

			if (con != null) {
				con.fecharConexao();
			}

		}

	}

	public void altera(Cliente cliente) throws SQLException {
		ps = con.connection.prepareStatement("update cliente set idCliente=?, nome=?, telefone=?, cidade=?,email=?, genero=? where id=?");
		try {
			ps.setInt(1, cliente.getId());
			ps.setString(2, cliente.getNome());
			ps.setString(3, cliente.getTelefone());
			ps.setString(4, cliente.getCidade());
			ps.setString(5, cliente.getEstado().toString());
			ps.setString(6, cliente.getEmail());
			ps.setString(7, cliente.getGenero().toString());

			ps.execute();
			ps.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}

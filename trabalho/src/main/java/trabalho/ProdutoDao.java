package trabalho;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDao {
//	Conexao con = new Conexao();
//	List<Cliente> clientes = new ArrayList<Cliente>();
//
//	public void inserir(Produto produto) {
//		try {
//			con.abrirConexao();
//			PreparedStatement ps;
//			ps = con.connection.prepareStatement("INSERT INTO cliente(idCliente, nome, telefone, cidade,estado, email, genero) VALUES(?,?,?,?,?,?,?)");
//
//			ps.setInt(1, produto.getId());
//			ps.setString(2, produto.getNome());
//			ps.setString(3, produto.getTelefone());
//			ps.setString(4, produto.getCidade());
//			ps.setString(5, produto.getEstado().toString());
//			ps.setString(6, produto.getEmail());
//			ps.setString(7, produto.getGenero().toString());
//
//			// execute insert SQL stetement
//			ps.executeUpdate();
//
//			System.out.println("Gravado com Sucesso");
//
//		} catch (SQLException e) {
//
//			System.out.println(e.getMessage());
//		}
//	}
//
//	public void deletar(Cliente produto) throws SQLException {
//		PreparedStatement ps;
//		ps = con.connection.prepareStatement("DELETE from cliente where idCliente = ?");
//
//		try {
//			ps.setInt(1, produto.getId());
//			ps.setString(2, produto.getNome());
//			ps.setString(3, produto.getTelefone());
//			ps.setString(4, produto.getCidade());
//			ps.setString(5, produto.getEstado().toString());
//			ps.setString(6, produto.getEmail());
//			ps.setString(7, produto.getGenero().toString());
//
//			// execute delete SQL stetement
//			ps.executeUpdate();
//
//			System.out.println("Record is deleted!");
//
//		} catch (SQLException e) {
//
//			System.out.println(e.getMessage());
//
//		} finally {
//
//			if (ps != null) {
//				ps.close();
//			}
//
//			if (con != null) {
//				con.fecharConexao();
//			}
//
//		}
//
//	}
//
//	public void altera(Cliente cliente) throws SQLException {
//
//		PreparedStatement ps;
//		ps = con.connection.prepareStatement(
//				"update cliente set idCliente=?, nome=?, telefone=?, cidade=?,email=?, genero=? where id=?");
//		try {
//			ps.setInt(1, cliente.getId());
//			ps.setString(2, cliente.getNome());
//			ps.setString(3, cliente.getTelefone());
//			ps.setString(4, cliente.getCidade());
//			ps.setString(5, cliente.getEstado().toString());
//			ps.setString(6, cliente.getEmail());
//			ps.setString(7, cliente.getGenero().toString());
//
//			ps.execute();
//			ps.close();
//
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		}
//	}
//
//	PreparedStatement ps;
//
//	public List<Cliente> preencher() {
//		try {
//
//			ps = con.connection.prepareStatement("SELECT idCliente, nome, telefone, cidade, estado, email, genero from cliente");
//			ResultSet rs = ps.executeQuery();
//			while (rs.next()) {
//				Cliente cliente = new Cliente();
//				cliente.setId(rs.getInt(1));
//				cliente.setNome(rs.getString(2));
//				cliente.setTelefone(rs.getString(3));
//				cliente.setCidade(rs.getString(4));
//				cliente.setEstado((Estado.valueOf(rs.getString(5))));
//				cliente.setEmail(rs.getString(6));
//				cliente.setGenero((Genero.valueOf(rs.getString(7))));
//				clientes.add(cliente);
//			}
//			ps.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return clientes;
//	}

}


package trabalho;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDao {
	List<Produto> produtos = new ArrayList<Produto>();
	Conexao con = new Conexao();
	PreparedStatement ps;

	

	public ProdutoDao() {
		// TODO Auto-generated constructor stub
	}

	public void inserir(Produto produto) {
		try {
			con.abrirConexao();
			ps = con.connection.prepareStatement("INSERT INTO produto(idproduto, codigobarra, categoria, quantidade, custo, margemlucro,descricao) VALUES (?, ?, ?, ?, ?, ?,?)");

			ps.setInt(1, produto.getId());
			ps.setInt(2, produto.getCodigodeBarra());
			ps.setString(3, produto.getCategoria());
			ps.setInt(4,produto.getQtd());
			ps.setDouble(5, produto.getCusto());
			ps.setBigDecimal(6, produto.getMargemLucro());
			ps.setString(7, produto.getDescricao());

			// execute insert SQL stetement
			ps.executeUpdate();

			System.out.println("Gravado com Sucesso");

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
	}

	public void deletar(Produto produto) throws SQLException {
		PreparedStatement ps;
		ps = con.connection.prepareStatement("DELETE from cliente where idproduto = ?");

		try {
			ps.setInt(1, produto.getId());
			ps.setInt(2, produto.getCodigodeBarra());
			ps.setString(3, produto.getCategoria());
			ps.setInt(4,produto.getQtd());
			ps.setDouble(5, produto.getCusto());
			ps.setBigDecimal(6, produto.getMargemLucro());
			ps.setString(7, produto.getDescricao());
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

	public void altera(Produto produto) throws SQLException {

		PreparedStatement ps;
		ps = con.connection.prepareStatement(
				"update cliente set idCliente=?, nome=?, telefone=?, cidade=?,email=?, genero=? where id=?");
		try {
			ps.setInt(1, produto.getId());
			ps.setInt(2, produto.getCodigodeBarra());
			ps.setString(3, produto.getCategoria());
			ps.setInt(4,produto.getQtd());
			ps.setDouble(5, produto.getCusto());
			ps.setBigDecimal(6, produto.getMargemLucro());
			ps.setString(7, produto.getDescricao());
			ps.execute();
			ps.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Produto> preencher(List<Produto> produtos2) {
		// TODO Auto-generated method stub
		return null;
	}

}


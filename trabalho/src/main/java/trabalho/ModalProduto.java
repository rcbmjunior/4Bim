package trabalho;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ModalProduto extends AbstractTableModel{
		List<Produto> produtos = new ArrayList<Produto>();
		Produto produto = new Produto();
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 7;
	}

	public int getRowCount() {
		// TODO Auto-generated method stub
		return produtos.size();
	}

	@Override
	public String getColumnName(int column) {
		switch (column) {
		case 1: produto.getId();
		break;
		case 2: produto.getCodigodeBarra();
		break;
		case 3: produto.getCategoria();
		break;
		case 4: produto.getQtd();
		break;
		case 5: produto.getCusto();
		break;
		case 6: produto.getMargemLucro();
		break;
		case 7: produto.getDescricao();
		break;

		default:
			break;
		}
		return "ooooh"; 
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
		case 1: produto.getId();
		break;
		case 2: produto.getCodigodeBarra();
		break;
		case 3: produto.getCategoria();
		break;
		case 4: produto.getQtd();
		break;
		case 5: produto.getCusto();
		break;
		case 6: produto.getMargemLucro();
		break;
		case 7: produto.getDescricao();
		break;

		default:
			break;
		}
		return "Nao gravado";
	}

}

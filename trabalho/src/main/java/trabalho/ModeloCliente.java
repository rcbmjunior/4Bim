package trabalho;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ModeloCliente extends AbstractTableModel {
	List<Cliente> clientes;

	public ModeloCliente(List<Cliente> clientes) {
		this.clientes = clientes;
		

	}

	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 7;
	}

	public int getRowCount() {
		// TODO Auto-generated method stub
		return clientes.size();
	}

	public Object getValueAt(int row, int col) {
		Cliente c = new Cliente();
		switch (row) {
		case 1:
			c.getId();
		case 2:
			c.getNome();
		case 3:
			c.getTelefone();
		case 4:
			c.getCidade();
		case 5:
			c.getEstado();
		case 6:
			c.getEmail();
		case 7:
			c.getGenero();
		default:
			return null;

		}
	
	}

}

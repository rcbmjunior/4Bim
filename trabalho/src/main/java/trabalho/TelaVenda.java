package trabalho;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaVenda extends JFrame {

	private JPanel contentPane;
	private JTextField txtValor;
	private JTextField txtTroco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVenda frame = new TelaVenda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaVenda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 396, 271);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblPokemonCompani = new JLabel("Pokemon Company");
		lblPokemonCompani.setFont(new Font("Calibri", Font.PLAIN, 27));
		GridBagConstraints gbc_lblPokemonCompani = new GridBagConstraints();
		gbc_lblPokemonCompani.insets = new Insets(0, 0, 5, 5);
		gbc_lblPokemonCompani.gridwidth = 6;
		gbc_lblPokemonCompani.gridx = 4;
		gbc_lblPokemonCompani.gridy = 0;
		contentPane.add(lblPokemonCompani, gbc_lblPokemonCompani);
		
		JLabel lblClientes = new JLabel("Clientes");
		lblClientes.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_lblClientes = new GridBagConstraints();
		gbc_lblClientes.insets = new Insets(0, 0, 5, 5);
		gbc_lblClientes.gridx = 0;
		gbc_lblClientes.gridy = 1;
		contentPane.add(lblClientes, gbc_lblClientes);
		
		JLabel lblNome = new JLabel("Nome");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.fill = GridBagConstraints.BOTH;
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 2;
		contentPane.add(lblNome, gbc_lblNome);
		
		JComboBox cbxCliente = new JComboBox();
		GridBagConstraints gbc_cbxCliente = new GridBagConstraints();
		gbc_cbxCliente.gridwidth = 7;
		gbc_cbxCliente.insets = new Insets(0, 0, 5, 5);
		gbc_cbxCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbxCliente.gridx = 1;
		gbc_cbxCliente.gridy = 2;
		contentPane.add(cbxCliente, gbc_cbxCliente);
		
		JButton btnSalvar = new JButton("Salvar");
		GridBagConstraints gbc_btnSalvar = new GridBagConstraints();
		gbc_btnSalvar.insets = new Insets(0, 0, 5, 5);
		gbc_btnSalvar.gridx = 9;
		gbc_btnSalvar.gridy = 2;
		contentPane.add(btnSalvar, gbc_btnSalvar);
		
		JLabel lblProdutos = new JLabel("Produtos");
		lblProdutos.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_lblProdutos = new GridBagConstraints();
		gbc_lblProdutos.insets = new Insets(0, 0, 5, 5);
		gbc_lblProdutos.gridx = 0;
		gbc_lblProdutos.gridy = 3;
		contentPane.add(lblProdutos, gbc_lblProdutos);
		
		JButton btnBuscar = new JButton("Buscar");
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscar.gridx = 9;
		gbc_btnBuscar.gridy = 3;
		contentPane.add(btnBuscar, gbc_btnBuscar);
		
		JLabel lblNomeProduto = new JLabel("Nome Produto");
		GridBagConstraints gbc_lblNomeProduto = new GridBagConstraints();
		gbc_lblNomeProduto.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNomeProduto.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeProduto.gridx = 0;
		gbc_lblNomeProduto.gridy = 4;
		contentPane.add(lblNomeProduto, gbc_lblNomeProduto);
		
		JComboBox cbxProduto = new JComboBox();
		GridBagConstraints gbc_cbxProduto = new GridBagConstraints();
		gbc_cbxProduto.gridwidth = 7;
		gbc_cbxProduto.insets = new Insets(0, 0, 5, 5);
		gbc_cbxProduto.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbxProduto.gridx = 1;
		gbc_cbxProduto.gridy = 4;
		contentPane.add(cbxProduto, gbc_cbxProduto);
		
		JButton btnExcluir = new JButton("Excluir");
		GridBagConstraints gbc_btnExcluir = new GridBagConstraints();
		gbc_btnExcluir.insets = new Insets(0, 0, 5, 5);
		gbc_btnExcluir.gridx = 9;
		gbc_btnExcluir.gridy = 4;
		contentPane.add(btnExcluir, gbc_btnExcluir);
		
		JLabel lblMargemDeVenda = new JLabel("Margem de Venda");
		lblMargemDeVenda.setFont(new Font("Calibri", Font.PLAIN, 16));
		GridBagConstraints gbc_lblMargemDeVenda = new GridBagConstraints();
		gbc_lblMargemDeVenda.gridwidth = 9;
		gbc_lblMargemDeVenda.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblMargemDeVenda.insets = new Insets(0, 0, 5, 5);
		gbc_lblMargemDeVenda.gridx = 0;
		gbc_lblMargemDeVenda.gridy = 5;
		contentPane.add(lblMargemDeVenda, gbc_lblMargemDeVenda);
		
		JButton btnEditar = new JButton("Editar");
		GridBagConstraints gbc_btnEditar = new GridBagConstraints();
		gbc_btnEditar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditar.gridx = 9;
		gbc_btnEditar.gridy = 5;
		contentPane.add(btnEditar, gbc_btnEditar);
		
		JLabel lblValor = new JLabel("Valor");
		GridBagConstraints gbc_lblValor = new GridBagConstraints();
		gbc_lblValor.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblValor.insets = new Insets(0, 0, 5, 5);
		gbc_lblValor.gridx = 0;
		gbc_lblValor.gridy = 6;
		contentPane.add(lblValor, gbc_lblValor);
		
		txtValor = new JTextField();
		GridBagConstraints gbc_txtValor = new GridBagConstraints();
		gbc_txtValor.gridwidth = 6;
		gbc_txtValor.insets = new Insets(0, 0, 5, 5);
		gbc_txtValor.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtValor.gridx = 1;
		gbc_txtValor.gridy = 6;
		contentPane.add(txtValor, gbc_txtValor);
		txtValor.setColumns(10);
		
		JLabel lblTroco = new JLabel("Troco");
		GridBagConstraints gbc_lblTroco = new GridBagConstraints();
		gbc_lblTroco.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTroco.insets = new Insets(0, 0, 0, 5);
		gbc_lblTroco.gridx = 0;
		gbc_lblTroco.gridy = 7;
		contentPane.add(lblTroco, gbc_lblTroco);
		
		txtTroco = new JTextField();
		GridBagConstraints gbc_txtTroco = new GridBagConstraints();
		gbc_txtTroco.gridwidth = 6;
		gbc_txtTroco.insets = new Insets(0, 0, 0, 5);
		gbc_txtTroco.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTroco.gridx = 1;
		gbc_txtTroco.gridy = 7;
		contentPane.add(txtTroco, gbc_txtTroco);
		txtTroco.setColumns(10);
	}

}

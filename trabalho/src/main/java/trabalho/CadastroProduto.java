package trabalho;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;

public class CadastroProduto extends JFrame {

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtCodigoBarra;
	private JTextField txtUnidade;
	private JTextField txtCusto;
	private JTextField txtMargem;
	private JTextField textDesc;
	private JTable table;
	private JTextField txtCategoria;
	private Produto p;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroProduto frame = new CadastroProduto();
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
	public CadastroProduto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 407, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroProduto = new JLabel("Cadastro Produto");
		lblCadastroProduto.setFont(new Font("Calibri", Font.PLAIN, 27));
		lblCadastroProduto.setBounds(117, 11, 204, 24);
		contentPane.add(lblCadastroProduto);
		
		JLabel lblNewLabel = new JLabel("ID Produto");
		lblNewLabel.setBounds(0, 52, 72, 14);
		contentPane.add(lblNewLabel);
		
		txtID = new JTextField();
		txtID.setBounds(0, 67, 54, 20);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		JLabel lblCodigoDeBarra = new JLabel("Codigo de Barra");
		lblCodigoDeBarra.setBounds(88, 52, 89, 14);
		contentPane.add(lblCodigoDeBarra);
		
		txtCodigoBarra = new JTextField();
		txtCodigoBarra.setBounds(88, 67, 196, 20);
		contentPane.add(txtCodigoBarra);
		txtCodigoBarra.setColumns(10);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(296, 52, 72, 14);
		contentPane.add(lblCategoria);
		
		JLabel lblNewLabel_1 = new JLabel("Unidade");
		lblNewLabel_1.setBounds(0, 98, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtUnidade = new JTextField();
		txtUnidade.setBounds(0, 111, 64, 20);
		contentPane.add(txtUnidade);
		txtUnidade.setColumns(10);
		
		JLabel lblCusto = new JLabel("Custo");
		lblCusto.setBounds(88, 98, 46, 14);
		contentPane.add(lblCusto);
		
		txtCusto = new JTextField();
		txtCusto.setBounds(88, 111, 98, 20);
		contentPane.add(txtCusto);
		txtCusto.setColumns(10);
		
		JLabel lblMargemDeLucro = new JLabel("Margem de Lucro");
		lblMargemDeLucro.setBounds(209, 98, 89, 14);
		contentPane.add(lblMargemDeLucro);
		
		txtMargem = new JTextField();
		txtMargem.setBounds(209, 111, 112, 20);
		contentPane.add(txtMargem);
		txtMargem.setColumns(10);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setBounds(0, 142, 46, 14);
		contentPane.add(lblDescrio);
		
		textDesc = new JTextField();
		textDesc.setBounds(0, 157, 387, 20);
		contentPane.add(textDesc);
		textDesc.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				inserir();
			}
		});
		btnSalvar.setBounds(0, 184, 72, 23);
		contentPane.add(btnSalvar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEditar.setBounds(82, 184, 72, 22);
		contentPane.add(btnEditar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBuscar.setBounds(249, 184, 72, 23);
		contentPane.add(btnBuscar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(164, 184, 72, 23);
		contentPane.add(btnExcluir);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 211, 387, 156);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		txtCategoria = new JTextField();
		txtCategoria.setBounds(294, 67, 86, 20);
		contentPane.add(txtCategoria);
		txtCategoria.setColumns(10);
	}

	protected void inserir() {
			ProdutoDao pd = new ProdutoDao();
			p.setId(Integer.parseInt(txtID.getText()));
			p.setCodigodeBarra(Integer.parseInt(txtCodigoBarra.getText()));
			p.setCategoria(txtCategoria.getText());
			p.setQtd(Integer.parseInt(txtUnidade.getText()));
			p.setCusto(Double.parseDouble(txtCusto.getText()));
			//p.setMargemLucro(txtMargem.getText());
			p.setDescricao(textDesc.getText());
	//		new ModeloCliente(pd.preencher(p));
			//clientes = cd.preencher();
			//table.setModel(modeloCliente);
			//modeloCliente.fireTableDataChanged();
			
			
		
		
	}
}

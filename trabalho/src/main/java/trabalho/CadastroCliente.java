package trabalho;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class CadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCidade;
	private JTable table;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCliente frame = new CadastroCliente();
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
	public CadastroCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeClinete = new JLabel("Cadastro de  Cliente");
		lblCadastroDeClinete.setFont(new Font("Cambria", Font.PLAIN, 27));
		lblCadastroDeClinete.setBounds(116, 0, 228, 34);
		contentPane.add(lblCadastroDeClinete);
		
		JLabel lblIdCliente = new JLabel("ID Cliente");
		lblIdCliente.setBounds(0, 45, 53, 14);
		contentPane.add(lblIdCliente);
		
		JLabel lblNomeCliente = new JLabel("Nome Cliente");
		lblNomeCliente.setBounds(80, 45, 70, 14);
		contentPane.add(lblNomeCliente);
		
		JTextField txtId = new JTextField();
		txtId.setBounds(0, 60, 70, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(80, 60, 344, 20);
		contentPane.add(txtNome);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(0, 91, 70, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(147, 91, 44, 14);
		contentPane.add(lblCidade);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(321, 91, 53, 14);
		contentPane.add(lblEstado);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(0, 136, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(203, 133, 46, 20);
		contentPane.add(lblEndereo);
		
		JTextField txtTelefone = new JTextField();
		txtTelefone.setBounds(0, 105, 126, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(147, 102, 164, 20);
		contentPane.add(txtCidade);
		
		JComboBox cbxEstado = new JComboBox();
		cbxEstado.setBounds(321, 105, 82, 20);
		contentPane.add(cbxEstado);
		
		JTextField txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(0, 149, 186, 20);
		contentPane.add(txtEmail);
		
		JTextField txtEnd = new JTextField();
		txtEnd.setColumns(10);
		txtEnd.setBounds(203, 149, 221, 20);
		contentPane.add(txtEnd);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(7, 180, 63, 23);
		contentPane.add(btnSalvar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(80, 180, 63, 23);
		contentPane.add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(153, 180, 63, 23);
		contentPane.add(btnExcluir);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(221, 180, 70, 23);
		contentPane.add(btnBuscar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 214, 434, 154);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}

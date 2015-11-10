package trabalho;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.HTMLEditorKit.Parser;

import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class CadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCidade;
	private JTable table;
	private JScrollPane scrollPane;
	private JTextField txtId;
	private JTextField txtTelefone;
	private JTextField txtEmail;
	private JTextField txtEnd;
	private JComboBox cbxGenero;
	private JComboBox cbxEstado;

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
		setBounds(100, 100, 450, 473);
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
		
		txtId = new JTextField();
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
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(0, 105, 126, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(147, 102, 164, 20);
		contentPane.add(txtCidade);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(0, 149, 186, 20);
		contentPane.add(txtEmail);
		
		txtEnd = new JTextField();
		txtEnd.setColumns(10);
		txtEnd.setBounds(203, 149, 221, 20);
		contentPane.add(txtEnd);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 inserir();
				
			}
		});
		btnSalvar.setBounds(0, 220, 63, 23);
		contentPane.add(btnSalvar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(80, 220, 63, 23);
		contentPane.add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(147, 220, 63, 23);
		contentPane.add(btnExcluir);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(220, 220, 70, 23);
		contentPane.add(btnBuscar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 243, 434, 192);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(0, 170, 46, 14);
		contentPane.add(lblGenero);
		
		cbxGenero = new JComboBox(Genero.values());
		cbxGenero.setBounds(0, 189, 70, 20);
		contentPane.add(cbxGenero);
		
		cbxEstado = new JComboBox(Estado.values());
		cbxEstado.setBounds(331, 105, 70, 20);
		contentPane.add(cbxEstado);
	}

	protected void inserir() {
		Cliente c = new Cliente();
		ClienteDao cd = new ClienteDao();
		c.setId(Integer.parseInt(txtId.getText()));
		c.setNome(txtNome.getText());
		c.setTelefone(txtTelefone.getText());
		c.setCidade(txtCidade.getText());
		c.setEstado((Estado)cbxEstado.getSelectedItem());
		c.setEmail(txtEmail.getText());
		c.setGenero((Genero)cbxGenero.getSelectedItem());
		cd.inserir(c);
		
			 
		
	}
}

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
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;

public class CadastroProduto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

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
		
		textField = new JTextField();
		textField.setBounds(0, 67, 54, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCodigoDeBarra = new JLabel("Codigo de Barra");
		lblCodigoDeBarra.setBounds(88, 52, 89, 14);
		contentPane.add(lblCodigoDeBarra);
		
		textField_1 = new JTextField();
		textField_1.setBounds(88, 67, 196, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(296, 52, 72, 14);
		contentPane.add(lblCategoria);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(294, 67, 93, 20);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Unidade");
		lblNewLabel_1.setBounds(0, 98, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(0, 111, 64, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCusto = new JLabel("Custo");
		lblCusto.setBounds(88, 98, 46, 14);
		contentPane.add(lblCusto);
		
		textField_3 = new JTextField();
		textField_3.setBounds(88, 111, 98, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblMargemDeLucro = new JLabel("Margem de Lucro");
		lblMargemDeLucro.setBounds(209, 98, 89, 14);
		contentPane.add(lblMargemDeLucro);
		
		textField_4 = new JTextField();
		textField_4.setBounds(209, 111, 112, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setBounds(0, 142, 46, 14);
		contentPane.add(lblDescrio);
		
		textField_5 = new JTextField();
		textField_5.setBounds(0, 157, 387, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(0, 184, 72, 23);
		contentPane.add(btnSalvar);
		
		JButton btnEditar = new JButton("Editar");
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
	}
}

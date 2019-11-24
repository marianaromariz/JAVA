package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ProdutoController;
import Controller.ClienteController;
import Model.Produto;
import Model.Cliente;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class CriarClienteView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CriarClienteView frame = new CriarClienteView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void atualizar(JComboBox c) {
		ProdutoController controller = new ProdutoController();
		c.setModel(new JComboBox(controller.listar().toArray()).getModel());
	}
	
	
	/**
	 * Create the frame.
	 */
	public CriarClienteView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInserirCliente = new JLabel("Inserir Cliente");
		lblInserirCliente.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblInserirCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblInserirCliente.setBounds(57, 11, 291, 24);
		contentPane.add(lblInserirCliente);
		
		textField = new JTextField();
		textField.setBounds(148, 77, 143, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCpf.setBounds(97, 80, 50, 14);
		contentPane.add(lblCpf);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNome.setBounds(97, 111, 50, 14);
		contentPane.add(lblNome);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(148, 108, 143, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(148, 139, 143, 20);
		contentPane.add(textField_2);
		
		
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(97, 142, 50, 14);
		contentPane.add(lblEmail);
		
		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProduto.setBounds(97, 173, 63, 14);
		contentPane.add(lblProduto);
		
		JComboBox<Produto> comboBox = new JComboBox<Produto>();
		atualizar(comboBox);
		comboBox.setBounds(162, 170, 144, 20);
		contentPane.add(comboBox);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteController controller = new ClienteController();
				Cliente cliente = new Cliente(textField.getText(), textField_1.getText(), (Produto)comboBox.getSelectedItem(), textField_2.getText());
				controller.create(cliente);
				JOptionPane.showMessageDialog(null, "Cliente "+cliente.getNome()+" criado com sucesso");
			}
		});
		btnInserir.setBounds(162, 234, 89, 23);
		contentPane.add(btnInserir);
	}
}

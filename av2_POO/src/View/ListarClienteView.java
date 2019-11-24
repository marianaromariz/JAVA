package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ClienteController;
import Controller.ProdutoController;
import Model.Cliente;
import Model.Produto;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ListarClienteView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarClienteView frame = new ListarClienteView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void atualizar(JComboBox c) {
		ClienteController controller = new ClienteController();
		c.setModel(new JComboBox(controller.listar().toArray()).getModel());
	}

	/**
	 * Create the frame.
	 */
	public ListarClienteView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEditarCliente = new JLabel("Listar Cliente");
		lblEditarCliente.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblEditarCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditarCliente.setBounds(10, 26, 403, 20);
	
		JComboBox<Cliente> comboBox = new JComboBox<Cliente>();
		comboBox.setBounds(144, 124, 140, 20);
		
		contentPane.add(comboBox);
		ClienteController controller = new ClienteController();
		comboBox.setModel(new JComboBox(controller.listar().toArray()).getModel());
		
		JLabel lblListarClientes = new JLabel("Listar Clientes");
		lblListarClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblListarClientes.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblListarClientes.setBounds(37, 11, 345, 30);
		contentPane.add(lblListarClientes);
	}
}

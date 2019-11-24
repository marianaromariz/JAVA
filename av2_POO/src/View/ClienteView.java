package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ClienteView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteView frame = new ClienteView();
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
	public ClienteView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblCliente.setBounds(22, 11, 369, 30);
		contentPane.add(lblCliente);
		
		JButton btnNewButton = new JButton("Criar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CriarClienteView criar = new CriarClienteView();
				criar.setVisible(true);
			}
		});
		btnNewButton.setBounds(229, 73, 114, 36);
		contentPane.add(btnNewButton);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EditarClienteView editar = new EditarClienteView();
				editar.setVisible(true);
			}
		});
		btnEditar.setBounds(75, 141, 114, 36);
		contentPane.add(btnEditar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoverClienteView remover = new RemoverClienteView();
				remover.setVisible(true);
			}
		});
		btnRemover.setBounds(229, 141, 114, 36);
		contentPane.add(btnRemover);
		
		JButton button_1 = new JButton("Listar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarClienteView n = new ListarClienteView();
				n.setVisible(true);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_1.setBounds(75, 73, 115, 37);
		contentPane.add(button_1);
		
		JButton button = new JButton("<< voltar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inicio p = new Inicio();
				dispose();
				p.setVisible(true);
			}
		});
		button.setBounds(22, 228, 89, 23);
		contentPane.add(button);
	}
}

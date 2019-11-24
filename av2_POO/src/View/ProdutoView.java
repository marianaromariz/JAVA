package View;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ProdutoView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProdutoView frame = new ProdutoView();
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
	public ProdutoView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCriar = new JButton("Criar");
		btnCriar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CriarProdutoView criarproduto = new CriarProdutoView();
				criarproduto.setVisible(true);
			}
		});
		btnCriar.setBounds(235, 78, 115, 37);
		contentPane.add(btnCriar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditarProdutoView n = new EditarProdutoView();
				n.setVisible(true);
			}
		});
		btnEditar.setBounds(78, 142, 115, 37);
		contentPane.add(btnEditar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoverProdutoView n = new RemoverProdutoView();
				n.setVisible(true);
			}
		});
		btnRemover.setBounds(235, 142, 115, 37);
		contentPane.add(btnRemover);
		
		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblProduto.setHorizontalAlignment(SwingConstants.CENTER);
		lblProduto.setBounds(40, 11, 345, 30);
		contentPane.add(lblProduto);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarProdutoView n = new ListarProdutoView();
				n.setVisible(true);
			}
		});
		btnListar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnListar.setBounds(78, 78, 115, 37);
		contentPane.add(btnListar);
		
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

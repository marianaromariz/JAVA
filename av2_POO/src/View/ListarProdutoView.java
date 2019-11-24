package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ProdutoController;
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

public class ListarProdutoView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarProdutoView frame = new ListarProdutoView();
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
	public ListarProdutoView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEditarProduto = new JLabel("Listar Produtos");
		lblEditarProduto.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblEditarProduto.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditarProduto.setBounds(10, 11, 403, 35);
		contentPane.add(lblEditarProduto);
		
		JComboBox<Produto> comboBox = new JComboBox<Produto>();
		comboBox.setBounds(144, 124, 140, 20);
		
		contentPane.add(comboBox);
		ProdutoController controller = new ProdutoController();
		comboBox.setModel(new JComboBox(controller.listar().toArray()).getModel());
	}

}

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class RemoverProdutoView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoverProdutoView frame = new RemoverProdutoView();
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
	public RemoverProdutoView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRemoverProduto = new JLabel("Remover Produto");
		lblRemoverProduto.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblRemoverProduto.setHorizontalAlignment(SwingConstants.CENTER);
		lblRemoverProduto.setBounds(44, 11, 340, 32);
		contentPane.add(lblRemoverProduto);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(121, 82, 202, 20);
		ProdutoController controller = new ProdutoController();
		comboBox.setModel(new JComboBox(controller.listar().toArray()).getModel());
		
		contentPane.add(comboBox);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProdutoController controller = new ProdutoController();
				Produto produto = (Produto)comboBox.getSelectedItem();
				controller.remover(produto);				
				comboBox.setModel(new JComboBox(controller.listar().toArray()).getModel());
				JOptionPane.showMessageDialog(null, "Produto removido com sucesso");
			}
		});
		btnRemover.setBounds(176, 143, 89, 23);
		contentPane.add(btnRemover);
	}
}

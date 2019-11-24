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

public class EditarProdutoView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditarProdutoView frame = new EditarProdutoView();
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
	public EditarProdutoView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEditarProduto = new JLabel("Editar Produto");
		lblEditarProduto.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblEditarProduto.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditarProduto.setBounds(10, 11, 403, 14);
		contentPane.add(lblEditarProduto);
		
		JComboBox<Produto> comboBox = new JComboBox<Produto>();
		comboBox.setBounds(144, 63, 140, 20);
		comboBox.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		        textField.setText(comboBox.getSelectedItem().toString());
		    }
		});
		contentPane.add(comboBox);
		ProdutoController controller = new ProdutoController();
		comboBox.setModel(new JComboBox(controller.listar().toArray()).getModel());
		
		JButton btnNewButton = new JButton("Editar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = comboBox.getSelectedIndex();
				ProdutoController controller = new ProdutoController();
				Produto produto = new Produto(textField.getText());
				Produto tmp = (Produto)comboBox.getSelectedItem();
				produto.setId(tmp.getId());
				controller.editar(produto);
				atualizar(comboBox);
				comboBox.setSelectedIndex(index);
				JOptionPane.showMessageDialog(null, "Produto editado com sucesso");
			}
		});
		btnNewButton.setBounds(171, 174, 89, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(144, 117, 140, 20);
		textField.setText(comboBox.getSelectedItem().toString());
		contentPane.add(textField);
		textField.setColumns(10);
	}

}

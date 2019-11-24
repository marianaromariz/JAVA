package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ProdutoController;
import Controller.FuncionarioController;
import Model.Produto;
import Model.Funcionario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class EditarFuncionarioView extends JFrame {

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
					EditarFuncionarioView frame = new EditarFuncionarioView();
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
	public void atualizarProduto(JComboBox c) {
		ProdutoController controller = new ProdutoController();
		c.setModel(new JComboBox(controller.listar().toArray()).getModel());
		
		
	}
	public void atualizarFuncionario(JComboBox c) {
		FuncionarioController controller = new FuncionarioController();
		c.setModel(new JComboBox(controller.listar().toArray()).getModel());
	}
	public EditarFuncionarioView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEditarFuncionario = new JLabel("Editar Funcionário");
		lblEditarFuncionario.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblEditarFuncionario.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditarFuncionario.setBounds(30, 11, 345, 14);
		contentPane.add(lblEditarFuncionario);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(134, 54, 155, 20);
		contentPane.add(comboBox);
		atualizarFuncionario(comboBox);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setBounds(81, 100, 120, 20);
		Funcionario funcionario = (Funcionario)comboBox.getSelectedItem();
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setText(funcionario.getCpf());
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(127, 85, 46, 14);
		contentPane.add(lblCpf);
		
		textField_1 = new JTextField();
		textField_1.setBounds(211, 100, 164, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setText(funcionario.getNome());
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(211, 85, 46, 14);
		contentPane.add(lblNome);
		
		textField_2 = new JTextField();
		textField_2.setBounds(81, 145, 142, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setText(funcionario.getEmail());
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(127, 131, 46, 14);
		contentPane.add(lblEmail);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(233, 145, 142, 20);
		contentPane.add(comboBox_1);
		atualizarProduto(comboBox_1);
		comboBox_1.setSelectedItem(funcionario.getProduto());	
		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setBounds(233, 131, 114, 14);
		contentPane.add(lblProduto);
		funcionario = (Funcionario)comboBox.getSelectedItem();
		for (int i=0; i<comboBox_1.getModel().getSize(); i++)
		{
		    if (comboBox_1.getItemAt(i).toString().equals(funcionario.getProduto().getNome()))
		    {
		        comboBox_1.setSelectedIndex(i);
		        break;
		    }
		}	
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Funcionario funcionario = (Funcionario)comboBox.getSelectedItem();
				atualizarProduto(comboBox_1);
				textField.setText(funcionario.getCpf());
				textField_1.setText(funcionario.getNome());
				textField_2.setText(funcionario.getEmail());
				for (int i=0; i<comboBox_1.getModel().getSize(); i++)
				{
				    if (comboBox_1.getItemAt(i).toString().equals(funcionario.getProduto().getNome()))
				    {
				        comboBox_1.setSelectedIndex(i);
				        break;
				    }
				}
			}
		});
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto produto = (Produto)comboBox_1.getSelectedItem();
				Funcionario funcionario = new Funcionario(textField.getText(), textField_1.getText(), produto ,textField_2.getText());
				FuncionarioController controller = new FuncionarioController();
				
				controller.editar(funcionario);
				JOptionPane.showMessageDialog(null, "Funcionário editado com sucesso");
			}
		});
		btnEditar.setBounds(168, 192, 89, 23);
		contentPane.add(btnEditar);
	}

}
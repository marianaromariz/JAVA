package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.FuncionarioController;
import Controller.ProdutoController;
import Model.Funcionario;
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

public class ListarFuncionarioView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarFuncionarioView frame = new ListarFuncionarioView();
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
	public ListarFuncionarioView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEditarFuncionario = new JLabel("Listar Funcionário");
		lblEditarFuncionario.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblEditarFuncionario.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditarFuncionario.setBounds(10, 26, 403, 20);
		
		JComboBox<Funcionario> comboBox = new JComboBox<Funcionario>();
		comboBox.setBounds(144, 124, 140, 20);
		
		contentPane.add(comboBox);
		FuncionarioController controller = new FuncionarioController();
		comboBox.setModel(new JComboBox(controller.listar().toArray()).getModel());
		
		JLabel lblListarFuncionrios = new JLabel("Listar Funcion\u00E1rios");
		lblListarFuncionrios.setHorizontalAlignment(SwingConstants.CENTER);
		lblListarFuncionrios.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblListarFuncionrios.setBounds(21, 11, 403, 35);
		contentPane.add(lblListarFuncionrios);
	}

}

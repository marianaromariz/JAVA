package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ProdutoController;
import Controller.FuncionarioController;
import Model.Funcionario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class RemoverFuncionarioView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoverFuncionarioView frame = new RemoverFuncionarioView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void atualizar(JComboBox c) {
		FuncionarioController controller = new FuncionarioController();
		c.setModel(new JComboBox(controller.listar().toArray()).getModel());
	}
	/**
	 * Create the frame.
	 */
	public RemoverFuncionarioView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRemoverFuncionario = new JLabel("Remover Funcionário");
		lblRemoverFuncionario.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblRemoverFuncionario.setHorizontalAlignment(SwingConstants.CENTER);
		lblRemoverFuncionario.setBounds(33, 11, 366, 31);
		contentPane.add(lblRemoverFuncionario);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(117, 86, 191, 20);
		contentPane.add(comboBox);
		atualizar(comboBox);
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FuncionarioController controller = new FuncionarioController();
				Funcionario funcionario = (Funcionario)comboBox.getSelectedItem();
				controller.remover(funcionario);
				atualizar(comboBox);
				comboBox.setModel(new JComboBox(controller.listar().toArray()).getModel());
				JOptionPane.showMessageDialog(null, "Funcionário removido com sucesso");
				
			}
		});
		btnRemover.setBounds(159, 151, 107, 23);
		contentPane.add(btnRemover);
	}

}

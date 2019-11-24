package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDe = new JLabel("Sistema da LaSalle Sports");
		lblCadastroDe.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblCadastroDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDe.setBounds(41, 11, 342, 24);
		contentPane.add(lblCadastroDe);
		JButton btnProdutos = new JButton("Produtos");
		btnProdutos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Inicio self = this;
		btnProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProdutoView produto = new ProdutoView();
				self.dispose();
				produto.setVisible(true);
			}
		});
		btnProdutos.setBounds(152, 69, 140, 40);
		contentPane.add(btnProdutos);
		
		JButton btnNewButton = new JButton("Clientes");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ClienteView p = new ClienteView();
				self.dispose();
				p.setVisible(true);
			}
		});
		btnNewButton.setBounds(152, 126, 140, 40);
		contentPane.add(btnNewButton);
		
		JButton btnFuncionarios = new JButton("Funcion\u00E1rios");
		btnFuncionarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				FuncionarioView p = new FuncionarioView();
				self.dispose();
				p.setVisible(true);
			}
		});
		btnFuncionarios.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnFuncionarios.setBounds(152, 184, 140, 40);
		contentPane.add(btnFuncionarios);
	}
}

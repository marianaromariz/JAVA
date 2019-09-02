import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin {

	private JFrame frame;
	private JTextField login;
	private JPasswordField senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLogin.setBounds(40, 55, 91, 17);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSenha.setBounds(40, 104, 79, 17);
		frame.getContentPane().add(lblSenha);
		
		login = new JTextField();
		login.setBounds(141, 55, 210, 20);
		frame.getContentPane().add(login);
		login.setColumns(10);
		
		senha = new JPasswordField();
		senha.setBounds(141, 104, 210, 20);
		frame.getContentPane().add(senha);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String l = login.getText();
				String s = senha.getText();
				
				if (s.equals("Semana2")) {
					JOptionPane.showMessageDialog(frame, l+", acesso liberado!");
				}
				else {
					JOptionPane.showMessageDialog(frame, l+", acesso negado!!");
				}
			}
		});
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEntrar.setBounds(141, 209, 89, 23);
		frame.getContentPane().add(btnEntrar);
	}
}

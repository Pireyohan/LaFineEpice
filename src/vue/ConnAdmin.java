package vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ConnAdmin {

	private JFrame frmAdmine;
	private JTextField mdp;
	private JTextField Iduser;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JLabel lblAccesAdmin;


	
	public ConnAdmin() {
		initialize();
	}

	private void initialize() {
		frmAdmine = new JFrame();
		frmAdmine.setTitle("ADMIN");
		frmAdmine.setIconImage(Toolkit.getDefaultToolkit().getImage(ConnAdmin.class.getResource("/ressource/logoetc/logo3.png")));
		frmAdmine.setBounds(100, 100, 450, 314);
		frmAdmine.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdmine.getContentPane().setLayout(null);
		
		btnNewButton = new JButton("Connexion");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(242, 225, 176, 39);
		frmAdmine.getContentPane().add(btnNewButton);
		
		mdp = new JTextField();
		mdp.setBounds(242, 172, 182, 29);
		frmAdmine.getContentPane().add(mdp);
		mdp.setColumns(10);
		
		Iduser = new JTextField();
		Iduser.setColumns(10);
		Iduser.setBounds(242, 107, 182, 29);
		frmAdmine.getContentPane().add(Iduser);
		
		JLabel lblNewLabel = new JLabel("Mot de passe");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(242, 147, 180, 14);
		frmAdmine.getContentPane().add(lblNewLabel);
		
		JLabel lblId = new JLabel("Identifiant");
		lblId.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblId.setVerticalAlignment(SwingConstants.TOP);
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBounds(244, 80, 180, 14);
		frmAdmine.getContentPane().add(lblId);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(ConnAdmin.class.getResource("/ressource/logoetc/logo3.png")));
		lblNewLabel_1.setBounds(10, 11, 222, 218);
		frmAdmine.getContentPane().add(lblNewLabel_1);
		
		lblAccesAdmin = new JLabel("Acces ADMIN");
		lblAccesAdmin.setForeground(new Color(0, 153, 204));
		lblAccesAdmin.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblAccesAdmin.setVerticalAlignment(SwingConstants.TOP);
		lblAccesAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccesAdmin.setBounds(236, 30, 182, 39);
		frmAdmine.getContentPane().add(lblAccesAdmin);
	}

	public JFrame getFrame() {
		return frmAdmine;
	}

	public void setFrame(JFrame frame) {
		this.frmAdmine = frame;
	}

	public JTextField getMdp() {
		return mdp;
	}

	public void setMdp(JTextField mdp) {
		this.mdp = mdp;
	}

	public JTextField getIduser() {
		return Iduser;
	}

	public void setIduser(JTextField iduser) {
		Iduser = iduser;
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	public void setBtnNewButton(JButton btnNewButton) {
		this.btnNewButton = btnNewButton;
	}

}

package vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class Connexion {

	private JFrame CoFrame;
	private JTextField textId;
	private JPasswordField  textMdp;
	private JPanel panAddCli;
	private JTextField textAddNom;
	private JTextField textaddPrenom;
	private JTextField textaddAdresse;
	private JTextField textAddCp;
	private JTextField textAddMail;
	private JTextField textAddTel;
	private JTextField textAddMdp;
	private JTextField textTextConMdp;
	private JButton btnBienvenuChezNous, btnConnexion, btnNewcli;
	private JPanel panel;
	private JLabel logo_1;
	private JButton Croix;
	private JButton Croix_1;
	private int mouseX, mouseY;
	private JTextField textVille;

	public Connexion() {
		initialize();
	}

	private void initialize() {
		CoFrame = new JFrame();
		CoFrame.getContentPane().setBackground(new Color(255, 255, 255));
		CoFrame.setUndecorated(true);
		CoFrame.setBounds(100, 100, 475, 567);
		CoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/**
		 * methode pour deplacé ma fentre "onclick" je n'ai pas reussi a transférée
		 * (pour le moment) ceci dans le controleur pour le moment elle va resté dans la
		 * vue
		 * 
		 */
		CoFrame.addMouseMotionListener(new MouseMotionAdapter() {

			public void mouseDragged(MouseEvent e) {
				CoFrame.setLocation(CoFrame.getX() + e.getX() - mouseX, CoFrame.getY() + e.getY() - mouseY);

			}
		});
		CoFrame.addMouseListener(new MouseAdapter() {

			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();

			}
		});

		CoFrame.getContentPane().setLayout(null);

		panAddCli = new JPanel();
		panAddCli.setBorder(null);
		panAddCli.setBackground(Color.WHITE);
		panAddCli.setBounds(0, 0, 475, 567);
		panAddCli.setVisible(false);
		CoFrame.getContentPane().add(panAddCli);
		panAddCli.setLayout(null);

		textAddNom = new JTextField();
		textAddNom.setForeground(new Color(102, 51, 51));
		textAddNom.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		textAddNom.setDisabledTextColor(Color.WHITE);
		textAddNom.setColumns(10);
		textAddNom.setBorder(new LineBorder(new Color(255, 160, 122)));
		textAddNom.setBounds(10, 49, 185, 32);
		panAddCli.add(textAddNom);

		textaddPrenom = new JTextField();
		textaddPrenom.setForeground(new Color(102, 51, 51));
		textaddPrenom.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		textaddPrenom.setDisabledTextColor(Color.WHITE);
		textaddPrenom.setColumns(10);
		textaddPrenom.setBorder(new LineBorder(new Color(255, 160, 122)));
		textaddPrenom.setBounds(10, 117, 185, 32);
		panAddCli.add(textaddPrenom);

		textaddAdresse = new JTextField();
		textaddAdresse.setForeground(new Color(102, 51, 51));
		textaddAdresse.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		textaddAdresse.setDisabledTextColor(Color.WHITE);
		textaddAdresse.setColumns(10);
		textaddAdresse.setBorder(new LineBorder(new Color(255, 160, 122)));
		textaddAdresse.setBounds(10, 194, 185, 32);
		panAddCli.add(textaddAdresse);

		textAddCp = new JTextField();
		textAddCp.setForeground(new Color(102, 51, 51));
		textAddCp.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		textAddCp.setDisabledTextColor(Color.WHITE);
		textAddCp.setColumns(10);
		textAddCp.setBorder(new LineBorder(new Color(255, 160, 122)));
		textAddCp.setBounds(10, 329, 185, 32);
		panAddCli.add(textAddCp);

		textAddMail = new JTextField();
		textAddMail.setForeground(new Color(102, 51, 51));
		textAddMail.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		textAddMail.setDisabledTextColor(Color.WHITE);
		textAddMail.setColumns(10);
		textAddMail.setBorder(new LineBorder(new Color(255, 160, 122)));
		textAddMail.setBounds(10, 417, 185, 32);
		panAddCli.add(textAddMail);

		textAddTel = new JTextField();
		textAddTel.setForeground(new Color(102, 51, 51));
		textAddTel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		textAddTel.setDisabledTextColor(Color.WHITE);
		textAddTel.setColumns(10);
		textAddTel.setBorder(new LineBorder(new Color(255, 160, 122)));
		textAddTel.setBounds(10, 497, 185, 32);
		panAddCli.add(textAddTel);

		textAddMdp = new JTextField();
		textAddMdp.setForeground(new Color(102, 51, 51));
		textAddMdp.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		textAddMdp.setDisabledTextColor(Color.WHITE);
		textAddMdp.setColumns(10);
		textAddMdp.setBorder(new LineBorder(new Color(255, 160, 122)));
		textAddMdp.setBounds(269, 329, 185, 32);
		panAddCli.add(textAddMdp);

		textTextConMdp = new JTextField();
		textTextConMdp.setForeground(new Color(102, 51, 51));
		textTextConMdp.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		textTextConMdp.setDisabledTextColor(Color.WHITE);
		textTextConMdp.setColumns(10);
		textTextConMdp.setBorder(new LineBorder(new Color(255, 160, 122)));
		textTextConMdp.setBounds(269, 417, 185, 32);
		panAddCli.add(textTextConMdp);
		
		textVille = new JTextField();
		textVille.setForeground(new Color(102, 51, 51));
		textVille.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		textVille.setDisabledTextColor(Color.WHITE);
		textVille.setColumns(10);
		textVille.setBorder(new LineBorder(new Color(255, 160, 122)));
		textVille.setBounds(10, 261, 185, 32);
		panAddCli.add(textVille);

		JLabel Nom = new JLabel("Nom");
		Nom.setForeground(new Color(255, 160, 122));
		Nom.setFont(new Font("Tahoma", Font.ITALIC, 15));
		Nom.setBounds(82, 24, 41, 14);
		panAddCli.add(Nom);

		JLabel lblPrnom = new JLabel("Pr\u00E9nom");
		lblPrnom.setForeground(new Color(255, 160, 122));
		lblPrnom.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblPrnom.setBounds(72, 92, 61, 14);
		panAddCli.add(lblPrnom);

		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setForeground(new Color(255, 160, 122));
		lblAdresse.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblAdresse.setBounds(72, 170, 61, 14);
		panAddCli.add(lblAdresse);

		JLabel lblCodePostal = new JLabel("Code Postal");
		lblCodePostal.setForeground(new Color(255, 160, 122));
		lblCodePostal.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblCodePostal.setBounds(57, 304, 90, 14);
		panAddCli.add(lblCodePostal);

		JLabel lblMail = new JLabel("Mail");
		lblMail.setForeground(new Color(255, 160, 122));
		lblMail.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblMail.setBounds(82, 392, 41, 14);
		panAddCli.add(lblMail);

		JLabel lblTlephone = new JLabel("T\u00E9l\u00E9phone");
		lblTlephone.setForeground(new Color(255, 160, 122));
		lblTlephone.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblTlephone.setBounds(62, 472, 81, 14);
		panAddCli.add(lblTlephone);

		JLabel lblMotDePasse = new JLabel("Mot de Passe");
		lblMotDePasse.setForeground(new Color(255, 160, 122));
		lblMotDePasse.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblMotDePasse.setBounds(316, 304, 90, 14);
		panAddCli.add(lblMotDePasse);

		JLabel lblConfirmationMdp = new JLabel("Confirmation Mdp");
		lblConfirmationMdp.setForeground(new Color(255, 160, 122));
		lblConfirmationMdp.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblConfirmationMdp.setBounds(301, 394, 120, 14);
		panAddCli.add(lblConfirmationMdp);

		btnBienvenuChezNous = new JButton("Bienvenue chez nous !");
		btnBienvenuChezNous.setForeground(new Color(255, 160, 122));
		btnBienvenuChezNous.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBienvenuChezNous.setFocusable(false);
		btnBienvenuChezNous.setFocusTraversalKeysEnabled(false);
		btnBienvenuChezNous.setFocusPainted(false);
		btnBienvenuChezNous.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(255, 160, 122)));
		btnBienvenuChezNous.setBackground(Color.WHITE);
		btnBienvenuChezNous.setActionCommand("");
		btnBienvenuChezNous.setBounds(269, 481, 185, 35);
		panAddCli.add(btnBienvenuChezNous);

		logo_1 = new JLabel("");
		logo_1.setIcon(new ImageIcon(Connexion.class.getResource("/ressource/logoetc/logo3.png")));
		logo_1.setBounds(237, 11, 228, 203);
		panAddCli.add(logo_1);

		Croix = new JButton("X");
		Croix.setFont(new Font("Tahoma", Font.BOLD, 10));
		Croix.setFocusTraversalKeysEnabled(false);
		Croix.setFocusPainted(false);
		Croix.setContentAreaFilled(false);
		Croix.setBorderPainted(false);
		Croix.setBounds(418, 11, 47, 38);
		panAddCli.add(Croix);
		
		
		
		JLabel lblVille = new JLabel("Ville");
		lblVille.setForeground(new Color(255, 160, 122));
		lblVille.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblVille.setBounds(88, 237, 29, 14);
		panAddCli.add(lblVille);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(
				new ImageIcon(Connexion.class.getResource("/ressource/logoetc/les-grands-bienfaits-the-vert4.jpg")));
		lblNewLabel.setBounds(0, 11, 236, 556);
		CoFrame.getContentPane().add(lblNewLabel);

		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(Connexion.class.getResource("/ressource/logoetc/logo3.png")));
		logo.setBounds(246, 11, 219, 203);
		CoFrame.getContentPane().add(logo);

		panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(262, 236, 203, 304);
		CoFrame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel texte1 = new JLabel("Identifiant");
		texte1.setForeground(new Color(255, 160, 122));
		texte1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		texte1.setBounds(65, 11, 74, 14);
		panel.add(texte1);

		textId = new JTextField();
		textId.setForeground(new Color(102, 51, 51));
		textId.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		textId.setDisabledTextColor(Color.WHITE);
		textId.setColumns(10);
		textId.setBorder(new LineBorder(new Color(255, 160, 122)));
		textId.setBounds(10, 36, 185, 32);
		panel.add(textId);

		JLabel lblNewLabel_1 = new JLabel("Mot de passe");
		lblNewLabel_1.setForeground(new Color(255, 160, 122));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_1.setBounds(53, 93, 99, 14);
		panel.add(lblNewLabel_1);

		textMdp = new JPasswordField();
		textMdp.setForeground(new Color(102, 51, 51));
		textMdp.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		textMdp.setDisabledTextColor(Color.WHITE);
		textMdp.setColumns(10);
		textMdp.setBorder(new LineBorder(new Color(255, 160, 122)));
		textMdp.setBounds(10, 118, 185, 32);
		panel.add(textMdp);

		btnConnexion = new JButton("Connexion");
		btnConnexion.setForeground(new Color(255, 160, 122));
		btnConnexion.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnConnexion.setFocusable(false);
		btnConnexion.setFocusTraversalKeysEnabled(false);
		btnConnexion.setFocusPainted(false);
		btnConnexion.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(255, 160, 122)));
		btnConnexion.setBackground(Color.WHITE);
		btnConnexion.setActionCommand("");
		btnConnexion.setBounds(10, 178, 185, 35);
		panel.add(btnConnexion);

		btnNewcli = new JButton("Pas encore client ?");
		btnNewcli.setForeground(new Color(255, 160, 122));
		btnNewcli.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewcli.setFocusable(false);
		btnNewcli.setFocusTraversalKeysEnabled(false);
		btnNewcli.setFocusPainted(false);
		btnNewcli.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(255, 160, 122)));
		btnNewcli.setBackground(Color.WHITE);
		btnNewcli.setActionCommand("");
		btnNewcli.setBounds(10, 228, 185, 35);
		panel.add(btnNewcli);

		Croix_1 = new JButton("X");
		Croix_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		Croix_1.setFocusTraversalKeysEnabled(false);
		Croix_1.setFocusPainted(false);
		Croix_1.setContentAreaFilled(false);
		Croix_1.setBorderPainted(false);
		Croix_1.setBounds(418, 11, 47, 38);
		CoFrame.getContentPane().add(Croix_1);

		// pics.setIcon(new ImageIcon("F:\\COUR\\fine
		// \u00E9pice\\epicePics\\caf\u00E9.jpg"));

	}

	public JFrame getCoFrame() {
		return CoFrame;
	}

	public void setCoFrame(JFrame coFrame) {
		CoFrame = coFrame;
	}

	public JTextField getTextId() {
		return textId;
	}

	public void setTextId(JTextField textId) {
		this.textId = textId;
	}

	public JPasswordField getTextMdp() {
		return textMdp;
	}

	public void setTextMdp(JPasswordField textMdp) {
		this.textMdp = textMdp;
	}

	public JPanel getPanAddCli() {
		return panAddCli;
	}

	public void setPanAddCli(JPanel panAddCli) {
		this.panAddCli = panAddCli;
	}

	public JTextField getTextAddNom() {
		return textAddNom;
	}

	public void setTextAddNom(JTextField textAddNom) {
		this.textAddNom = textAddNom;
	}

	public JTextField getTextaddPrenom() {
		return textaddPrenom;
	}

	public void setTextaddPrenom(JTextField textaddPrenom) {
		this.textaddPrenom = textaddPrenom;
	}

	public JTextField getTextaddAdresse() {
		return textaddAdresse;
	}

	public void setTextaddAdresse(JTextField textaddAdresse) {
		this.textaddAdresse = textaddAdresse;
	}

	public JTextField getTextAddCp() {
		return textAddCp;
	}

	public void setTextAddCp(JTextField textAddCp) {
		this.textAddCp = textAddCp;
	}

	public JTextField getTextAddMail() {
		return textAddMail;
	}

	public void setTextAddMail(JTextField textAddMail) {
		this.textAddMail = textAddMail;
	}

	public JTextField getTextAddTel() {
		return textAddTel;
	}

	public void setTextAddTel(JTextField textAddTel) {
		this.textAddTel = textAddTel;
	}

	public JTextField getTextAddMdp() {
		return textAddMdp;
	}

	public void setTextAddMdp(JTextField textAddMdp) {
		this.textAddMdp = textAddMdp;
	}

	public JTextField getTextTextConMdp() {
		return textTextConMdp;
	}

	public void setTextTextConMdp(JTextField textTextConMdp) {
		this.textTextConMdp = textTextConMdp;
	}

	public JButton getBtnBienvenuChezNous() {
		return btnBienvenuChezNous;
	}

	public void setBtnBienvenuChezNous(JButton btnBienvenuChezNous) {
		this.btnBienvenuChezNous = btnBienvenuChezNous;
	}

	public JButton getBtnConnexion() {
		return btnConnexion;
	}

	public void setBtnConnexion(JButton btnConnexion) {
		this.btnConnexion = btnConnexion;
	}

	public JButton getBtnNewcli() {
		return btnNewcli;
	}

	public void setBtnNewcli(JButton btnNewcli) {
		this.btnNewcli = btnNewcli;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JLabel getLogo_1() {
		return logo_1;
	}

	public void setLogo_1(JLabel logo_1) {
		this.logo_1 = logo_1;
	}

	public JButton getCroix() {
		return Croix;
	}

	public void setCroix(JButton croix) {
		Croix = croix;
	}

	public JButton getCroix_1() {
		return Croix_1;
	}

	public void setCroix_1(JButton croix_1) {
		Croix_1 = croix_1;
	}

	public int getMouseX() {
		return mouseX;
	}

	public void setMouseX(int mouseX) {
		this.mouseX = mouseX;
	}

	public int getMouseY() {
		return mouseY;
	}

	public void setMouseY(int mouseY) {
		this.mouseY = mouseY;
	}

	public JTextField getTextVille() {
		return textVille;
	}

	public void setTextVille(JTextField textVille) {
		this.textVille = textVille;
	}


}

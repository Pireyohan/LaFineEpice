package vue;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class AdminProduits_Clients {

	private JList list;
	private JFrame frame;
	private JTextField textPrix;
	private JTextField textID;
	private JTextField textLibel;
	private JLabel lblNewLabel;
	private JLabel lblPrenom;
	private JLabel lblEmail;
	private JLabel lblTlphone;
	private JTextField textQt;
	private JPanel panel_1;
	private JTextField textcate;
	private JButton btnAjouter;
	private JButton btnSupprimer;
	private JButton btnModifier;
	private JTextField textPrenom;
	private JTextField textnom;
	private JTextField textAdresse;
	private JTextField textCp;
	private JTextField textVille;
	private JTextField textMail;
	private JTextField textMdp;
	private JTextField textTel;
	private JList listclient;
	private JButton btnModifierCli;
	private JButton btnSupprimerCli;
	private JButton btnAjouterCli;
	
	
	/**
	 * Create the application.
	 */
	public AdminProduits_Clients() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 958, 644);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 147, 837, 447);
		frame.getContentPane().add(tabbedPane);

		panel_1 = new JPanel();
		tabbedPane.addTab("Produits", null, panel_1, null);
		panel_1.setLayout(null);

		textPrix = new JTextField();
		textPrix.setBounds(19, 250, 127, 25);
		panel_1.add(textPrix);
		textPrix.setColumns(10);

		textQt = new JTextField();
		textQt.setBounds(19, 319, 127, 25);
		panel_1.add(textQt);
		textQt.setColumns(10);

		lblTlphone = new JLabel("Prix");
		lblTlphone.setBounds(19, 199, 100, 40);
		panel_1.add(lblTlphone);
		lblTlphone.setFont(new Font("Tahoma", Font.PLAIN, 20));

		lblEmail = new JLabel("Quantit\u00E9");
		lblEmail.setBounds(19, 279, 100, 40);
		panel_1.add(lblEmail);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));

		textLibel = new JTextField();
		textLibel.setBounds(19, 163, 127, 25);
		panel_1.add(textLibel);
		textLibel.setColumns(10);

		btnAjouter = new JButton("AJOUTER");
		btnAjouter.setBounds(275, 155, 106, 35);
		panel_1.add(btnAjouter);
		btnAjouter.setFont(new Font("Tahoma", Font.PLAIN, 11));

		btnModifier = new JButton("MODIFIER");
		btnModifier.setBounds(275, 201, 105, 35);
		panel_1.add(btnModifier);

		btnSupprimer = new JButton("SUPPRIMER");
		btnSupprimer.setBounds(275, 247, 106, 36);
		panel_1.add(btnSupprimer);

		JLabel lblListProduits = new JLabel("List Produits");
		lblListProduits.setBounds(559, 110, 113, 34);
		panel_1.add(lblListProduits);
		lblListProduits.setFont(new Font("Tahoma", Font.PLAIN, 20));

		textID = new JTextField();
		textID.setBounds(19, 82, 127, 25);
		panel_1.add(textID);
		textID.setColumns(10);

		lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(19, 38, 91, 34);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(403, 155, 395, 241);
		panel_1.add(scrollPane);

		list = new JList();
		scrollPane.setViewportView(list);

		lblPrenom = new JLabel("Libell\u00E9");
		lblPrenom.setBounds(19, 124, 100, 40);
		panel_1.add(lblPrenom);
		lblPrenom.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel lblManageProducts = new JLabel("Manage Products");
		lblManageProducts.setBounds(481, 21, 159, 34);
		panel_1.add(lblManageProducts);
		lblManageProducts.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textcate = new JTextField();
		textcate.setColumns(10);
		textcate.setBounds(19, 379, 127, 25);
		panel_1.add(textcate);
		
		JLabel lblCategorie = new JLabel("Categorie");
		lblCategorie.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCategorie.setBounds(19, 340, 100, 40);
		panel_1.add(lblCategorie);
		
				JPanel panel = new JPanel();
				tabbedPane.addTab("Client", null, panel, null);
				panel.setLayout(null);
				
				JLabel lblNom = new JLabel("Nom");
				lblNom.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lblNom.setBounds(21, 42, 91, 34);
				panel.add(lblNom);
				
				JLabel lblManageClients = new JLabel("Manage clients");
				lblManageClients.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lblManageClients.setBounds(284, 11, 159, 34);
				panel.add(lblManageClients);
				
				JLabel lblListClients = new JLabel("List clients");
				lblListClients.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lblListClients.setBounds(268, 206, 100, 34);
				panel.add(lblListClients);
				
				btnAjouterCli = new JButton("AJOUTER");
				btnAjouterCli.setFont(new Font("Tahoma", Font.PLAIN, 11));
				btnAjouterCli.setBounds(716, 334, 106, 35);
				panel.add(btnAjouterCli);
				
				textPrenom = new JTextField();
				textPrenom.setColumns(10);
				textPrenom.setBounds(21, 169, 127, 25);
				panel.add(textPrenom);
				
				JLabel lblPrenon = new JLabel("Prenom");
				lblPrenon.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lblPrenon.setBounds(21, 128, 100, 40);
				panel.add(lblPrenon);
				
				textnom = new JTextField();
				textnom.setColumns(10);
				textnom.setBounds(21, 86, 127, 25);
				panel.add(textnom);
				
				JLabel lblAdresse = new JLabel("Adresse");
				lblAdresse.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lblAdresse.setBounds(401, 139, 100, 40);
				panel.add(lblAdresse);
				
				textAdresse = new JTextField();
				textAdresse.setColumns(10);
				textAdresse.setBounds(401, 190, 240, 25);
				panel.add(textAdresse);
				
				JLabel lblCp = new JLabel("CP");
				lblCp.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lblCp.setBounds(174, 128, 100, 40);
				panel.add(lblCp);
				
				textCp = new JTextField();
				textCp.setColumns(10);
				textCp.setBounds(174, 170, 127, 25);
				panel.add(textCp);
				
				JLabel lblVille = new JLabel("Ville");
				lblVille.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lblVille.setBounds(401, 42, 100, 40);
				panel.add(lblVille);
				
				textVille = new JTextField();
				textVille.setColumns(10);
				textVille.setBounds(401, 81, 127, 25);
				panel.add(textVille);
				
				 listclient = new JList();
				 listclient.setBounds(21, 241, 685, 158);
				 panel.add(listclient);
				 
				 btnModifierCli = new JButton("MODIFIER");
				 btnModifierCli.setBounds(717, 288, 105, 35);
				 panel.add(btnModifierCli);
				 
				 btnSupprimerCli = new JButton("SUPPRIMER");
				 btnSupprimerCli.setBounds(716, 241, 106, 36);
				 panel.add(btnSupprimerCli);
				 
				 textMail = new JTextField();
				 textMail.setColumns(10);
				 textMail.setBounds(598, 83, 159, 25);
				 panel.add(textMail);
				 
				 textMdp = new JTextField();
				 textMdp.setColumns(10);
				 textMdp.setBounds(663, 190, 159, 25);
				 panel.add(textMdp);
				 
				 textTel = new JTextField();
				 textTel.setColumns(10);
				 textTel.setBounds(174, 84, 127, 25);
				 panel.add(textTel);
				 
				 JLabel lblemail = new JLabel("Email");
				 lblemail.setFont(new Font("Tahoma", Font.PLAIN, 20));
				 lblemail.setBounds(598, 42, 100, 40);
				 panel.add(lblemail);
				 
				 JLabel lblmdp = new JLabel("Mdp");
				 lblmdp.setFont(new Font("Tahoma", Font.PLAIN, 20));
				 lblmdp.setBounds(663, 139, 100, 40);
				 panel.add(lblmdp);
				 
				 JLabel lbltelephone = new JLabel("telephone");
				 lbltelephone.setFont(new Font("Tahoma", Font.PLAIN, 20));
				 lbltelephone.setBounds(174, 42, 100, 40);
				 panel.add(lbltelephone);
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}


	public JButton getBtnAjouter() {
		return btnAjouter;
	}

	public void setBtnAjouter(JButton btnAjouter) {
		this.btnAjouter = btnAjouter;
	}

	public JPanel getPanel_1() {
		return panel_1;
	}

	public void setPanel_1(JPanel panel_1) {
		this.panel_1 = panel_1;
	}

	public JTextField getTextcate() {
		return textcate;
	}

	public void setTextcate(JTextField textcate) {
		this.textcate = textcate;
	}

	public JTextField getTextPrix() {
		return textPrix;
	}

	public void setTextPrix(JTextField textPrix) {
		this.textPrix = textPrix;
	}

	public JTextField getTextID() {
		return textID;
	}

	public void setTextID(JTextField textID) {
		this.textID = textID;
	}

	public JTextField getTextLibel() {
		return textLibel;
	}

	public void setTextLibel(JTextField textLibel) {
		this.textLibel = textLibel;
	}

	public JTextField getTextQt() {
		return textQt;
	}

	public void setTextQt(JTextField textQt) {
		this.textQt = textQt;
	}

	public JList getList() {
		return list;
	}

	public void setList(JList list) {
		this.list = list;
	}

	public JTextField getTextField() {
		return textQt;
	}

	public void setTextField(JTextField textField) {
		this.textQt = textField;
	}

	public JTextField getTextField_2() {
		return textPrix;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textPrix = textField_2;
	}

	public JTextField getTextField_3() {
		return textID;
	}

	public void setTextField_3(JTextField textField_3) {
		this.textID = textField_3;
	}

	public JTextField getTextField_4() {
		return textLibel;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public void setTextField_4(JTextField textField_4) {
		this.textLibel = textField_4;
	}

	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}

	public void setLblNewLabel(JLabel lblNewLabel) {
		this.lblNewLabel = lblNewLabel;
	}

	public JLabel getLblPrenom() {
		return lblPrenom;
	}

	public void setLblPrenom(JLabel lblPrenom) {
		this.lblPrenom = lblPrenom;
	}

	public JLabel getLblEmail() {
		return lblEmail;
	}

	public void setLblEmail(JLabel lblEmail) {
		this.lblEmail = lblEmail;
	}

	public JButton getBtnSupprimer() {
		return btnSupprimer;
	}

	public JButton getBtnModifier() {
		return btnModifier;
	}

	public void setBtnModifier(JButton btnModifier) {
		this.btnModifier = btnModifier;
	}

	public void setBtnSupprimer(JButton btnSupprimer) {
		this.btnSupprimer = btnSupprimer;
	}

	public JLabel getLblTlphone() {
		return lblTlphone;
	}

	public void setLblTlphone(JLabel lblTlphone) {
		this.lblTlphone = lblTlphone;
	}
	public void setTextPrenom(JTextField textPrenom) {
		this.textPrenom = textPrenom;
	}

	public JTextField getTextnom() {
		return textnom;
	}

	public void setTextnom(JTextField textnom) {
		this.textnom = textnom;
	}

	public JTextField getTextAdresse() {
		return textAdresse;
	}

	public void setTextAdresse(JTextField textAdresse) {
		this.textAdresse = textAdresse;
	}

	public JTextField getTextCp() {
		return textCp;
	}

	public void setTextCp(JTextField textCp) {
		this.textCp = textCp;
	}

	public JTextField getTextVille() {
		return textVille;
	}

	public void setTextVille(JTextField textVille) {
		this.textVille = textVille;
	}

	public JTextField getTextMail() {
		return textMail;
	}

	public void setTextMail(JTextField textMail) {
		this.textMail = textMail;
	}

	public JTextField getTextMdp() {
		return textMdp;
	}

	public void setTextMdp(JTextField textMdp) {
		this.textMdp = textMdp;
	}

	public JTextField getTextTel() {
		return textTel;
	}

	public void setTextTel(JTextField textTel) {
		this.textTel = textTel;
	}

	public JList getListclient() {
		return listclient;
	}

	public void setListclient(JList listclient) {
		this.listclient = listclient;
	}

	public JButton getBtnModifierCli() {
		return btnModifierCli;
	}

	public void setBtnModifierCli(JButton btnModifierCli) {
		this.btnModifierCli = btnModifierCli;
	}

	public JButton getBtnSupprimerCli() {
		return btnSupprimerCli;
	}

	public void setBtnSupprimerCli(JButton btnSupprimerCli) {
		this.btnSupprimerCli = btnSupprimerCli;
	}
	public JTextField getTextPrenom() {
		
		return textPrenom;
	}

	public JButton getBtnAjouterCli() {
		return btnAjouterCli;
	}

	public void setBtnAjouterCli(JButton btnAjouterCli) {
		this.btnAjouterCli = btnAjouterCli;
	}
}

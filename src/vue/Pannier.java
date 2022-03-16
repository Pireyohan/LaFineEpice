package vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

public class Pannier {

	private JFrame frame;
	private JTextField textField;
	private JButton btnsup;
	private JButton btnAjout;
	private JButton btnplus1;
	private JButton btnsmoin1;
	private JButton btnValidation,Croix;
	private JList listProduit;
	private JTextField txtTotal;
	private JTextField textlibellehide;
	private int mouseX, mouseY;
	
	public Pannier() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 627, 717);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		listProduit = new JList();
		listProduit.setForeground(new Color(139, 69, 19));
		listProduit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		listProduit.setBackground(Color.WHITE);
		listProduit.setBounds(45, 155, 340, 512);
		frame.getContentPane().add(listProduit);

		btnsup = new JButton("Supprimer");
		btnsup.setForeground(new Color(255, 160, 122));
		btnsup.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnsup.setFocusable(false);
		btnsup.setFocusTraversalKeysEnabled(false);
		btnsup.setFocusPainted(false);
		btnsup.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(255, 160, 122)));
		btnsup.addMouseListener(new MouseAdapter() {

			// je n'ai pas trouvé le moyen de transférer les "mousse listener" dans la
			// partie "control "donc a défaut de trouver une solution logique est
			// satisfaisant je laisse ceci ici//

			public void mouseReleased(MouseEvent e) {

				btnsup.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(255, 160, 122)));
			}

			public void mousePressed(MouseEvent e) {

				btnsup.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 160, 122)));
			}
		});
		
		
		
		btnsup.setBackground(Color.WHITE);
		btnsup.setActionCommand("");
		btnsup.setBounds(413, 315, 149, 30);
		frame.getContentPane().add(btnsup);

		btnAjout = new JButton("Ajouter");
		btnAjout.setForeground(new Color(255, 160, 122));
		btnAjout.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnAjout.setFocusable(false);
		btnAjout.setFocusTraversalKeysEnabled(false);
		btnAjout.setFocusPainted(false);
		btnAjout.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(255, 160, 122)));
		btnAjout.setBackground(Color.WHITE);
		btnAjout.setActionCommand("");
		btnAjout.setBounds(413, 219, 149, 30);
		frame.getContentPane().add(btnAjout);

		btnplus1 = new JButton("+");
		btnplus1.setForeground(new Color(255, 160, 122));
		btnplus1.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnplus1.setFocusable(false);
		btnplus1.setFocusTraversalKeysEnabled(false);
		btnplus1.setFocusPainted(false);
		btnplus1.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(255, 160, 122)));
		btnplus1.setBackground(Color.WHITE);
		btnplus1.setActionCommand("");
		btnplus1.setBounds(413, 260, 31, 30);
		frame.getContentPane().add(btnplus1);

		btnsmoin1 = new JButton("-");
		btnsmoin1.setForeground(new Color(255, 160, 122));
		btnsmoin1.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnsmoin1.setFocusable(false);
		btnsmoin1.setFocusTraversalKeysEnabled(false);
		btnsmoin1.setFocusPainted(false);
		btnsmoin1.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(255, 160, 122)));
		btnsmoin1.setBackground(Color.WHITE);
		btnsmoin1.setActionCommand("");
		btnsmoin1.setBounds(531, 260, 31, 30);
		frame.getContentPane().add(btnsmoin1);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(469, 260, 35, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		btnValidation = new JButton("Valider");
		btnValidation.setForeground(new Color(255, 160, 122));
		btnValidation.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnValidation.setFocusable(false);
		btnValidation.setFocusTraversalKeysEnabled(false);
		btnValidation.setFocusPainted(false);
		btnValidation.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(255, 160, 122)));
		btnValidation.addMouseListener(new MouseAdapter() {

			// je n'ai pas trouvé le moyen de transférer les "mousse listener" dans la
			// partie "control "donc a défaut de trouver une solution logique est
			// satisfaisant je laisse ceci ici//

			public void mouseReleased(MouseEvent e) {

				btnValidation.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(255, 160, 122)));
			}

			public void mousePressed(MouseEvent e) {

				btnValidation.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 160, 122)));
			}
		});
		
		
		btnValidation.setBackground(Color.WHITE);
		btnValidation.setActionCommand("");
		btnValidation.setBounds(413, 612, 149, 30);
		frame.getContentPane().add(btnValidation);
		
		txtTotal = new JTextField();
		txtTotal.setBorder(null);
		txtTotal.setEditable(false);
		txtTotal.setBackground(Color.WHITE);
		txtTotal.setForeground(new Color(255, 127, 80));
		txtTotal.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		txtTotal.setBounds(418, 570, 138, 31);
		frame.getContentPane().add(txtTotal);
		txtTotal.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Panier ");
		lblNewLabel.setForeground(new Color(255, 160, 122));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 77));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(155, 11, 320, 107);
		frame.getContentPane().add(lblNewLabel);
		
		textlibellehide = new JTextField();
		textlibellehide.setVisible(false);
		textlibellehide.setEditable(false);
		textlibellehide.setColumns(10);
		textlibellehide.setBounds(413, 372, 149, 30);
		frame.getContentPane().add(textlibellehide);
		
		Croix = new JButton("X");
		Croix.setFont(new Font("Tahoma", Font.BOLD, 10));
		Croix.setFocusTraversalKeysEnabled(false);
		Croix.setFocusPainted(false);
		Croix.setContentAreaFilled(false);
		Croix.setBorderPainted(false);
		Croix.setBounds(570, 11, 47, 38);
		frame.getContentPane().add(Croix);
		
		
		frame.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				frame.setLocation(frame.getX() + e.getX() - mouseX, frame.getY() + e.getY() - mouseY);

			}
		});
		frame.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();

			}
		});
		
		
	}

	public JTextField getTxtTotal() {
		return txtTotal;
	}

	public void setTxtTotal(JTextField txtTotal) {
		this.txtTotal = txtTotal;
	}

	public JList getListProduit() {
		return listProduit;
	}

	public void setListProduit(JList listProduit) {
		this.listProduit = listProduit;
	}

	public JFrame getFrame() {
		return frame;
	}

	public JTextField getTextlibellehide() {
		return textlibellehide;
	}

	public void setTextlibellehide(JTextField textlibellehide) {
		this.textlibellehide = textlibellehide;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JButton getBtnsup() {
		return btnsup;
	}

	public void setBtnsup(JButton btnsup) {
		this.btnsup = btnsup;
	}

	public JButton getBtnAjout() {
		return btnAjout;
	}

	public void setBtnAjout(JButton btnAjout) {
		this.btnAjout = btnAjout;
	}

	public JButton getBtnplus1() {
		return btnplus1;
	}

	public void setBtnplus1(JButton btnplus1) {
		this.btnplus1 = btnplus1;
	}

	public JButton getBtnsmoin1() {
		return btnsmoin1;
	}

	public void setBtnsmoin1(JButton btnsmoin1) {
		this.btnsmoin1 = btnsmoin1;
	}

	public JButton getCroix() {
		return Croix;
	}

	public void setCroix(JButton croix) {
		Croix = croix;
	}

	public JButton getBtnValidation() {
		return btnValidation;
	}

	public void setBtnValidation(JButton btnValidation) {
		this.btnValidation = btnValidation;
	}
}

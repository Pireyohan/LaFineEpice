package vue;

/**
 * ma page d'acceuille
 * 
 * 
 * 
 */

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Acceuil {

	JFrame frame;
	JFrame fond;
	JPanel panel;
	JLabel Img;
	JButton testeExit;
	JButton btnConnex;
	JButton btnEntre;
	private int mouseX,mouseY;
	private JButton btnadmin;
	
	
	public Acceuil() {
		initialize();
	}

	
	private void initialize() {

		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Acceuil.class.getResource("/ressource/logoetc/logo3.png")));
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 884, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// création d'un JPanel pour faire un effet transparent
		JPanel translucy = new JPanel();
		translucy.setForeground(Color.WHITE);
		translucy.setBackground(Color.RED);
		translucy.setBounds(0, 0, 884, 474);
		frame.getContentPane().add(translucy);
		translucy.setBackground(new Color(135, 63, 0, 100));
		
		/**
		 * methode pour deplacé ma fentre "onclick"
		 * je n'ai pas reussi a transférée (pour le moment) ceci dans le controleur
		 * pour le moment elle va resté dans la vue
		 * 
		 */
		translucy.addMouseMotionListener(new MouseMotionAdapter() {
			
			public void mouseDragged(MouseEvent e) {
				frame.setLocation(frame.getX() + e.getX() - mouseX,frame.getY() +e.getY() - mouseY);
				
			}
		});
		translucy.addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				mouseX=e.getX();
				mouseY=e.getY();
				
			}
		});
		
		
		
		translucy.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("L'\u00E9pice au bout du clic");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Rougant Rough", Font.PLAIN, 34));
		lblNewLabel_1.setBounds(322, 78, 506, 53);
		translucy.add(lblNewLabel_1);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(322, 129, 461, 10);
		translucy.add(panel_1_1);

		JTextArea txtrNouveauxDcouvrezNotre = new JTextArea();
		txtrNouveauxDcouvrezNotre.setEditable(false);
		txtrNouveauxDcouvrezNotre.setWrapStyleWord(true);
		txtrNouveauxDcouvrezNotre.setForeground(Color.WHITE);
		txtrNouveauxDcouvrezNotre.setFont(new Font("Tahoma", Font.BOLD, 19));
		txtrNouveauxDcouvrezNotre
				.setText("Nouveaux !  D\u00E9couvrez notre collection d'\u00E9pice pour Barbecue & Plancha !");
		txtrNouveauxDcouvrezNotre.setLineWrap(true);
		txtrNouveauxDcouvrezNotre.setBounds(215, 297, 268, 82);
		txtrNouveauxDcouvrezNotre.setBackground(new Color(0, 0, 0, 0));
		translucy.add(txtrNouveauxDcouvrezNotre);

		JPanel panel_2_2_1 = new JPanel();
		panel_2_2_1.setBounds(215, 377, 679, 53);
		translucy.add(panel_2_2_1);
		panel_2_2_1.setLayout(null);

		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(Color.BLACK);
		panel_1_2.setBounds(333, 11, 4, 31);
		panel_2_2_1.add(panel_1_2);

		btnEntre = new JButton("Entr\u00E9e");
		btnEntre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEntre.setForeground(Color.BLACK);
		btnEntre.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnEntre.setFocusable(false);
		btnEntre.setFocusTraversalKeysEnabled(false);
		btnEntre.setFocusPainted(false);
		btnEntre.setBorderPainted(false);
		btnEntre.setBorder(null);
		btnEntre.setBackground(new Color(0, 0, 0, 0));
		btnEntre.setActionCommand("");
		btnEntre.setBounds(10, 11, 296, 35);		
		panel_2_2_1.add(btnEntre);

		btnConnex = new JButton("Connexion");
		btnConnex.setForeground(Color.BLACK);
		btnConnex.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnConnex.setFocusable(false);
		btnConnex.setFocusTraversalKeysEnabled(false);
		btnConnex.setFocusPainted(false);
		btnConnex.setBorderPainted(false);
		btnConnex.setBorder(null);
		btnConnex.setBackground(new Color(0, 0, 0, 0));
		btnConnex.setActionCommand("");
		btnConnex.setBounds(355, 11, 296, 35);
		panel_2_2_1.add(btnConnex);

		testeExit = new JButton("X");
		testeExit.setFocusable(false);
		testeExit.setFocusTraversalKeysEnabled(false);
		testeExit.setFocusPainted(false);
		testeExit.setBorderPainted(false);
		testeExit.setActionCommand("");
		testeExit.setBorder(null);
		testeExit.setForeground(Color.WHITE);
		testeExit.setBackground(new Color(0, 0, 0, 0));
		testeExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		testeExit.setBounds(831, 11, 43, 35);
		translucy.add(testeExit);
		
		btnadmin = new JButton("Admin");
		btnadmin.setForeground(Color.WHITE);
		btnadmin.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnadmin.setFocusable(false);
		btnadmin.setFocusTraversalKeysEnabled(false);
		btnadmin.setFocusPainted(false);
		btnadmin.setBorderPainted(false);
		btnadmin.setBorder(null);
		btnadmin.setBackground(new Color(135, 63, 0, 200));
		btnadmin.setActionCommand("");
		btnadmin.setBounds(10, 442, 73, 21);
		translucy.add(btnadmin);
		
				JLabel Logo = new JLabel("");
				Logo.setBounds(10, 11, 249, 255);
				translucy.add(Logo);
				Logo.setHorizontalAlignment(SwingConstants.CENTER);
				Logo.setIcon(new ImageIcon(Acceuil.class.getResource("/ressource/logoetc/logo3.png")));

		Img = new JLabel("");
		Img.setIcon(new ImageIcon(Acceuil.class.getResource("/ressource/logoetc/epices_592527149.jpg")));
		Img.setBounds(0, 0, 884, 474);
		Img.setBackground(new Color(0, 0, 0, 0));
		frame.setBackground(new Color(0, 0, 0, 0));
		frame.getContentPane().add(Img);

	}

	public JButton getBtnadmin() {
		return btnadmin;
	}

	public void setBtnadmin(JButton btnadmin) {
		this.btnadmin = btnadmin;
	}

	public JButton getTesteExit() {
		return testeExit;
	}

	public void setTesteExit(JButton testeExit) {
		this.testeExit = testeExit;
	}

	public JFrame getFrame() {
		return frame;
	}



	public void setFond(JFrame fond) {
		this.fond = fond;
	}

	public JButton getBtnConnex() {
		return btnConnex;
	}

	public void setBtnConnex(JButton btnConnex) {
		this.btnConnex = btnConnex;
	}

	public JButton getBtnEntre() {
		return btnEntre;
	}

	public void setBtnEntre(JButton btnEntre) {
		this.btnEntre = btnEntre;
	}

	public JPanel getPanel() {
		return panel;
	}

	public JLabel getImg() {
		return Img;
	}

	public void setImg(JLabel img) {
		Img = img;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
}

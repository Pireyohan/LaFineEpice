package vue;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.MatteBorder;
public class PageProduit {

	JFrame frame;
	JLabel Img;
	JButton Croix;
	JButton btnCafe;
	JButton btnEpice;
	JButton btnTh;
	JButton btnMiel;
	JPanel panelcafé;
	JPanel panelmiel;
	JPanel panelEpice;
	JPanel panelThé;
	Tea tea;
	Cafe caf;
	Epice epi;
	Miel mie;
	JLabel lblNewLabel;
	private int mouseX, mouseY;
	private JLabel lblNaturalEstate;
	private JLabel lblPerouSanIgna;
	private JLabel lblEtiopieMokaBish;
	private JLabel lblNewLabel_4;
	private JLabel lblBioTop;
	private JLabel lblBlackExpreso;
	private JLabel lblCafeinoBlend;
	private JLabel lblColombieFinca;
	private JLabel lblDeca;
	private JLabel lblEthioBio;
	private JLabel lblHondurasLosCeibos;
	private JLabel lblHondurasMaracala;
	private JLabel lblIndonesieSherKHan;
	private JTextPane txtpnlblBioTop;
	private JTextPane txtpnlblBlkExpresso;
	private JButton btnBioTop;
	private JButton btnBlackExpresso;
	private JButton btnConection;
	private JButton btnPanier;
	private JLabel lblepice;

	public PageProduit(Tea tea,Cafe caf,Epice epi,Miel mie) {
		this.mie=mie;
		this.caf=caf;
		this.tea=tea;
		this.epi=epi;
		initialize();
	}

	@SuppressWarnings("unchecked")
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 890, 711);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel translucy = new JPanel();
		translucy.setForeground(Color.WHITE);
		translucy.setBackground(Color.RED);
		translucy.setBounds(0, 0, 890, 711);
		frame.getContentPane().add(translucy);
		translucy.setBackground(new Color(135, 63, 0, 100));

		// je n'ai pas trouvé le moyen de transférer les "mousse listener" dans la
		// partie "control "donc a défaut de trouver une solution logique est
		// satisfaisant je laisse ceci ici//

		// **** methode pour bougé la fentre*********/

		translucy.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				frame.setLocation(frame.getX() + e.getX() - mouseX, frame.getY() + e.getY() - mouseY);

			}
		});
		translucy.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();

			}
		});

		translucy.setLayout(null);

		panelcafé = new JPanel();
		panelcafé.setBounds(317, 147, 550, 699);
		translucy.add(panelcafé);
		
		panelcafé.setBackground(Color.WHITE);
		panelcafé.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBorder(null);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(10, 11, 530, 538);
		panelcafé.add(caf.getScrollPane()).setVisible(false);
		panelcafé.add(scrollPane);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		scrollPane.setViewportView(panel_2);

	;

		// ******************* Mise en page , alignement Texte image
		// ***************************//

		
		

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(296, 0, 594, 711);
		translucy.add(panel_1);
		panel_1.setLayout(null);

		// *****croix pour quité
		// je bn'ai pas reussi pour le moment a faire autrement concerant la X pour
		// quitté, a défaut je le laisse ici//

		Croix = new JButton("X");
		Croix.setFocusPainted(false);
		Croix.setFocusTraversalKeysEnabled(false);
		Croix.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Croix.setContentAreaFilled(false);
		Croix.setFont(new Font("Tahoma", Font.BOLD, 10));
		Croix.setBorderPainted(false);
		Croix.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);

			}
		});
		Croix.setBounds(537, 11, 47, 38);
		panel_1.add(Croix);

//******************les bouton*******************************//

		btnEpice = new JButton("\u00C9pice");
		btnEpice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				panelEpice.setVisible(true);
				panelcafé.setVisible(false);
				panelThé.setVisible(false);
				panelmiel.setVisible(false);
				epi.getScrollthe().setVisible(true);
				
			}
		});
		btnEpice.setForeground(new Color(255, 160, 122));
		btnEpice.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnEpice.setFocusable(false);
		btnEpice.setFocusTraversalKeysEnabled(false);
		btnEpice.setFocusPainted(false);
		btnEpice.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(255, 160, 122)));
		btnEpice.setBackground(new Color(255, 255, 255));
		btnEpice.setActionCommand("");
		btnEpice.addMouseListener(new MouseAdapter() {

			// je n'ai pas trouvé le moyen de transférer les "mousse listener" dans la
			// partie "control "donc a défaut de trouver une solution logique est
			// satisfaisant je laisse ceci ici//

			public void mouseReleased(MouseEvent e) {

				btnEpice.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(255, 160, 122)));
			}

			public void mousePressed(MouseEvent e) {

				btnEpice.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 160, 122)));
			}
		});

		btnEpice.setBounds(21, 91, 130, 35);
		panel_1.add(btnEpice);

		btnCafe = new JButton("Caf\u00E9");
		btnCafe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				panelEpice.setVisible(false);
				panelcafé.setVisible(true);
				panelThé.setVisible(false);
				panelmiel.setVisible(false);
				caf.getScrollPane().setVisible(true);

			}
		});
		btnCafe.setForeground(new Color(255, 160, 122));
		btnCafe.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnCafe.setFocusable(false);
		btnCafe.setFocusTraversalKeysEnabled(false);
		btnCafe.setFocusPainted(false);
		btnCafe.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(255, 160, 122)));
		btnCafe.setBackground(Color.WHITE);
		btnCafe.setActionCommand("");

		btnCafe.addMouseListener(new MouseAdapter() {

			// je n'ai pas trouvé le moyen de transférer les "mousse listener" dans la
			// partie "control "donc a défaut de trouver une solution logique est
			// satisfaisant je laisse ceci ici//

			public void mouseReleased(MouseEvent e) {

				btnCafe.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(255, 160, 122)));
			}

			public void mousePressed(MouseEvent e) {

				btnCafe.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 160, 122)));
			}
		});

		btnCafe.setBounds(161, 91, 130, 35);
		panel_1.add(btnCafe);

		btnTh = new JButton("Th\u00E9");

		btnTh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cafe caf = new Cafe();

				panelEpice.setVisible(false);
				panelcafé.setVisible(false);
				panelThé.setVisible(true);
				panelmiel.setVisible(false);
				tea.getScrollthe().setVisible(true);
			}
		});
		btnTh.setForeground(new Color(255, 160, 122));
		btnTh.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnTh.setFocusable(false);
		btnTh.setFocusTraversalKeysEnabled(false);
		btnTh.setFocusPainted(false);
		btnTh.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(255, 160, 122)));
		btnTh.setBackground(Color.WHITE);
		btnTh.setActionCommand("");
		btnTh.addMouseListener(new MouseAdapter() {

			// je n'ai pas trouvé le moyen de transférer les "mousse listener" dans la
			// partie "control "donc a défaut de trouver une solution logique est
			// satisfaisant je laisse ceci ici//

			public void mouseReleased(MouseEvent e) {

				btnTh.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(255, 160, 122)));
			}

			public void mousePressed(MouseEvent e) {

				btnTh.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 160, 122)));
			}
		});

		btnTh.setBounds(301, 91, 130, 35);
		panel_1.add(btnTh);

		btnMiel = new JButton("Miel");

		btnMiel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				panelEpice.setVisible(false);
				panelcafé.setVisible(false);
				panelThé.setVisible(false);
				panelmiel.setVisible(true);
				mie.getScrollthe().setVisible(true);
			
			}
		});

		btnMiel.setForeground(new Color(255, 160, 122));
		btnMiel.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnMiel.setFocusable(false);
		btnMiel.setFocusTraversalKeysEnabled(false);
		btnMiel.setFocusPainted(false);
		btnMiel.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(255, 160, 122)));
		btnMiel.setBackground(Color.WHITE);
		btnMiel.setActionCommand("");

		btnMiel.addMouseListener(new MouseAdapter() {

			// je n'ai pas trouvé le moyen de transférer les "mousse listener" dans la
			// partie "control "donc a défaut de trouver une solution logique est
			// satisfaisant je laisse ceci ici//

			public void mouseReleased(MouseEvent e) {

				btnMiel.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(255, 160, 122)));
			}

			public void mousePressed(MouseEvent e) {

				btnMiel.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 160, 122)));
			}
		});

		btnMiel.setBounds(441, 91, 130, 35);
		panel_1.add(btnMiel);

		panelEpice = new JPanel();
		panelEpice.setBackground(Color.WHITE);
		panelEpice.add(epi.getScrollthe()).setVisible(false);
		panelEpice.setBounds(21, 149, 550, 562);
		panel_1.add(panelEpice);
		panelEpice.setLayout(null);

		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(
				new ImageIcon(new ImageIcon("F:\\COUR\\fine \u00E9pice\\caf\u00E9\\2021-03-19_natural-estate.jpg")
						.getImage().getScaledInstance(200, 180, Image.SCALE_SMOOTH)));

		panelmiel = new JPanel();
		panelmiel.setBounds(21, 148, 550, 563);
		panel_1.add(panelmiel);
		panelmiel.add(mie.getScrollthe()).setVisible(false);
		panelmiel.setLayout(null);
		panelmiel.setBackground(Color.WHITE);

		panelThé = new JPanel();
		panelThé.setBounds(21, 148, 550, 563);
		panel_1.add(panelThé);
		panelThé.setLayout(null);
		panelThé.add(tea.getScrollthe()).setVisible(false);
		panelThé.setBackground(Color.WHITE);

		btnPanier = new JButton("");
		btnPanier.setIcon(new ImageIcon(PageProduit.class.getResource("/ressource/logoetc/shopping-basket.png")));
		btnPanier.setForeground(new Color(255, 160, 122));
		btnPanier.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnPanier.setFocusable(false);
		btnPanier.setFocusPainted(false);
		btnPanier.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(255, 160, 122)));
		btnPanier.addMouseListener(new MouseAdapter() {

			// je n'ai pas trouvé le moyen de transférer les "mousse listener" dans la
			// partie "control "donc a défaut de trouver une solution logique est
			// satisfaisant je laisse ceci ici//

			public void mouseReleased(MouseEvent e) {

				btnPanier.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(255, 160, 122)));
			}

			public void mousePressed(MouseEvent e) {

				btnPanier.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 160, 122)));
			}
		});
		
		
		
		btnPanier.setBackground(Color.WHITE);
		btnPanier.setActionCommand("");
		btnPanier.setBounds(493, 14, 34, 35);
		panel_1.add(btnPanier);

		btnConection = new JButton("");
		btnConection.setIcon(new ImageIcon(PageProduit.class.getResource("/ressource/logoetc/conection.png")));
		btnConection.setForeground(new Color(255, 160, 122));
		btnConection.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnConection.setFocusable(false);
		btnConection.setFocusTraversalKeysEnabled(false);
		btnConection.setFocusPainted(false);
		btnConection.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(255, 160, 122)));
		btnConection.addMouseListener(new MouseAdapter() {

			// je n'ai pas trouvé le moyen de transférer les "mousse listener" dans la
			// partie "control "donc a défaut de trouver une solution logique est
			// satisfaisant je laisse ceci ici//

			public void mouseReleased(MouseEvent e) {

				btnConection.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(255, 160, 122)));
			}

			public void mousePressed(MouseEvent e) {

				btnConection.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 160, 122)));
			}
		});
		
		
		
		btnConection.setBackground(Color.WHITE);
		btnConection.setActionCommand("");
		btnConection.setBounds(449, 14, 34, 35);
		panel_1.add(btnConection);

//***************texte presentation/Illustration******************//
		JTextArea txtrLaCuisineDes = new JTextArea();
		txtrLaCuisineDes.setEditable(false);
		txtrLaCuisineDes.setWrapStyleWord(true);
		txtrLaCuisineDes
				.setText("La Cuisine des \u00C9pices : m\u00E9langes d'\u00E9pices cr\u00E9atifs & savoureux\r\n\r\n");
		txtrLaCuisineDes.setLineWrap(true);
		txtrLaCuisineDes.setForeground(Color.WHITE);
		txtrLaCuisineDes.setFont(new Font("Tahoma", Font.BOLD, 19));
		txtrLaCuisineDes.setBackground(new Color(0, 0, 0, 0));
		txtrLaCuisineDes.setBounds(10, 53, 270, 85);
		translucy.add(txtrLaCuisineDes);

		JTextArea txtrDepuisDeTrs = new JTextArea();
		txtrDepuisDeTrs.setEditable(false);
		txtrDepuisDeTrs.setWrapStyleWord(true);
		txtrDepuisDeTrs.setText(
				"Depuis de tr\u00E8s nombreuses ann\u00E9es, nous vous proposons de beaux m\u00E9langes d'\u00E9pices fins et gourmands. Faciles \u00E0 utiliser, ce sont de v\u00E9ritables aides culinaires qui accompagnent vos plats du quotidien. Un simple geste suffit pour relever vos mets et sublimer votre cuisine de tous les jours.\r\n\r\n\r\n\r\n");
		txtrDepuisDeTrs.setLineWrap(true);
		txtrDepuisDeTrs.setForeground(Color.WHITE);
		txtrDepuisDeTrs.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrDepuisDeTrs.setBackground(new Color(0, 0, 0, 0));
		txtrDepuisDeTrs.setBounds(10, 149, 270, 101);
		translucy.add(txtrDepuisDeTrs);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 890, 711);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PageProduit.class.getResource("/ressource/logoetc/caf\u00E9.jpg")));
		lblNewLabel.setBounds(0, 0, 890, 711);
		panel.add(lblNewLabel);
		
		lblepice = new JLabel("");
		lblepice.setIcon(new ImageIcon(PageProduit.class.getResource("/ressource/logoetc/epices_592527149.jpg")));
		lblepice.setBounds(0, 0, 890, 711);
		panel.add(lblepice);

	}

	public JButton getBtnBioTop() {
		return btnBioTop;
	}

	public void setBtnBioTop(JButton btnBioTop) {
		this.btnBioTop = btnBioTop;
	}


	public JButton getBtnBlackExpresso() {
		return btnBlackExpresso;
	}

	public void setBtnBlackExpresso(JButton btnBlackExpresso) {
		this.btnBlackExpresso = btnBlackExpresso;
	}

	public JButton getBtnConection() {
		return btnConection;
	}

	public void setBtnConection(JButton btnConection) {
		this.btnConection = btnConection;
	}

	public JPanel getPanelcafé() {
		return panelcafé;
	}

	public void setPanelcafé(JPanel panelcafé) {
		this.panelcafé = panelcafé;
	}

	public JLabel getImg() {
		return Img;
	}

	public void setImg(JLabel img) {
		Img = img;
	}

	public JButton getCroix() {
		return Croix;
	}

	public void setCroix(JButton croix) {
		Croix = croix;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JButton getBtnCafe() {
		return btnCafe;
	}

	public void setBtnCafe(JButton btnCafe) {
		this.btnCafe = btnCafe;
	}

	public JButton getBtnEpice() {
		return btnEpice;
	}

	public void setBtnEpice(JButton btnEpice) {
		this.btnEpice = btnEpice;
	}

	public JPanel getPanelmiel() {
		return panelmiel;
	}

	public void setPanelmiel(JPanel panelmiel) {
		this.panelmiel = panelmiel;
	}

	public JPanel getPanelEpice() {
		return panelEpice;
	}

	public void setPanelEpice(JPanel panelEpice) {
		this.panelEpice = panelEpice;
	}

	public JPanel getPanelThé() {
		return panelThé;
	}

	public void setPanelThé(JPanel panelThé) {
		this.panelThé = panelThé;
	}

	public JButton getBtnTh() {
		return btnTh;
	}

	public void setBtnTh(JButton btnTh) {
		this.btnTh = btnTh;
	}

	public JButton getBtnMiel() {
		return btnMiel;
	}

	public void setBtnMiel(JButton btnMiel) {
		this.btnMiel = btnMiel;
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

	public JButton getBtnPanier() {
		return btnPanier;
	}

	public void setBtnPanier(JButton btnPanier) {
		this.btnPanier = btnPanier;
	}

	public void setMouseY(int mouseY) {
		this.mouseY = mouseY;
	}
}

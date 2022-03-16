package vue;

/**
 * 
 * 
 * vue Café
 * 
 * 
 * 
 * 
 */
import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ScrollPaneConstants;

public class Cafe {

	private JFrame frame;
	private JPanel panel;
	private JLabel PHOTO1, PHOTO2, PHOTO3, PHOTO4, PHOTO5, PHOTO6, PHOTO7, PHOTO8, PHOTO9, PHOTO10;
	private JButton BOUTON1, BOUTON2, BOUTON3, BOUTON6, BOUTON4, BOUTON5, BOUTON7, BOUTON8, BOUTON9, BOUTON10;
	private JTextPane TXT1, TXT2, TXT3, TXT4, TXT5, TXT6, TXT7, TXT8, TXT9, TXT10;

	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 562, 548);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 11, 526, 475);
		frame.getContentPane().add(scrollPane);

		panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(Color.WHITE);
		scrollPane.setViewportView(panel);

		/**
		 * 
		 * mes photos/images
		 * 
		 */

		PHOTO1 = new JLabel("");
		PHOTO1.setIcon(new ImageIcon(Cafe.class.getResource("/ressource/caf\u00E9/2019-07-22_perou-san-ignacio-nouveau-compresse.jpg")));

		PHOTO2 = new JLabel("");
		PHOTO2.setIcon(new ImageIcon(Cafe.class.getResource("/ressource/caf\u00E9/2021-03-19_natural-estate.jpg")));

		PHOTO3 = new JLabel("");
		PHOTO3.setIcon(new ImageIcon(Cafe.class.getResource("/ressource/caf\u00E9/bio-top.jpg")));

		PHOTO4 = new JLabel("");
		PHOTO4.setIcon(new ImageIcon(Cafe.class.getResource("/ressource/caf\u00E9/black-expresso.jpg")));

		PHOTO5 = new JLabel("");
		PHOTO5.setIcon(new ImageIcon(Cafe.class.getResource("/ressource/caf\u00E9/cafeino-blend.jpg")));

		PHOTO6 = new JLabel("");
		PHOTO6.setIcon(
				new ImageIcon(Cafe.class.getResource("/ressource/caf\u00E9/colombie-finca-potosi-compresse.jpg")));

		PHOTO7 = new JLabel("");
		PHOTO7.setIcon(new ImageIcon(Cafe.class.getResource("/ressource/caf\u00E9/deca.jpg")));

		PHOTO8 = new JLabel("");
		PHOTO8.setIcon(new ImageIcon(
				Cafe.class.getResource("/ressource/caf\u00E9/ethiopie-bio-moka-gamoji-kelem-wallagga.jpg")));

		PHOTO9 = new JLabel("");
		PHOTO9.setIcon(new ImageIcon(Cafe.class.getResource("/ressource/caf\u00E9/honduras_los-ceibos.jpg")));

		PHOTO10 = new JLabel("");
		PHOTO10.setIcon(new ImageIcon(Cafe.class.getResource("/ressource/caf\u00E9/honduras_marcala-compresse4.jpg")));

		/**
		 * des JTextePanne pour afficher les desctiption des diferrent produits
		 * 
		 * 
		 */
		TXT1 = new JTextPane();
		TXT1.setEditable(false);
		TXT1.setForeground(new Color(205, 133, 63));
		TXT1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		TXT1.setText("Ce café en grain biologique pousse entre 1 200 et 1 800 mètres d'altitude sur des sols volcaniques. Il présente une fine douceur, un corps rond et de belles notes fruitées.\r\n"
				+ "Sa longueur en bouche fait même ressortir des notes florales.");


		TXT2 = new JTextPane();
		TXT2.setEditable(false);
		TXT2.setForeground(new Color(205, 133, 63));
		TXT2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		TXT2.setText("Cet assemblage maison nommé Natural Estate a séduit le jury des Prix Epicures et remporté la médaille d'or grâce à ses délicieuses notes gustatives de fruits exotiques.\r\n"
				+ "Certification Agriculture Biologique & Café de forêt");
		
		TXT3 = new JTextPane();
		TXT3.setEditable(false);
		TXT3.setForeground(new Color(205, 133, 63));
		TXT3.setFont(new Font("Tahoma", Font.ITALIC, 11));
		TXT3.setText("Goûtez au mélange de cafés en grains biologiques de la maison ! Un café doux et fruité, certifié issu de l'agriculture biologique. ");

		TXT4 = new JTextPane();
		TXT4.setEditable(false);
		TXT4.setForeground(new Color(205, 133, 63));
		TXT4.setFont(new Font("Tahoma", Font.ITALIC, 11));
		TXT4.setText("Le blend de cafés en grains Black Expresso est composé de 70% Arabica et de 30% Robusta. Le tout est soutenu par un Robusta lavé du Vietnam de qualité supérieure afin de lui donner de la puissance sans excès d'amertume");

		TXT5 = new JTextPane();
		TXT5.setEditable(false);
		TXT5.setForeground(new Color(205, 133, 63));
		TXT5.setFont(new Font("Tahoma", Font.ITALIC, 11));
		TXT5.setText("Dégustez notre nouveau mélange biologique créé par notre torréfacteur ! Un blend parfaitement adapté à une extraction en machine expresso, gourmand, intense & équilibré.");

		TXT6 = new JTextPane();
		TXT6.setEditable(false);
		TXT6.setForeground(new Color(205, 133, 63));
		TXT6.setFont(new Font("Tahoma", Font.ITALIC, 11));
		TXT6.setText("Ce café coopératif, cultivé dans le respect de la nature , a gagné notre coeur pour plusieurs raisons : il est cultivé à haute altitude (1600 - 2000m).");

		TXT7 = new JTextPane();
		TXT7.setEditable(false);
		TXT7.setForeground(new Color(205, 133, 63));
		TXT7.setFont(new Font("Tahoma", Font.ITALIC, 11));
		TXT7.setText("Ce décaféiné sans solvant est un blend 100% arabica de la plantation Altura au Mexique. Ce café en grain a été décaféiné selon le procédé Suisse SANROKE, entièrement naturel, ce procédé permet d'éliminer 99,9% de la caféine sans utilisation de solvant.");

		TXT8 = new JTextPane();
		TXT8.setEditable(false);
		TXT8.setForeground(new Color(205, 133, 63));
		TXT8.setFont(new Font("Tahoma", Font.ITALIC, 11));
		TXT8.setText("Ce café de terroir est issu d'une alliance de trois producteurs du village situé sur la montagne de Kuri culminant à 2 400 mètres d'altitude dans la région du Wallaga, à l'ouest de l'Ethiopie.Ses notes vineuses, de pêche, de mangue, de mandarine, de\r\n"
				+ "pamplemousse, de citron, d'ananas raviront votre palais... ainsi que votre tasse !\r\n"
				+ "");

		TXT9 = new JTextPane();
		TXT9.setEditable(false);
		TXT9.setForeground(new Color(205, 133, 63));
		TXT9.setFont(new Font("Tahoma", Font.ITALIC, 11));
		TXT9.setText("Un café d'exception sur des notes fruitées d'abricot et de citron avec une finale en bouche florale et miellée.\r\n"
				+ "Issu de l'agriculture biologique, ce micro-lot est produit dans la petite ferme de Los Ceibos par Anastacio Argueta.");

		TXT10 = new JTextPane();
		TXT10.setEditable(false);
		TXT10.setForeground(new Color(205, 133, 63));
		TXT10.setFont(new Font("Tahoma", Font.ITALIC, 11));
		TXT10.setText("Ce café biologique est produit par de petits producteurs unis en société à l'esprit coopératif.\r\n"
				+ " \r\n"
				+ "C'est un café complexe, très aromatique avec des notes sauvages et boisées.");

		/**
		 * 
		 * mais different bouton
		 */

		BOUTON1 = new JButton("");
		BOUTON1.setBorderPainted(false);
		BOUTON1.setBackground(Color.WHITE);
		BOUTON1.setIcon(new ImageIcon(Cafe.class.getResource("/ressource/logoetc/shopping-basket.png")));

		BOUTON2 = new JButton("");
		BOUTON2.setIcon(new ImageIcon(Cafe.class.getResource("/ressource/logoetc/shopping-basket.png")));
		BOUTON2.setBorderPainted(false);
		BOUTON2.setBackground(Color.WHITE);

		BOUTON3 = new JButton("");
		BOUTON3.setIcon(new ImageIcon(Cafe.class.getResource("/ressource/logoetc/shopping-basket.png")));
		BOUTON3.setBorderPainted(false);
		BOUTON3.setBackground(Color.WHITE);

		BOUTON4 = new JButton("");
		BOUTON4.setIcon(new ImageIcon(Cafe.class.getResource("/ressource/logoetc/shopping-basket.png")));
		BOUTON4.setBorderPainted(false);
		BOUTON4.setBackground(Color.WHITE);

		BOUTON5 = new JButton("");
		BOUTON5.setIcon(new ImageIcon(Cafe.class.getResource("/ressource/logoetc/shopping-basket.png")));
		BOUTON5.setBorderPainted(false);
		BOUTON5.setBackground(Color.WHITE);

		BOUTON6 = new JButton("");
		BOUTON6.setIcon(new ImageIcon(Cafe.class.getResource("/ressource/logoetc/shopping-basket.png")));
		BOUTON6.setBorderPainted(false);
		BOUTON6.setBackground(Color.WHITE);

		BOUTON7 = new JButton("");
		BOUTON7.setIcon(new ImageIcon(Cafe.class.getResource("/ressource/logoetc/shopping-basket.png")));
		BOUTON7.setBorderPainted(false);
		BOUTON7.setBackground(Color.WHITE);

		BOUTON8 = new JButton("");
		BOUTON8.setIcon(new ImageIcon(Cafe.class.getResource("/ressource/logoetc/shopping-basket.png")));
		BOUTON8.setBorderPainted(false);
		BOUTON8.setBackground(Color.WHITE);

		BOUTON9 = new JButton("");
		BOUTON9.setIcon(new ImageIcon(Cafe.class.getResource("/ressource/logoetc/shopping-basket.png")));
		BOUTON9.setBorderPainted(false);
		BOUTON9.setBackground(Color.WHITE);

		BOUTON10 = new JButton("");
		BOUTON10.setIcon(new ImageIcon(Cafe.class.getResource("/ressource/logoetc/shopping-basket.png")));
		BOUTON10.setBorderPainted(false);
		BOUTON10.setBackground(Color.WHITE);

		/**
		 * 
		 * c'est ici que je définit mais preference d'alignemet de mais different
		 * objet/bouton/image
		 * 
		 */

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(PHOTO2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(PHOTO4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(PHOTO5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(PHOTO6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(PHOTO7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(PHOTO3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(PHOTO8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(PHOTO9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(PHOTO10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(PHOTO1,GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGap(18)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(TXT1, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
						.addComponent(TXT2, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
						.addComponent(TXT3, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
						.addComponent(TXT4, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
						.addComponent(TXT5, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
						.addComponent(TXT6, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
						.addComponent(TXT7, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
						.addComponent(TXT8, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
						.addComponent(TXT9, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
						.addComponent(TXT10, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(BOUTON1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(BOUTON2, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(BOUTON3, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(BOUTON4, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(BOUTON5, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(BOUTON6, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(BOUTON7, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(BOUTON8, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(BOUTON9, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(BOUTON10, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43,
								GroupLayout.PREFERRED_SIZE))
				.addGap(38)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false).addGroup(gl_panel
								.createSequentialGroup()
								.addComponent(TXT1, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(TXT2, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(TXT3, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(TXT4, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(TXT5, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(TXT6, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(TXT7, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(TXT8, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(TXT9, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(TXT10, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
								.addGap(2)).addGroup(
										gl_panel.createSequentialGroup()
												.addComponent(PHOTO1, GroupLayout.PREFERRED_SIZE, 144,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(PHOTO2, GroupLayout.PREFERRED_SIZE, 144,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(PHOTO3, GroupLayout.PREFERRED_SIZE, 144,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(PHOTO4, GroupLayout.PREFERRED_SIZE, 144,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(PHOTO5, GroupLayout.PREFERRED_SIZE, 144,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(PHOTO6, GroupLayout.PREFERRED_SIZE, 144,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(PHOTO7, GroupLayout.PREFERRED_SIZE, 144,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(PHOTO8, GroupLayout.PREFERRED_SIZE, 144,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(PHOTO9, GroupLayout.PREFERRED_SIZE, 144,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(PHOTO10,
														GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel.createSequentialGroup().addGap(50)
								.addComponent(BOUTON1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
								.addGap(100)
								.addComponent(BOUTON2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
								.addGap(110)
								.addComponent(BOUTON3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
								.addGap(110)
								.addComponent(BOUTON4, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
								.addGap(110)
								.addComponent(BOUTON5, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
								.addGap(110)
								.addComponent(BOUTON6, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
								.addGap(110)
								.addComponent(BOUTON7, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
								.addGap(110)
								.addComponent(BOUTON8, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
								.addGap(110)
								.addComponent(BOUTON9, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
								.addGap(110)
								.addComponent(BOUTON10, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(10, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);
	}

	public JButton getBOUTON1() {
		return BOUTON1;
	}

	public void setBOUTON1(JButton bOUTON1) {
		BOUTON1 = bOUTON1;
	}

	public JButton getBOUTON2() {
		return BOUTON2;
	}

	public void setBOUTON2(JButton bOUTON2) {
		BOUTON2 = bOUTON2;
	}

	public JButton getBOUTON3() {
		return BOUTON3;
	}

	public void setBOUTON3(JButton bOUTON3) {
		BOUTON3 = bOUTON3;
	}

	public JButton getBOUTON6() {
		return BOUTON6;
	}

	public void setBOUTON6(JButton bOUTON6) {
		BOUTON6 = bOUTON6;
	}

	public JButton getBOUTON4() {
		return BOUTON4;
	}

	public void setBOUTON4(JButton bOUTON4) {
		BOUTON4 = bOUTON4;
	}

	public JButton getBOUTON5() {
		return BOUTON5;
	}

	public void setBOUTON5(JButton bOUTON5) {
		BOUTON5 = bOUTON5;
	}

	public JButton getBOUTON7() {
		return BOUTON7;
	}

	public void setBOUTON7(JButton bOUTON7) {
		BOUTON7 = bOUTON7;
	}

	public JButton getBOUTON8() {
		return BOUTON8;
	}

	public void setBOUTON8(JButton bOUTON8) {
		BOUTON8 = bOUTON8;
	}

	public JButton getBOUTON9() {
		return BOUTON9;
	}

	public void setBOUTON9(JButton bOUTON9) {
		BOUTON9 = bOUTON9;
	}

	public JButton getBOUTON10() {
		return BOUTON10;
	}

	public void setBOUTON10(JButton bOUTON10) {
		BOUTON10 = bOUTON10;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	private JScrollPane scrollPane;

	public Cafe() {
		initialize();
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}

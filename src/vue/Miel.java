package vue;

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

public class Miel{

	private JFrame frame;
	private JPanel panel;
	private JLabel PHOTO1, PHOTO2, PHOTO3, PHOTO4, PHOTO5, PHOTO6, PHOTO7, PHOTO8, PHOTO9, PHOTO10;
	private JButton BOUTON1, BOUTON2, BOUTON3, BOUTON6, BOUTON4, BOUTON5, BOUTON7, BOUTON8, BOUTON9, BOUTON10;
	private JTextPane TXT1, TXT2, TXT3, TXT4, TXT5, TXT6, TXT7, TXT8, TXT9, TXT10;
	private JScrollPane scrollthe;


	public Miel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 562, 548);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		scrollthe = new JScrollPane();
		scrollthe.setBorder(null);
		scrollthe.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollthe.setBounds(10, 11, 526, 475);
		frame.getContentPane().add(scrollthe);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(null);
		scrollthe.setViewportView(panel);

		/**
		 * 
		 * mes photos/images
		 * 
		 */

		PHOTO1 = new JLabel("");
        PHOTO1.setIcon(new ImageIcon(Cafe.class.getResource("/ressource/miel/miel-d-acacia.jpg")));

        PHOTO2 = new JLabel("");
        PHOTO2.setIcon(new ImageIcon(Cafe.class.getResource("/ressource/miel/miel-de-buplèvre.jpg")));

        PHOTO3 = new JLabel("");
        PHOTO3.setIcon(new ImageIcon(Cafe.class.getResource("/ressource/miel/miel-de-chataignier.jpg")));

        PHOTO4 = new JLabel("");
        PHOTO4.setIcon(new ImageIcon(Cafe.class.getResource("/ressource/miel/miel-de-framboisier.jpg")));

        PHOTO5 = new JLabel("");
        PHOTO5.setIcon(new ImageIcon(Cafe.class.getResource("/ressource/miel/miel-de-montagne.jpg")));

        PHOTO6 = new JLabel("");
        PHOTO6.setIcon(
                new ImageIcon(Cafe.class.getResource("/ressource/miel/miel-de-rhododendron.jpg")));

        PHOTO7 = new JLabel("");
        PHOTO7.setIcon(new ImageIcon(Cafe.class.getResource("/ressource/miel/miel-de-romarin.jpg")));

        PHOTO8 = new JLabel("");
        PHOTO8.setIcon(new ImageIcon(
                Cafe.class.getResource("/ressource/miel/miel-de-sapin.jpg")));

        PHOTO9 = new JLabel("");
        PHOTO9.setIcon(new ImageIcon(Cafe.class.getResource("/ressource/miel/miel-de-tilleul.jpg")));

        PHOTO10 = new JLabel("");
        PHOTO10.setIcon(new ImageIcon(Cafe.class.getResource("/ressource/miel/miel-de-tournesol.jpg")));

		/**
		 * des JTextePanne pour afficher les descritpions des différents produits 
		 * 
		 * 
		 */
		TXT1 = new JTextPane();
		TXT1.setEditable(false);
		TXT1.setForeground(new Color(205, 133, 63));
		TXT1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		TXT1.setText("Le Miel d'Acacia est un classique, une référence dans "
				+ "la gamme des miels. Il est toujours liquide, sa saveur est très douce et relativement neutre. Il est idéal pour "
				+ "sucrer les boissons et pour cuisiner sans marquer le goût des plats.");


		 
			TXT2 = new JTextPane();
			TXT2.setEditable(false);
			TXT2.setForeground(new Color(205, 133, 63));
			TXT2.setFont(new Font("Tahoma", Font.ITALIC, 11));
			TXT2.setText("Miel de Buplèvre, nous l'appelons Garrigue d'été, c'est plus poétique et plus facile à prononcer "
					+ "! Un miel à découvrir : "
					+ "son goût et son odeur font penser au Pain d'épices"
					+ ". Ce miel de Buplèvre peut être liquide, solide ou Crémeux selon la saison, à goûter absolument !");

		TXT4 = new JTextPane();
		TXT4.setEditable(false);
		TXT4.setForeground(new Color(205, 133, 63));
		TXT4.setFont(new Font("Tahoma", Font.ITALIC, 11));
		TXT4.setText("Miel de Framboisier\r\n"
				+ "\r\n"
				+ "Le Miel de Framboisier est récolté en Haute Montagne sur les zones de framboisiers sauvages. On ne récolte pas du"
				+ " miel de framboisier pur, il est toujours mélangé avec d'autres fleurs. Les framboisiers comme les plantes de la"
				+ " famille des ronces sont particulièrement attractives pour les abeilles.");
		
		TXT3 = new JTextPane();
		TXT3.setEditable(false);
		TXT3.setForeground(new Color(205, 133, 63));
		TXT3.setFont(new Font("Tahoma", Font.ITALIC, 11));
		TXT3.setText("Miel de Châtaignier\r\n"
				+ "\r\n"
				+ "Le Miel de châtaignier tonifiant, connaît un regain de popularité avec son goût fort et la persistance des ses "
				+ "arômes.   L'odeur est marquée, chaude et profonde dès l'ouverture du pot. Son goût fort laisse une légère "
				+ "amertume en fin de bouche. La saveur est plutôt relevée.  A noter que le goût peut être plus ou moins fort "
				+ "selon le terroir. C'est un miel qui convient parfaitement pour sucrer le café.");
		
		TXT5 = new JTextPane();
		TXT5.setEditable(false);
		TXT5.setForeground(new Color(205, 133, 63));
		TXT5.setFont(new Font("Tahoma", Font.ITALIC, 11));
		TXT5.setText("Miel de Montagne\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "(Miel Toutes Fleurs) / Printemps Merisier\r\n"
				+ "Une récolte exceptionelle à savourer sur vos tartines\r\n"
				+ "\r\n"
				+ "Le Miel de montagne toutes fleurs, porte les saveurs sauvages des Pyrénées. Sainfoin, Vesse, Tilleul, "
				+ "Rhododendron, Framboisier, Marjolaine, Trefles, Ronces, Epilobes, Chataigniers......et encore plus de "
				+ "fleurs dans la composition de ce miel très aromatique.");
		
		TXT6 = new JTextPane();
		TXT6.setEditable(false);
		TXT6.setForeground(new Color(205, 133, 63));
		TXT6.setFont(new Font("Tahoma", Font.ITALIC, 11));
		TXT6.setText("Miel de Rhododendron\r\n"
				+ "\r\n"
				+ "Le Miel de Rhododendron est une spécialité de nos Pyrénées Orientales. On le surnomme l'acacia des montagnes, "
				+ "c'est un miel clair, avec une odeur légère, subtile et délicate et une saveur très douce, fleurie, légèrement "
				+ "boisée. C'est le miel idéal pour sucrer les boissons froides ou chaudes.");
		
		TXT7 = new JTextPane();
		TXT7.setEditable(false);
		TXT7.setForeground(new Color(205, 133, 63));
		TXT7.setFont(new Font("Tahoma", Font.ITALIC, 11));
		TXT7.setText("Miel de Romarin\r\n"
				+ "\r\n"
				+ "Le Miel de Romarin est doux, léger à la saveur délicate subtile en arrière bouche. Le miel de Romarin est"
				+ " pratiquement le premier miel unifloral récolté au printemps. C'est un miel apprécié depuis longtemps, "
				+ "mieux connu autrefois sous l'appellation \"miel de Narbonne\". Il est unique en son genre, il ressemble au"
				+ " miel d'acacia par la délicatesse de ses arômes qui sont particulièrement mis en valeur lorsqu'il est "
				+ "travaillé crémeux.");
		
		TXT8 = new JTextPane();
		TXT8.setEditable(false);
		TXT8.setForeground(new Color(205, 133, 63));
		TXT8.setFont(new Font("Tahoma", Font.ITALIC, 11));
		TXT8.setText("Miel de Sapin\r\n"
				+ "\r\n"
				+ "Rare et très recherché, sa réputation n'est plus à faire !  le Miel de Sapin a une saveur douce, maltée "
				+ "sans aucune amertume avec un goût typique de noisette en arrière bouche, une odeur aromatique marquée et"
				+ " très agréable. En haut de la gamme, c'est de très loin notre préféré.");

		TXT9 = new JTextPane();
		TXT9.setEditable(false);
		TXT9.setForeground(new Color(205, 133, 63));
		TXT9.setFont(new Font("Tahoma", Font.ITALIC, 11));
		TXT9.setText("Miel de Tilleul\r\n"
				+ "\r\n"
				+ "Le Miel de Tilleul a une odeur très parfumée, une saveur très agréable, légèrement mentholée en arrière bouche."
				+ " Selon les années on trouve du miel de tilleul dans des proportions intéressantes dans le Miel de montagne "
				+ "toutes fleurs. Le miel de Tilleul peut être liquide, solide ou crémeux selon la saison.");

		TXT10 = new JTextPane();
		TXT10.setEditable(false);
		TXT10.setForeground(new Color(205, 133, 63));
		TXT10.setFont(new Font("Tahoma", Font.ITALIC, 11));
		TXT10.setText("Miel de Tournesol\r\n"
				+ "\r\n"
				+ "Le Miel de Tournesol est crémeux et onctueux, c'est le soleil du midi. Le miel de Tournesol que l'on "
				+ "appelle blond d'été en raison de sa couleur jaune vif remarquable, est un miel de culture au goût très "
				+ "particulier. Ce miel est particulièrement apprécié des enfants.\r\n"
				+ "");
		/**
		 * 
		 * Mes différents boutons
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
						.addComponent(PHOTO1))
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
	public JFrame getFrame() {
		return frame;
	}
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	public JPanel getPanel() {
		return panel;
	}
	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
	public JLabel getPHOTO1() {
		return PHOTO1;
	}
	public void setPHOTO1(JLabel pHOTO1) {
		PHOTO1 = pHOTO1;
	}
	public JLabel getPHOTO2() {
		return PHOTO2;
	}
	public void setPHOTO2(JLabel pHOTO2) {
		PHOTO2 = pHOTO2;
	}
	public JLabel getPHOTO3() {
		return PHOTO3;
	}
	public void setPHOTO3(JLabel pHOTO3) {
		PHOTO3 = pHOTO3;
	}
	public JLabel getPHOTO4() {
		return PHOTO4;
	}
	public void setPHOTO4(JLabel pHOTO4) {
		PHOTO4 = pHOTO4;
	}
	public JLabel getPHOTO5() {
		return PHOTO5;
	}
	public void setPHOTO5(JLabel pHOTO5) {
		PHOTO5 = pHOTO5;
	}
	public JLabel getPHOTO6() {
		return PHOTO6;
	}
	public void setPHOTO6(JLabel pHOTO6) {
		PHOTO6 = pHOTO6;
	}
	public JLabel getPHOTO7() {
		return PHOTO7;
	}
	public void setPHOTO7(JLabel pHOTO7) {
		PHOTO7 = pHOTO7;
	}
	public JLabel getPHOTO8() {
		return PHOTO8;
	}
	public void setPHOTO8(JLabel pHOTO8) {
		PHOTO8 = pHOTO8;
	}
	public JLabel getPHOTO9() {
		return PHOTO9;
	}
	public void setPHOTO9(JLabel pHOTO9) {
		PHOTO9 = pHOTO9;
	}
	public JLabel getPHOTO10() {
		return PHOTO10;
	}
	public void setPHOTO10(JLabel pHOTO10) {
		PHOTO10 = pHOTO10;
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
	public JTextPane getTXT1() {
		return TXT1;
	}
	public void setTXT1(JTextPane tXT1) {
		TXT1 = tXT1;
	}
	public JTextPane getTXT2() {
		return TXT2;
	}
	public void setTXT2(JTextPane tXT2) {
		TXT2 = tXT2;
	}
	public JTextPane getTXT3() {
		return TXT3;
	}
	public void setTXT3(JTextPane tXT3) {
		TXT3 = tXT3;
	}
	public JTextPane getTXT4() {
		return TXT4;
	}
	public void setTXT4(JTextPane tXT4) {
		TXT4 = tXT4;
	}
	public JTextPane getTXT5() {
		return TXT5;
	}
	public void setTXT5(JTextPane tXT5) {
		TXT5 = tXT5;
	}
	public JTextPane getTXT6() {
		return TXT6;
	}
	public void setTXT6(JTextPane tXT6) {
		TXT6 = tXT6;
	}
	public JTextPane getTXT7() {
		return TXT7;
	}
	public void setTXT7(JTextPane tXT7) {
		TXT7 = tXT7;
	}
	public JTextPane getTXT8() {
		return TXT8;
	}
	public void setTXT8(JTextPane tXT8) {
		TXT8 = tXT8;
	}
	public JTextPane getTXT9() {
		return TXT9;
	}
	public void setTXT9(JTextPane tXT9) {
		TXT9 = tXT9;
	}
	public JTextPane getTXT10() {
		return TXT10;
	}
	public void setTXT10(JTextPane tXT10) {
		TXT10 = tXT10;
	}
	public JScrollPane getScrollthe() {
		return scrollthe;
	}
	public void setScrollthe(JScrollPane scrollthe) {
		this.scrollthe = scrollthe;
	}

	
}

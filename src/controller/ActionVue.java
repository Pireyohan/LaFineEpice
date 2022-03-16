package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.AdminDAO;
import model.Admin;
import model.Client;
import model.ProduitPanier;
import model.ValidationComande;
import vue.Acceuil;
import vue.Cafe;
import vue.ConnAdmin;
import vue.Connexion;
import vue.PageProduit;
import vue.Pannier;
import vue.Tea;
import vue.AdminProduits_Clients;
import model.PannierDAO;

/*
 * CtrlActionVue est la classe principale d'une point de vue Contoler
 * On y importe nos diff�rentes vues , arrays n�cessaires. 
 */
public class ActionVue implements ActionListener {
	AdminProduits_Clients AProdCli;
	PageProduit hom;
	Connexion fcon;
	AdminDAO adminDAO;
	PannierDAO panDAO;
	Acceuil acceuil;
	Pannier panier;
	ValidationComande validationComm;
	Tea tea;
	Cafe cafe;
	ConnAdmin connAdmin;
	int idcli;
	private ArrayList<Client> arraysCli = null;
	private ArrayList<ProduitPanier> arrayPanier = null;
	private ArrayList<Admin> user = null;

	@SuppressWarnings("unchecked")
	public ActionVue(Acceuil acce, ConnAdmin ConnAdmi, PageProduit hom, Cafe cafe, Tea tea, Pannier Panier,
			AdminProduits_Clients mana, Connexion Fcon) {
		// Vues
		
		this.AProdCli = mana;
		this.acceuil = acce;
		this.cafe = cafe;
		this.tea = tea;
		this.hom = hom;
		this.panier = Panier;
		this.fcon = Fcon;
		this.connAdmin = ConnAdmi;
		// New Object
		adminDAO = new AdminDAO();
		panDAO = new PannierDAO();
		user = adminDAO.ConnexionAdmin();
		arraysCli = adminDAO.affichAdminCli();
		arrayPanier = panDAO.affichPan();
		// Affichage Liste, ici ListProduit
		panier.getListProduit().setListData(arrayPanier.toArray());
		totalPan();
		initControl();
	}

	/*
	 * Regroupement des diff�rentes actions dans l'initcontrol, Connection ,
	 * Selection de produit , Suppression , Fermer le programme
	 */
	public void initControl() {

		// Action de la vue d'entr�e avec bouton ferm�e, bouton entr�e sans compte,
		// bouton acc�s admin ,acces suivant
		acceuil.getTesteExit().addActionListener(ActionEvent -> exitSystem());
		acceuil.getBtnEntre().addActionListener(ActionEvent -> mouseEntrer());
		acceuil.getBtnadmin().addActionListener(ActionEvent -> btnAdmin());
		acceuil.getBtnConnex().addActionListener(ActionEvent -> affichePan());

		// Action de la vue page produit avec un bouton connection et bouton panier
		hom.getBtnPanier().addActionListener(ActionEvent -> actionPerformed2());
		hom.getBtnConection().addActionListener(ActionEvent -> affichePan());

		// Action de la vue Connexion pour cr�er un nouveau client via le formulaire
		fcon.getBtnNewcli().addActionListener(ActionEvent -> affichAddcli());
		fcon.getCroix().addActionListener(ActionEvent -> hideCon());
		fcon.getCroix_1().addActionListener(ActionEvent -> hideCon());
		fcon.getBtnConnexion().addActionListener(ActionEvent -> accesClient());

		// Action sur la vue Connection Admin pour se connecter
		connAdmin.getBtnNewButton().addActionListener(ActionEvent -> accesAdmin());
		// Action sur la vue Panier pour valider, supprimer , selectionner un produit
		// dans le panier .....
		panier.getBtnValidation().addActionListener(ActionEvent -> valiPan());
		panier.getBtnsup().addActionListener(ActionEvent -> supProdPan());
		panier.getListProduit().addListSelectionListener(ListeSelectionEvent -> selectProduit());
		panier.getCroix().addActionListener(ListeSelectionEvent -> hidePan());
	}

	/*
	 * Permet de sortir du systeme simplement. Appel� dans l'init Control
	 */
	public void exitSystem() {

		System.exit(0);

	}

	/*
	 * Rend visible la vue Connection admin avec l'action sur le bouton admin
	 */
	public void btnAdmin() {

		connAdmin.getFrame().setVisible(true);

	}

	/*
	 * Fonction de suppression de produits dans le pannier en cours , Permet de
	 * supprimer la panier et r�afficher un panier vide
	 */

	@SuppressWarnings("unchecked")
	public void supProdPan() {
		panDAO.clearpan();
		panier.getTxtTotal().setText(" ");
		arrayPanier = panDAO.affichPan();
		panier.getListProduit().setListData(arrayPanier.toArray());

	}

	/*
	 * Fonction accesAdmin qui permet de checker l'�quivalent entre ceux qui est
	 * tap� au clavier et la base de donn�e.
	 */
	public void accesAdmin() {

		String NomUser = connAdmin.getIduser().getText();
		String MdpUser = connAdmin.getMdp().getText();

		for (int i = 0; i < user.size(); i++) {

			Admin AUM = user.get(i);

			String IdUser = AUM.getPseudo();
			String Mdp = AUM.getMdpUser();

			if (NomUser.equals(IdUser)) {

				if (MdpUser.equals(Mdp)) {
					JOptionPane.showMessageDialog(null, "Access Admin OK  !", "Welcome to manager",
							JOptionPane.INFORMATION_MESSAGE);

					connAdmin.getFrame().setVisible(false);
					AProdCli.getFrame().setVisible(true);
					break;
				}

			}
			while (i >= arraysCli.size() - 1) {
				JOptionPane.showMessageDialog(null, "les Mots de passe ou email inconnu", "Oups ",
						JOptionPane.ERROR_MESSAGE);
				break;

			}
		}

	}
	/*
	 * Fonction accesClient qui permet de checker l'�quivalent entre ceux qui est
	 * tap� au clavier et la base de donn�e.
	 */

	public void accesClient() {
		// on va chercher la fonction affichAdminCli qui est une arraylist pour recuperer les diff�rentes pseudos 
		arraysCli = adminDAO.affichAdminCli();

		int i;
		// on recupere les deux variables  Email et Mdp 
		String mailCon = fcon.getTextId().getText();
		@SuppressWarnings("deprecation")
		String mdpCon = fcon.getTextMdp().getText(); // Le getText est barr� pour son non affichage visuel lors de la saisie
		
		//avec une boucle for on vient parcourir la taille de notre array pour venir faire un equals sur chaque partie check�e
		for (i = 0; i < arraysCli.size(); i++) {

			Client mc = arraysCli.get(i);
			String mail = mc.getEmail();
			String mdp = mc.getMdp();
			idcli = mc.getId();

			if (mail.equals(mailCon)) {

				if (mdpCon.equals(mdp)) {
					JOptionPane.showMessageDialog(null, "Bienvenue chez Fine Epice !", "Welcome",
							JOptionPane.INFORMATION_MESSAGE);
					fcon.getTextMdp().setText(" ");
					fcon.getTextId().setText(" ");
					mouseEntrer();
					break;
				}

			}
			// tant que la comparaison des deux  ne sont pas Ok  un pop up avec message d'erreur s'affiche
			while (i >= arraysCli.size() - 1) {
				JOptionPane.showMessageDialog(null, "Mot de passe et Email inconnu", "Oups ",
						JOptionPane.ERROR_MESSAGE);
				break;

			}

		}

	}
     /***************************************************MANIPULATION DES VUES*****************************************/
	
	public void mouseEntrer() {

		hom.getFrame().setVisible(true);
		acceuil.getFrame().setVisible(false);

	}

	public void actionPerformed() {

		hom.getPanelcaf�().setVisible(true);
		hom.getPanelEpice().setVisible(false);
		hom.getPanelmiel().setVisible(false);
		hom.getPanelmiel().setVisible(false);

	}

	private void hidePan() {
		panier.getFrame().setVisible(false);

	}

	public void actionPerformed2() {

		panier.getFrame().setVisible(true);
	}

	public void affichePan() {
		fcon.getCoFrame().setVisible(true);

	}

	public void affichAddcli() {
		fcon.getPanel().setVisible(false);
		fcon.getPanAddCli().setVisible(true);

	}

	public void hideCon() {
		fcon.getPanAddCli().setVisible(false);
		fcon.getPanel().setVisible(true);
		fcon.getCoFrame().setVisible(false);

	}
	/******************************************PARTIE FONCTION VIA LE PANNIER************************************************************/
    /*
     * Fonction validation d'ajout commande  en r�cup�rant la valeure du panier et mise en BDD
     */
	public void valiAddComm() {

		int idcli2 = idcli;
		String total = panier.getTxtTotal().getText();
		double i;

		i = Double.parseDouble(total);

		validationComm = new ValidationComande();
		validationComm.setNumComCli(idcli2);
		validationComm.setMontantCom(i);

		panDAO.ValidationPanComm(validationComm);

	}
   /*
    * Fonction total Pan qui permet en parcourant l'array du panier, la somme des articles pour afficher celle-ci sans la vue panier
    */
	public void totalPan() {

		double total = 0;
		double addi = 0;
		double qtetto;
		int qt = 0;

		for (int i = 0; i < arrayPanier.size(); i++) {

			ProduitPanier ModPropan = arrayPanier.get(i);

			addi = ModPropan.getPrix();
			qt = ModPropan.getQt();
			qtetto = addi * qt;

			total = total + qtetto;

		}
		String totalS = Double.toString(total);
		panier.getTxtTotal().setText(totalS);

	}
    /*
     *  Fonction valiPan  check dans un premier temps si vous �tes clients ou non .Lorsque vous voulez valider votre panier 
     *   Il vous pr�vient via un popup message soit pour vous connectez ou non. 
     *   
     */
	public void valiPan() {
		if (idcli == 0) {

			JOptionPane.showMessageDialog(null, "Connecte toi � ton compte client pour commander !",
					"encore quelques clics !", JOptionPane.INFORMATION_MESSAGE);

		} else if (idcli != 0) {

			JOptionPane.showMessageDialog(null, "Commande effectu�e", "Merci d'avoir command� chez nous !",
					JOptionPane.PLAIN_MESSAGE);
			
			arrayPanier = panDAO.affichPan();

			panDAO.validationPan(arrayPanier);
			panDAO.clearpan();

			valiAddComm();

			panier.getTxtTotal().setText(" ");
			arrayPanier = panDAO.affichPan();
			panier.getListProduit().setListData(arrayPanier.toArray());

		}
	}
	
   /*
    * Permet de selectionner un produit 
    */
	private void selectProduit() {

		int libelle = panier.getListProduit().getSelectedIndex();
		if (libelle == -1)
			return;
		arrayPanier = panDAO.affichPan();
		panier.getListProduit().setListData(arrayPanier.toArray());
		ProduitPanier model2 = (ProduitPanier) arrayPanier.get(libelle);

		int Qt = model2.getQt();

		String i;
		i = Integer.toString(Qt);

		panier.getTextField().setText(i);
		panier.getTextlibellehide().setText(model2.getLibelle());

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}

package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.AdminDAO;
import model.Client;
import model.Produit;
import vue.Connexion;
import vue.AdminProduits_Clients;

public class Admin {
	// Décla Model
	private Client moCli;
	private Produit modProd;
	private AdminDAO adminDAO;
	// Décla Vue
	private AdminProduits_Clients vueAdminProd;
	private Connexion vueCon;
	// Décla Array
	private ArrayList<Client> arraysCli = null;
	private ArrayList<Produit> arraysProd = null;

	
	public Admin(AdminProduits_Clients vueAdminProdClient, Connexion vueCon) {
		
		this.vueAdminProd = vueAdminProdClient;
		// on importe cette vue en paramètre pour pouvoir utiliser la méthode d'ajouté client qu'on a déjà écrit pour admin client/produit
		this.vueCon = vueCon;
		
		adminDAO = new AdminDAO();
		arraysProd = adminDAO.affichAdmin();
		arraysCli = adminDAO.affichAdminCli();
		vueAdminProd.getList().setListData(arraysProd.toArray());
		vueAdminProd.getListclient().setListData(arraysCli.toArray());
		initController();

	}


	public void initController() {

		vueAdminProd.getBtnAjouter().addActionListener(ActionEvent -> ajoutProd());
		vueAdminProd.getList().addListSelectionListener(ListeSelectionEvent -> selectProduit());
		vueAdminProd.getBtnSupprimer().addActionListener(ActionEvent -> suppProd());
		vueAdminProd.getBtnModifier().addActionListener(ActionEvent -> modifiProd());
		vueAdminProd.getListclient().addListSelectionListener(ListeSelectionEvent -> selectClient());
		vueAdminProd.getBtnAjouterCli().addActionListener(ActionEvent -> ajouterClient());
		vueCon.getBtnBienvenuChezNous().addActionListener(ActionEvent -> ajoutClientVueCon());

	}

	/***********************  Partie controller admin produit *****************************/
	
	public void ajoutProd() {

		String libel = vueAdminProd.getTextLibel().getText();
		String Qt = vueAdminProd.getTextQt().getText();
		String Cate = vueAdminProd.getTextcate().getText();
		String prix = vueAdminProd.getTextPrix().getText();

		int i;
		i = Integer.parseInt(Qt);
		int b;
		b = Integer.parseInt(Cate);
		float p;
		p = Float.parseFloat(prix);

		modProd = new Produit();
		modProd.setLibelle(libel);
		modProd.setQt(i);
		modProd.setCategorie(b);
		modProd.setPrix(p);

		adminDAO.ajoutProduit(modProd);
		arraysProd = adminDAO.affichAdmin();
		vueAdminProd.getList().setListData(arraysProd.toArray());

	}

	private void selectProduit() {

		int libel = vueAdminProd.getList().getSelectedIndex();
		if (libel == -1)
			return;
		Produit model2 = (Produit) arraysProd.get(libel);

		int Qt = model2.getQt();
		int Cate = model2.getCategorie();
		float prix = model2.getPrix();
		int Id = model2.getId();

		String b;
		b = String.valueOf(prix);
		String c;
		c = Integer.toString(Cate);
		String i;
		i = Integer.toString(Qt);
		String a;
		a = Integer.toString(Id);

		vueAdminProd.getTextLibel().setText(model2.getLibelle());
		vueAdminProd.getTextPrix().setText(b);
		vueAdminProd.getTextQt().setText(i);
		vueAdminProd.getTextcate().setText(c);
		vueAdminProd.getTextID().setText(a);
	}

	
	private void suppProd() {
		int numP = vueAdminProd.getList().getSelectedIndex();
		if (numP == -1)
			return;
		Produit model3 = (Produit) arraysProd.get(numP);
		// int contactId = model.getId();
		adminDAO.suprimProd(model3.getId());
		arraysProd = adminDAO.affichAdmin();
		vueAdminProd.getList().setListData(arraysProd.toArray());
	}


	private void modifiProd() {

		String Libel = vueAdminProd.getTextLibel().getText();
		String Qt = vueAdminProd.getTextQt().getText();
		String Cate = vueAdminProd.getTextcate().getText();
		String prix = vueAdminProd.getTextPrix().getText();
		String id = vueAdminProd.getTextID().getText();

		int i;
		i = Integer.parseInt(Qt);
		int b;
		b = Integer.parseInt(Cate);
		float p;
		p = Float.parseFloat(prix);
		int a;
		a = Integer.parseInt(id);

		for (Produit modele : arraysProd) {
			if (modele.getId() == a) {

				modele.setLibelle(Libel);
				modele.setQt(i);
				modele.setCategorie(b);
				modele.setPrix(p);
				vueAdminProd.getList().setListData(arraysProd.toArray());
				adminDAO.modifProd(modele);
			}

		}

	}

	/****************************** Partie admin client	 ***********************************************/
	private void selectClient() {

		int cli = vueAdminProd.getListclient().getSelectedIndex();
		if (cli == -1)
			return;
		Client model4 = (Client) arraysCli.get(cli);

		int id = model4.getId();
		int cp = model4.getCp();

		String i;
		i = Integer.toString(cp);
		String b;
		b = Integer.toString(id);

		vueAdminProd.getTextnom().setText(model4.getNom());
		vueAdminProd.getTextPrenom().setText(model4.getPrenom());
		vueAdminProd.getTextAdresse().setText(model4.getAdresse());
		vueAdminProd.getTextCp().setText(i);
		vueAdminProd.getTextVille().setText(model4.getVille());
		vueAdminProd.getTextMail().setText(model4.getEmail());
		vueAdminProd.getTextMdp().setText(model4.getMdp());
		vueAdminProd.getTextTel().setText(model4.getTel());

	}

	public void ajouterClient() {
// recuperation des infos tout est en string je vais devoir changer le CP en int
		String nom = vueAdminProd.getTextnom().getText();
		String prenom = vueAdminProd.getTextPrenom().getText();
		String adr = vueAdminProd.getTextAdresse().getText();
		String cp = vueAdminProd.getTextCp().getText();
		String ville = vueAdminProd.getTextVille().getText();
		String email = vueAdminProd.getTextMail().getText();
		String mdp = vueAdminProd.getTextMdp().getText();
		String tel = vueAdminProd.getTextTel().getText();

		int i;
		i = Integer.parseInt(cp);
// ajout du client
		moCli = new Client();
		moCli.setNom(nom);
		moCli.setPrenom(prenom);
		moCli.setAdresse(adr);
		moCli.setCp(i);
		moCli.setVille(ville);
		moCli.setEmail(email);
		moCli.setMdp(mdp);
		moCli.setTel(tel);

		adminDAO.ajoutClient(moCli);
		arraysCli = adminDAO.affichAdminCli();
		vueAdminProd.getListclient().setListData(arraysCli.toArray());

	}

	public void ajoutClientVueCon() {
// recuperation des infos tout est en string je vais devoir changer le CP en int
		String nom = vueCon.getTextAddNom().getText();
		String prenom = vueCon.getTextaddPrenom().getText();
		String adr = vueCon.getTextaddAdresse().getText();
		String cp = vueCon.getTextAddCp().getText();
		String ville = vueCon.getTextVille().getText();
		String email = vueCon.getTextAddMail().getText();
		String mdp = vueCon.getTextAddMdp().getText();
		String mdpconf = vueCon.getTextTextConMdp().getText();
		String tel = vueCon.getTextAddTel().getText();

		int i;
		i = Integer.parseInt(cp);

		// condition conparaison MdP

		if (mdp.equals(mdpconf)) {

			JOptionPane.showMessageDialog(null, "Bienvenue chez nous et bon shopping !", "Welcome",
					JOptionPane.INFORMATION_MESSAGE);
			// ajout du client
			moCli = new Client();
			moCli.setNom(nom);
			moCli.setPrenom(prenom);
			moCli.setAdresse(adr);
			moCli.setCp(i);
			moCli.setVille(ville);
			moCli.setEmail(email);
			moCli.setMdp(mdp);
			moCli.setTel(tel);
			adminDAO.ajoutClient(moCli);

			// remise a zero du fomulaire d'inscription
			vueCon.getCoFrame().setVisible(true);
			vueCon.getPanAddCli().setVisible(false);
			vueCon.getPanel().setVisible(true);

			vueCon.getTextAddNom().setText(" ");
			vueCon.getTextaddPrenom().setText(" ");
			vueCon.getTextaddAdresse().setText(" ");
			vueCon.getTextAddCp().setText(" ");
			vueCon.getTextVille().setText(" ");
			vueCon.getTextAddMail().setText(" ");
			vueCon.getTextAddMdp().setText(" ");
			vueCon.getTextTextConMdp().setText(" ");
			vueCon.getTextAddTel().setText(" ");

			arraysCli = adminDAO.affichAdminCli();
			vueAdminProd.getListclient().setListData(arraysCli.toArray());

		}

		else {
			// condition si mdp pas identique
			System.out.println(mdp);
			System.out.println(mdpconf);
			JOptionPane.showMessageDialog(null, "les Mots de passe sont differents !", "Oups ",
					JOptionPane.ERROR_MESSAGE);

		}

	}
}

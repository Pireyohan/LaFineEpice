package controller;

import java.util.ArrayList;

import model.ProduitPanier;
import vue.Cafe;
import vue.PageProduit;
import vue.Pannier;
import model.PannierDAO;

public class AddCafe {
	// On appelle toutes les chose dont on a besoin ... PannierDao, Pannier , cafe

	PageProduit pageProduit;
	private PannierDAO pan;
	private Pannier panVue;
	private Cafe cafe;
	private ProduitPanier propann;
	private ArrayList<ProduitPanier> arrayPannier = null;

	String bt1Libelll;
	float bT1Prinx;
	int btnQt;

	/*
	 * Dans notre AddCafe , on prendre notre vue cafe, pageproduit et pannier. On
	 * crée un nouveau pannierDAO
	 */
	public AddCafe(Pannier panVue, PageProduit pageProduit, Cafe cafe) {
		this.cafe = cafe;
		this.panVue = panVue;
		this.pageProduit = pageProduit;
		pan = new PannierDAO();
		// on prend notre affichPan de notre model d'Array Produit panier de PannierDAO
		// qu'on vient mettre dans notre arrayPannier ici
		arrayPannier = pan.affichPan();
		// Notre fonction total Pannier pour calculer son total côté café en prenant son
		// total + la quantité rajouté
		totalPan();
		// affichage de la liste produit
		panVue.getListProduit().setListData(arrayPannier.toArray());
		// Action controller
		initController();

	}

	/*
	 * dans la vue cafe le bouton 1 ajoute bien le Café San Igniacio de la base de
	 * donnée dans le pannier via un to String le bouton 2 ajoute bien le Café
	 * NaturalEstate de la base de donnée etc...... jusque 10.
	 */
	public void initController() {

		cafe.getBOUTON1().addActionListener(ActionEvent -> addsanIgnia());
		cafe.getBOUTON2().addActionListener(ActionEvent -> addCNaturalEstate());
		cafe.getBOUTON3().addActionListener(ActionEvent -> addCBioTop());
		cafe.getBOUTON4().addActionListener(ActionEvent -> addCBlkExp());
		cafe.getBOUTON5().addActionListener(ActionEvent -> addCCafeinoBlend());
		cafe.getBOUTON6().addActionListener(ActionEvent -> addficacolomb());
		cafe.getBOUTON7().addActionListener(ActionEvent -> addDecafeina());
		cafe.getBOUTON8().addActionListener(ActionEvent -> addCMokaGanoji());
		cafe.getBOUTON9().addActionListener(ActionEvent -> addCeibos());
		cafe.getBOUTON10().addActionListener(ActionEvent -> addMarcala());

	}
	/*
	 * Fonction sur total pannier Parcours le array pannier on y mulitplie la
	 * quantité getter et on la multiplie au prix produit puis on set celle ci pour l'afficher dans la vue pannier 
	 */

	public void totalPan() {

		double Total = 0;
		double addi = 0;
		double qtetto;
		int Qt = 0;

		for (int i = 0; i < arrayPannier.size(); i++) {

			ProduitPanier ModPropan = arrayPannier.get(i);

			addi = ModPropan.getPrix();
			Qt = ModPropan.getQt();
			qtetto = addi * Qt;

			Total = Total + qtetto;

		}

		String TotalS = Double.toString(Total);
		panVue.getTxtTotal().setText(TotalS);

	}
	/*
	 * Ajout du café Bio Top  avec son libellé , son prix et sa quantité on crée un object produit pannier et on check si doublon ou non lors
	 * d'un ajout similaire 
	 */

	public void addCBioTop() {

		bt1Libelll = "Cafe Bio Top";
		bT1Prinx = 3.65F;
		btnQt = 1;
		propann = new ProduitPanier();
		verifDoublon();

	}

	public void addCMokaGanoji() {

		bt1Libelll = "Cafe Moka Ganoji";
		bT1Prinx = 3.99F;
		btnQt = 1;
		propann = new ProduitPanier();
		verifDoublon();
	}

	public void addCNaturalEstate() {

		bt1Libelll = "Cafe Natural Estate";
		bT1Prinx = 4.99F;
		btnQt = 1;
		propann = new ProduitPanier();
		verifDoublon();

	}

	public void addsanIgnia() {

		bt1Libelll = "Cafe San Ignacio";
		bT1Prinx = 3.65F;
		btnQt = 1;
		propann = new ProduitPanier();
		verifDoublon();

	}

	public void addCBlkExp() {

		bt1Libelll = "Cafe Black Expresso";
		bT1Prinx = 2.95F;
		btnQt = 1;
		propann = new ProduitPanier();
		verifDoublon();

	}

	public void addCCafeinoBlend() {

		bt1Libelll = "Cafe Cafeino Blend";
		bT1Prinx = 1.95F;
		btnQt = 1;
		propann = new ProduitPanier();
		verifDoublon();

	}

	public void addDecafeina() {

		bt1Libelll = "Cafe Decafeinato";
		bT1Prinx = 2.95F;
		btnQt = 1;
		propann = new ProduitPanier();
		verifDoublon();
	}

	public void addCeibos() {

		bt1Libelll = "Cafe Los Ceibos ";
		bT1Prinx = 2.95F;
		btnQt = 1;
		propann = new ProduitPanier();
		verifDoublon();
	}

	public void addMarcala() {

		bt1Libelll = "Cafe Marcala Honduras";
		bT1Prinx = 2.95F;
		btnQt = 1;
		propann = new ProduitPanier();
		verifDoublon();

	}

	public void addficacolomb() {

		bt1Libelll = "Cafe Finca potosi Colombie";
		bT1Prinx = 2.95F;
		btnQt = 1;
		propann = new ProduitPanier();
		verifDoublon();
	}
/*
 * Fonction veriDoublon , celle ci permet de checker que deux produits similaires ne s'ajoutent pas à la suite 
 * l'un de l'autre .
 */
	public void verifDoublon() {

		int i;
		for (i = 0; i < arrayPannier.size(); i++) {

			ProduitPanier ModPropan = arrayPannier.get(i);

			String libel = ModPropan.getLibelle();
		

			if (bt1Libelll.equals(libel)) {

				int Qt = ModPropan.getQt();
				int nQt = Qt + 1;

				propann.setLibelle(bt1Libelll);
				propann.setPrix(bT1Prinx);
				propann.setQt(nQt);

				pan.plusUnProdpan(propann);
				arrayPannier = pan.affichPan();
				panVue.getListProduit().setListData(arrayPannier.toArray());
				totalPan();

				break;

			}

		}

		while (i >= arrayPannier.size() || arrayPannier.size() == 0) {

			propann.setLibelle(bt1Libelll);
			propann.setPrix(bT1Prinx);
			propann.setQt(btnQt);
			pan.ajoutProdPan(propann);
			arrayPannier = pan.affichPan();
			totalPan();
			panVue.getListProduit().setListData(arrayPannier.toArray());

			break;

		}

	}

}
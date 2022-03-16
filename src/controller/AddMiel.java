package controller;

import java.util.ArrayList;

import model.ProduitPanier;
import vue.Miel;
import vue.PageProduit;
import vue.Pannier;
import model.PannierDAO;
/*
 * Pour plus d'explications sur AddMiel veuillez vous référer à AddCafe svp , c'est la même technique utilisée pour les différentes rurbriques
 */
public class AddMiel {

	PageProduit pageProduit;
	private PannierDAO pan;
	private Pannier panVue;
	private Miel mil;

	String bt1Libelll;
	float bT1Prinx;
	int btnQt;

	private ProduitPanier mpp;
	private ArrayList<ProduitPanier> arrayPannier = null;

	public AddMiel(Pannier panVue, PageProduit pageProduit, Miel mil) {
		this.mil = mil;
		this.panVue = panVue;
		this.pageProduit = pageProduit;
		pan = new PannierDAO();
		arrayPannier = pan.affichPan();
		totalPan();
		panVue.getListProduit().setListData(arrayPannier.toArray());

		initController();

	}

	public void initController() {

		mil.getBOUTON1().addActionListener(ActionEvent -> addMBAcacia());
		mil.getBOUTON2().addActionListener(ActionEvent -> addMDBulp());
		mil.getBOUTON3().addActionListener(ActionEvent -> addMdChatai());
		mil.getBOUTON4().addActionListener(ActionEvent -> addMdFramb());
		mil.getBOUTON5().addActionListener(ActionEvent -> addMdMont());
		mil.getBOUTON6().addActionListener(ActionEvent -> addMdRho());
		mil.getBOUTON7().addActionListener(ActionEvent -> addMdRoma());
		mil.getBOUTON8().addActionListener(ActionEvent -> addMdSapin());
		mil.getBOUTON9().addActionListener(ActionEvent -> addMdTilleul());
		mil.getBOUTON10().addActionListener(ActionEvent -> addMdTourn());

	}

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
			System.out.println(qtetto);

			Total = Total + qtetto;
			System.out.println(Total);
		}

		String TotalS = Double.toString(Total);
		panVue.getTxtTotal().setText(TotalS);

	}

	public void addMBAcacia() {

		bt1Libelll = "Miel Bona Acacia";
		bT1Prinx = 3.90F;
		btnQt = 1;
		mpp = new ProduitPanier();
		verifDoublon();
	}

	public void addMDBulp() {

		bt1Libelll = "Miel de Buplevre";
		bT1Prinx = 2.95F;
		btnQt = 1;
		mpp = new ProduitPanier();
		verifDoublon();

	}

	public void addMdChatai() {

		bt1Libelll = "Miel de Chataignier";
		bT1Prinx = 3.95F;
		btnQt = 1;
		mpp = new ProduitPanier();
		verifDoublon();
	}

	public void addMdFramb() {

		bt1Libelll = "Miel de Framboisier";
		bT1Prinx = 4.20F;
		btnQt = 1;
		mpp = new ProduitPanier();
		verifDoublon();

	}

	public void addMdMont() {

		bt1Libelll = "Miel de Montagne";
		bT1Prinx = 2.96F;
		btnQt = 1;
		mpp = new ProduitPanier();
		verifDoublon();

	}

	public void addMdRho() {

		bt1Libelll = "Miel de Rhododendron";
		bT1Prinx = 2.94F;
		btnQt = 1;
		mpp = new ProduitPanier();
		verifDoublon();

	}

	public void addMdRoma() {

		bt1Libelll = "Miel de Romarin";
		bT1Prinx = 4.20F;
		btnQt = 1;
		mpp = new ProduitPanier();
		verifDoublon();

	}

	public void addMdSapin() {

		bt1Libelll = "Miel de Sapin";
		bT1Prinx = 3.32F;
		btnQt = 1;
		mpp = new ProduitPanier();
		verifDoublon();

	}

	public void addMdTilleul() {

		bt1Libelll = "Miel de Tilleul";
		bT1Prinx = 4.20F;
		btnQt = 1;
		mpp = new ProduitPanier();
		verifDoublon();

	}

	public void addMdTourn() {

		bt1Libelll = "Miel de Tournesol";
		bT1Prinx = 5.22F;
		btnQt = 1;
		mpp = new ProduitPanier();
		verifDoublon();

	}

	public void verifDoublon() {

		int i;
		for (i = 0; i < arrayPannier.size(); i++) {

			ProduitPanier ModPropan = arrayPannier.get(i);

			String libel = ModPropan.getLibelle();

			if (bt1Libelll.equals(libel)) {

				int Qt = ModPropan.getQt();
				int nQt = Qt + 1;

				System.out.println(nQt);

				mpp.setLibelle(bt1Libelll);
				mpp.setPrix(bT1Prinx);
				mpp.setQt(nQt);

				pan.plusUnProdpan(mpp);
				arrayPannier = pan.affichPan();
				panVue.getListProduit().setListData(arrayPannier.toArray());
				totalPan();

				break;

			}

		}

		while (i >= arrayPannier.size() || arrayPannier.size() == 0) {

			mpp.setLibelle(bt1Libelll);
			mpp.setPrix(bT1Prinx);
			mpp.setQt(btnQt);
			pan.ajoutProdPan(mpp);
			arrayPannier = pan.affichPan();
			totalPan();
			panVue.getListProduit().setListData(arrayPannier.toArray());

			break;

		}

	}
}

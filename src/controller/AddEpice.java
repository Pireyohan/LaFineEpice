package controller;


import java.util.ArrayList;

import model.ProduitPanier;
import vue.Epice;
import vue.PageProduit;
import vue.Pannier;
import model.PannierDAO;
/*
 * Pour plus d'explications sur AddEpice veuillez vous référer à AddCafe svp , c'est la même technique utilisée pour les différentes rurbriques
 */
public class AddEpice {

	PageProduit pageProduit;
	private PannierDAO pan;
	private Pannier panVue;
	private Epice epice;

	String bt1Libelll;
	float bT1Prinx;
	int btnQt;

	private ProduitPanier mpp;
	private ArrayList<ProduitPanier> arrayPannier = null;

	public AddEpice(Pannier panVue, PageProduit pageProduit, Epice epice) {

		this.epice = epice;
		this.panVue = panVue;
		this.pageProduit = pageProduit;
		pan = new PannierDAO();
		arrayPannier = pan.affichPan();
		totalPan();
		panVue.getListProduit().setListData(arrayPannier.toArray());

		initController();

	}

	public void initController() {

		epice.getBOUTON1().addActionListener(ActionEvent -> addEplancha());
		epice.getBOUTON2().addActionListener(ActionEvent -> addGSesame());
		epice.getBOUTON3().addActionListener(ActionEvent -> addMEGrillees());
		epice.getBOUTON4().addActionListener(ActionEvent -> addMProvin());
		epice.getBOUTON5().addActionListener(ActionEvent -> addMPoisson());
		epice.getBOUTON6().addActionListener(ActionEvent -> addPapriFort());
		epice.getBOUTON7().addActionListener(ActionEvent -> addPapri());
		epice.getBOUTON8().addActionListener(ActionEvent -> addPimentAncho());
		epice.getBOUTON9().addActionListener(ActionEvent -> addPimentCAnges());
		epice.getBOUTON10().addActionListener(ActionEvent -> addPimentChi());

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

			Total = Total + qtetto;

		}

		String TotalS = Double.toString(Total);
		panVue.getTxtTotal().setText(TotalS);

	}

	public void addEplancha() {

		bt1Libelll = "Melange epice plancha";
		bT1Prinx = 2.62F;
		btnQt = 1;
		mpp = new ProduitPanier();
		verifDoublon();

	}

	public void addGSesame() {

		bt1Libelll = "Graine de sesame au wasabi";
		bT1Prinx = 10.95F;
		btnQt = 1;
		mpp = new ProduitPanier();
		verifDoublon();

	}

	public void addMEGrillees() {

		bt1Libelll = "Melange depices grillees";
		bT1Prinx = 2.96F;
		btnQt = 1;
		mpp = new ProduitPanier();
		verifDoublon();

	}

	public void addMProvin() {

		bt1Libelll = "Melange provençal";
		bT1Prinx = 3.25F;
		btnQt = 1;
		mpp = new ProduitPanier();
		verifDoublon();

	}

	public void addMPoisson() {

		bt1Libelll = "Melange special poisson";
		bT1Prinx = 5.20F;
		btnQt = 1;
		mpp = new ProduitPanier();
		verifDoublon();

	}

	public void addPapriFort() {

		bt1Libelll = "Paprika fort fume";
		bT1Prinx = 4.15F;
		btnQt = 1;
		mpp = new ProduitPanier();
		verifDoublon();

	}

	public void addPapri() {

		bt1Libelll = "Paprika fume";
		bT1Prinx = 3.12F;
		btnQt = 1;
		mpp = new ProduitPanier();
		verifDoublon();

	}

	public void addPimentAncho() {

		bt1Libelll = "Piment Ancho";
		bT1Prinx = 3.85F;
		btnQt = 1;
		mpp = new ProduitPanier();
		verifDoublon();

	}

	public void addPimentCAnges() {

		bt1Libelll = "Piment cheveux danges";
		bT1Prinx = 2.95F;
		btnQt = 1;
		mpp = new ProduitPanier();
		verifDoublon();

	}

	public void addPimentChi() {

		bt1Libelll = "Piment Chipotle";
		bT1Prinx = 6.95F;
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

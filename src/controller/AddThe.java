package controller;

import java.util.ArrayList;

import model.ProduitPanier;
import vue.PageProduit;
import vue.Pannier;
import vue.Tea;
import model.PannierDAO;
/*
 * Pour plus d'explications sur AddThe veuillez vous référer à AddCafe svp , c'est la même technique utilisée pour les différentes rubriques
 */
public class AddThe {

	PageProduit pageProduit;
	private PannierDAO pan;
	private Pannier panVue;
	private Tea tea;

	String Bt1Libelll;
	float BT1Prinx;
	int btnQt;

	private ProduitPanier Mpp;
	private ArrayList<ProduitPanier> ArrayPannier = null;

	public AddThe(Pannier panVue, PageProduit pageProduit, Tea tea) {

		this.tea = tea;
		this.panVue = panVue;
		this.pageProduit = pageProduit;

		pan = new PannierDAO();
		ArrayPannier = pan.affichPan();
		TotalPan();
		panVue.getListProduit().setListData(ArrayPannier.toArray());

		initController();

	}

	public void initController() {

		tea.getBOUTON1().addActionListener(ActionEvent -> addTLouvre());
		tea.getBOUTON2().addActionListener(ActionEvent -> addMVerde());
		tea.getBOUTON3().addActionListener(ActionEvent -> addGYImpe());
		tea.getBOUTON4().addActionListener(ActionEvent -> addOsmDor());
		tea.getBOUTON5().addActionListener(ActionEvent -> addTNBio());
		tea.getBOUTON6().addActionListener(ActionEvent -> addTDtresors());
		tea.getBOUTON7().addActionListener(ActionEvent -> addTGMidori());
		tea.getBOUTON8().addActionListener(ActionEvent -> addTdetox());
		tea.getBOUTON9().addActionListener(ActionEvent -> addTdHammam());
		tea.getBOUTON10().addActionListener(ActionEvent -> addTdetoiles());

	}

	public void TotalPan() {

		double Total = 0;
		double addi = 0;
		double qtetto;
		int Qt = 0;

		for (int i = 0; i < ArrayPannier.size(); i++) {

			ProduitPanier ModPropan = ArrayPannier.get(i);

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

	public void addTLouvre() {

		Bt1Libelll = "The du Louvre";
		BT1Prinx = 2.95F;
		btnQt = 1;
		Mpp = new ProduitPanier();
		verifDoublon();

	}

	public void addMVerde() {

		Bt1Libelll = "Mate Verde Chimarrao Bio";
		BT1Prinx = 3.60F;
		btnQt = 1;
		Mpp = new ProduitPanier();
		verifDoublon();

	}

	public void addGYImpe() {

		Bt1Libelll = "Grand Yunnan Imperial";
		BT1Prinx = 4.22F;
		btnQt = 1;
		Mpp = new ProduitPanier();
		verifDoublon();

	}

	public void addOsmDor() {

		Bt1Libelll = "Osmanthus DOr";
		BT1Prinx = 1.95F;
		btnQt = 1;
		Mpp = new ProduitPanier();
		verifDoublon();

	}

	public void addTNBio() {

		Bt1Libelll = "Thé noir BIO";
		BT1Prinx = 6.32F;
		btnQt = 1;
		Mpp = new ProduitPanier();
		verifDoublon();

	}

	public void addTDtresors() {

		Bt1Libelll = "Thé des Trésors";
		BT1Prinx = 2.34F;
		btnQt = 1;
		Mpp = new ProduitPanier();
		verifDoublon();

	}

	public void addTGMidori() {

		Bt1Libelll = "Genmaicha Midori BIO";
		BT1Prinx = 4.22F;
		btnQt = 1;
		Mpp = new ProduitPanier();
		verifDoublon();
	}

	public void addTdetox() {

		Bt1Libelll = "DETOX Japonaise BIO";
		BT1Prinx = 3.54F;
		btnQt = 1;
		Mpp = new ProduitPanier();
		verifDoublon();
	}

	public void addTdHammam() {

		Bt1Libelll = "Thé du Hammam";
		BT1Prinx = 2.85F;
		btnQt = 1;
		Mpp = new ProduitPanier();
		verifDoublon();

	}

	public void addTdetoiles() {

		Bt1Libelll = "Thé des Étoiles";
		BT1Prinx = 7.65F;
		btnQt = 1;
		Mpp = new ProduitPanier();
		verifDoublon();
	}

	public void verifDoublon() {

		int i;
		for (i = 0; i < ArrayPannier.size(); i++) {

			ProduitPanier ModPropan = ArrayPannier.get(i);

			String libel = ModPropan.getLibelle();
			if (Bt1Libelll.equals(libel)) {

				int Qt = ModPropan.getQt();
				int nQt = Qt + 1;

				System.out.println(nQt);

				Mpp.setLibelle(Bt1Libelll);
				Mpp.setPrix(BT1Prinx);
				Mpp.setQt(nQt);

				pan.plusUnProdpan(Mpp);
				ArrayPannier = pan.affichPan();
				panVue.getListProduit().setListData(ArrayPannier.toArray());
				TotalPan();

				break;

			}

		}

		while (i >= ArrayPannier.size() || ArrayPannier.size() == 0) {

			Mpp.setLibelle(Bt1Libelll);
			Mpp.setPrix(BT1Prinx);
			Mpp.setQt(btnQt);
			pan.ajoutProdPan(Mpp);
			ArrayPannier = pan.affichPan();
			TotalPan();
			panVue.getListProduit().setListData(ArrayPannier.toArray());

			break;

		}

	}
}

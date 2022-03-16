package model;

public class ProduitPanier {

	private String Libelle;
	private double Prix;
	private int Qt;

	public ProduitPanier() {

		this.Libelle = "";
		this.Prix = 0;
		this.Qt = 0;

	}

	public ProduitPanier(String Libelle, double prix, int Qt) {

		this.Libelle = Libelle;
		this.Prix = prix;
		this.Qt = Qt;

	}

	public int getQt() {
		return Qt;
	}

	public void setQt(int qt) {
		Qt = qt;
	}

	@Override
	public String toString() {
		return "Qt " + Qt + "  |  " + Libelle + "  |  " + Prix + " €";
	}

	public String getLibelle() {
		return Libelle;
	}

	public void setLibelle(String libelle) {
		Libelle = libelle;
	}

	public double getPrix() {
		return Prix;
	}

	public void setPrix(double prix) {
		Prix = prix;
	}

}

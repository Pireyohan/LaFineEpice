package model;

public class Produit {

	private int Id;
	private String Libelle;
	private int Qt;
	private float Prix;
	private int Categorie;

	public Produit() {

		this.Id = 0;
		this.Libelle = "";
		this.Qt = 0;
		this.Prix = 0;
		this.Categorie = 0;
	}

	public Produit(int id, String libelle, int qt, float prix, int categorie) {

		this.Id = id;
		this.Libelle = libelle;
		this.Qt = qt;
		this.Prix = prix;
		this.Categorie = categorie;

	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getLibelle() {
		return Libelle;
	}

	public void setLibelle(String libelle) {
		Libelle = libelle;
	}

	public int getQt() {
		return Qt;
	}

	public void setQt(int qt) {
		Qt = qt;
	}

	public float getPrix() {
		return Prix;
	}

	public void setPrix(float prix) {
		Prix = prix;
	}

	public int getCategorie() {
		return Categorie;
	}

	public void setCategorie(int categorie) {
		Categorie = categorie;
	}

	@Override
	public String toString() {
		return +Id + "," + Libelle + "," + Qt + "," + Prix + "," + Categorie;
	}

}

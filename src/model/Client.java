package model;

public class Client {

	private String nom;
	private String prenom;
	private String adresse;
	private int cp;
	private String email;
	private String mdp;
	private String tel;
	private String ville;
	private int Id;

	// initialisation contructeur modelClient
	public Client() {
		super();
		this.Id = 0;
		this.nom = "";
		this.prenom = "";
		this.adresse = "";
		this.cp = 0;
		this.ville = "";
		this.email = "";
		this.mdp = "";
		this.tel = "";
	}

	// Constructeur avec parametres établit
	public Client(String nom, String prenom, String adresse, int cp, String ville, String email, String mdp, String tel,
			int Id) {
		super();
		this.Id = Id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.cp = cp;
		this.email = email;
		this.ville = ville;
		this.mdp = mdp;
		this.tel = tel;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return Id + "," + nom + "," + prenom + "," + adresse + "," + cp + "," + ville + "," + email + "," + mdp + ","
				+ tel;
	}

}

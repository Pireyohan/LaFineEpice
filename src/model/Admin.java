package model;

public class Admin {
	private String Pseudo;
	private String MdpUser;

	public Admin() {
		this.MdpUser = "";
		this.Pseudo = "";

	}

	public Admin(String MdpUser, String Pseudo) {
		this.MdpUser = MdpUser;
		this.Pseudo = Pseudo;

	}

	public String getPseudo() {
		return Pseudo;
	}

	public void setPseudo(String pseudo) {
		Pseudo = pseudo;
	}

	public String getMdpUser() {
		return MdpUser;
	}

	public void setMdpUser(String mdpUser) {
		MdpUser = mdpUser;
	}

}

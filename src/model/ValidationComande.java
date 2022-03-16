package model;

public class ValidationComande {

	private int NumComCli;
	private double MontantCom;

	public ValidationComande() {
		this.MontantCom = 0;
		this.NumComCli = 0;

	}

	public ValidationComande(double MontantCom, int NumComCli) {

		this.MontantCom = MontantCom;
		this.NumComCli = NumComCli;

	}

	public int getNumComCli() {
		return NumComCli;
	}

	public void setNumComCli(int numComCli) {
		NumComCli = numComCli;
	}

	public double getMontantCom() {
		return MontantCom;
	}

	public void setMontantCom(double montantCom) {
		MontantCom = montantCom;
	}

}

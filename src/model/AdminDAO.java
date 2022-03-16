package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AdminDAO {

	private Connection conn;

	public AdminDAO() {
		conn = ConnexionBdd.getConnection();

	}

	/***********************************
	 * PARTIE ADMIN PRODUIT
	 ***************************************/

	public ArrayList<Produit> affichAdmin() {
		ArrayList<Produit> modelPlist = new ArrayList<Produit>();
		try {
			Statement statement = conn.createStatement();
			ResultSet resultat = statement
					.executeQuery("select num_prod , libelle_prod ,quantite_prod,prix_prod, num_cat from produits");
			while (resultat.next()) {
				Produit modelP = new Produit();
				modelP.setId(resultat.getInt("num_prod"));
				modelP.setLibelle(resultat.getString("libelle_prod"));
				modelP.setQt(resultat.getInt("quantite_prod"));
				modelP.setPrix(resultat.getFloat("prix_prod"));
				modelP.setCategorie(resultat.getInt("num_cat"));
				modelPlist.add(modelP);
				System.out.println(modelP);
			}

		} catch (SQLException e) {

			e.printStackTrace();

		}
		return modelPlist;

	}

	public void ajoutProduit(Produit ajoutMP) {

		try {

			PreparedStatement prepareStatement = conn.prepareStatement(
					"insert into produits(libelle_prod, quantite_prod,num_cat,prix_prod)values(?,?,?,?)");
			prepareStatement.setString(1, ajoutMP.getLibelle());
			prepareStatement.setInt(2, ajoutMP.getQt());
			prepareStatement.setInt(3, ajoutMP.getCategorie());
			prepareStatement.setFloat(4, ajoutMP.getPrix());
			prepareStatement.executeUpdate();

		} catch (SQLException ex) {

			System.out.println("SQLException:" + ex.getMessage());
			System.out.println("SQLState:" + ((SQLException) ex).getMessage());
			System.out.println("VendorError:" + ((SQLException) ex).getErrorCode());

		}

	}

	public void suprimProd(int numP) {
		try {
			PreparedStatement prepareStatement = conn.prepareStatement("delete from produits where num_prod=?");
			prepareStatement.setInt(1, numP);
			prepareStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void modifProd(Produit ModifP) {

		try {
			PreparedStatement prepareStatement = conn.prepareStatement(
					"update produits set libelle_prod=?, quantite_prod=?, prix_prod=?, num_cat=? where num_prod=?");

			prepareStatement.setString(1, ModifP.getLibelle());
			prepareStatement.setInt(2, ModifP.getQt());
			prepareStatement.setFloat(3, ModifP.getPrix());
			prepareStatement.setInt(4, ModifP.getCategorie());
			prepareStatement.setInt(5, ModifP.getId());
			prepareStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/******************************
	 * ADMIN CLIENT
	 ***************************************/

	public ArrayList<Client> affichAdminCli() {
		ArrayList<Client> modelClient = new ArrayList<Client>();
		try {
			Statement statement = conn.createStatement();
			ResultSet resultat = statement.executeQuery("select* from clients");
			while (resultat.next()) {
				Client modelC = new Client();
				modelC.setId(resultat.getInt("num_cli"));
				modelC.setNom(resultat.getString("nom_cli"));
				modelC.setPrenom(resultat.getString("prenom_cli"));
				modelC.setAdresse(resultat.getString("adr_cli"));
				modelC.setCp(resultat.getInt("cp_cli"));
				modelC.setVille(resultat.getString("ville_cli"));
				modelC.setEmail(resultat.getString("email_cli"));
				modelC.setMdp(resultat.getString("mdp_cli"));
				modelC.setTel(resultat.getString("tel_cli"));
				modelClient.add(modelC);
				System.out.println(modelC);
			}

		} catch (SQLException e) {

			e.printStackTrace();

		}
		return modelClient;

	}

	public void ajoutClient(Client ajoutClt) {

		try {

			PreparedStatement prepareStatement = conn.prepareStatement(
					"insert into clients(nom_cli, prenom_cli,adr_cli,cp_cli,ville_cli,email_cli,mdp_cli,tel_cli)"
							+ "values(?,?,?,?,?,?,?,?)");
			prepareStatement.setString(1, ajoutClt.getNom());
			prepareStatement.setString(2, ajoutClt.getPrenom());
			prepareStatement.setString(3, ajoutClt.getAdresse());
			prepareStatement.setInt(4, ajoutClt.getCp());
			prepareStatement.setString(5, ajoutClt.getVille());
			prepareStatement.setString(6, ajoutClt.getEmail());
			prepareStatement.setString(7, ajoutClt.getMdp());
			prepareStatement.setString(8, ajoutClt.getTel());
			prepareStatement.executeUpdate();

		} catch (SQLException ex) {

			System.out.println("SQLException:" + ex.getMessage());
			System.out.println("SQLState:" + ((SQLException) ex).getMessage());
			System.out.println("VendorError:" + ((SQLException) ex).getErrorCode());

		}

	}

	public ArrayList<Admin> ConnexionAdmin() {
		ArrayList<Admin> User = new ArrayList<Admin>();

		try {
			Statement statement = conn.createStatement();
			ResultSet resultat = statement.executeQuery("select* from users;");
			while (resultat.next()) {
				Admin addUser = new Admin();
				addUser.setPseudo(resultat.getString("pseudo_user"));
				addUser.setMdpUser(resultat.getString("mdp_user"));
				User.add(addUser);

			}

		} catch (SQLException e) {

			e.printStackTrace();

		}
		return User;

	}
}

package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PannierDAO {

	private Connection conn;

	public PannierDAO() {
		conn = ConnexionBdd.getConnection();

	}

	public void ajoutProdPan(ProduitPanier panProd) {

		try {

			PreparedStatement prepareStatement = conn
					.prepareStatement("insert into panier(Libelle_prod,quantite_prod,prix_prod ) values  (?,?,?);");
			prepareStatement.setString(1, panProd.getLibelle());
			prepareStatement.setInt(2, panProd.getQt());
			prepareStatement.setDouble(3, panProd.getPrix());
			prepareStatement.executeUpdate();

		} catch (SQLException ex) {

			System.out.println("SQLException:" + ex.getMessage());
			System.out.println("SQLState:" + ((SQLException) ex).getMessage());
			System.out.println("VendorError:" + ((SQLException) ex).getErrorCode());

		}

	}

	public ArrayList<ProduitPanier> affichPan() {
		ArrayList<ProduitPanier> listPan = new ArrayList<ProduitPanier>();

		try {
			Statement statement = conn.createStatement();
			ResultSet resultat = statement.executeQuery("select* from panier;");
			while (resultat.next()) {
				ProduitPanier modelP2 = new ProduitPanier();
				modelP2.setLibelle(resultat.getString("libelle_prod"));
				modelP2.setPrix(resultat.getDouble("prix_prod"));
				modelP2.setQt(resultat.getInt("quantite_prod"));
				listPan.add(modelP2);

			}

		} catch (SQLException e) {

			e.printStackTrace();

		}
		return listPan;

	}

	// Validation du panier modifier avec le tuple Quantité
	// Tu achêtes un produit , il se retire du stock quantité

	public void validationPan(ArrayList<ProduitPanier> ArrayPannier) {

		for (int i = 0; i < ArrayPannier.size(); i++) {

			try {

				ProduitPanier mp = ArrayPannier.get(i);

				String libel = mp.getLibelle();
				int Qt = mp.getQt();

				System.out.println(libel);
				System.out.println(Qt);

				PreparedStatement prepareStatement = conn
						.prepareStatement("Update produits set quantite_prod= quantite_prod - ? where libelle_prod=?");
				prepareStatement.setInt(1, Qt);
				prepareStatement.setString(2, libel);
				prepareStatement.executeUpdate();

			} catch (SQLException e) {
				System.out.println("SQLException:" + e.getMessage());
				System.out.println("SQLState:" + ((SQLException) e).getMessage());
				System.out.println("VendorError:" + ((SQLException) e).getErrorCode());
				e.printStackTrace();
			}
		}
	}

	public void plusUnProdpan(ProduitPanier panProd) {

		try {

			PreparedStatement prepareStatement = conn
					.prepareStatement("Update panier set quantite_prod=? where libelle_prod=?");

			prepareStatement.setInt(1, panProd.getQt());
			prepareStatement.setString(2, panProd.getLibelle());
			prepareStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void clearpan() {

		try {

			PreparedStatement prepareStatement = conn.prepareStatement("delete from panier");
			prepareStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void ValidationPanComm(ValidationComande Valcom) {

		try {

			PreparedStatement prepareStatement = conn
					.prepareStatement("insert into commande(num_clients_comm,montant_comm) values  (?,?);");
			prepareStatement.setInt(1, Valcom.getNumComCli());
			prepareStatement.setDouble(2, Valcom.getMontantCom());
			prepareStatement.executeUpdate();

		} catch (SQLException ex) {

			System.out.println("SQLException:" + ex.getMessage());
			System.out.println("SQLState:" + ((SQLException) ex).getMessage());
			System.out.println("VendorError:" + ((SQLException) ex).getErrorCode());

		}

	}
//	public ArrayList<ProduitPannier> affichePP() {
//	ArrayList<ProduitPannier> listPP = new ArrayList<ProduitPannier>();
//	try {
//		Statement statement = conn.createStatement();
//		ResultSet resultat = statement.executeQuery(
//				"select libelle_prod, prix_prod from produits where libelle_prod =  'Cafe Moka Ganoji'");
//		while (resultat.next()) {
//			ProduitPannier modelP2 = new ProduitPannier();
//			modelP2.setLibelle(resultat.getString("libelle_prod"));
//			modelP2.setPrix(resultat.getInt("prix_prod"));
//			listPP.add(modelP2);
//			System.out.println(modelP2);
//		}
//
//	} catch (SQLException e) {
//
//		e.printStackTrace();
//
//	}
//	return listPP;
//
//}

}

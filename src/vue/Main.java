package vue;

import controller.ActionVue;
import controller.AddCafe;
import controller.AddEpice;
import controller.AddMiel;
import controller.AddThe;
import controller.Admin;

/**
 * Ceci est notre classe de lancement
 * 
 * @author Pire Yohan & Bechker Khaled
 * @date 19/05/2021
 * @version 1.0
 */

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 * On fait un new sur toutes les vues qui nous sont nécessaires.
		 */
		ConnAdmin connAdmin = new ConnAdmin();
		Connexion con = new Connexion();
		Acceuil pageAccueil = new Acceuil();
		Tea tea = new Tea();
		Cafe coffee = new Cafe();
		Epice spicy = new Epice();
		Miel honey = new Miel();
		PageProduit pageProduit = new PageProduit(tea, coffee, spicy, honey);
		AdminProduits_Clients pageAdmin = new AdminProduits_Clients();
		Pannier pannier = new Pannier();
		/**
		 * Pour les différents controllers , nous avons fait le choix d'en faire un par
		 * type de produit(café,thé, miel, epice) Cela permet d'avoir un controller pour
		 * chaque produit, un pour l'admin et un pour les actions de vue.
		 */
		ActionVue ctlActionVue = new ActionVue(pageAccueil, connAdmin, pageProduit, coffee, tea, pannier, pageAdmin, con);
		Admin ctrlAdmin = new Admin(pageAdmin, con);
		AddCafe ctrlCafe = new AddCafe(pannier, pageProduit, coffee);
		AddMiel ctrlMiel = new AddMiel(pannier, pageProduit, honey);
		AddEpice ctrlEpice = new AddEpice(pannier, pageProduit, spicy);
		AddThe ctrlThe = new AddThe(pannier, pageProduit, tea);

		/*
		 * l'appel de nos différentes vues au départ via leur frame en true ou false.
		 */
		pageAccueil.frame.setVisible(true);
		connAdmin.getFrame().setVisible(false);
		con.getCoFrame().setVisible(false);
		pageProduit.frame.setVisible(false);
		pageAdmin.getFrame().setVisible(false);

	}
}
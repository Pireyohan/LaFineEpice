package model;
	import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnexionBdd {
	
	
		private static Connection connexion = null;

		public ConnexionBdd() {
			try {

				InputStream input = new FileInputStream("config/db.properties");
				Properties prop = new Properties();

				prop.load(input);
				String driver = prop.getProperty("driver");
				String url = prop.getProperty("url");
				String user = prop.getProperty("user");
				String password = prop.getProperty("password");
				Class.forName(driver);
				connexion = DriverManager.getConnection(url, user, password);

			} catch (Exception e) {
				e.printStackTrace();

			}

		}

		public static Connection getConnection() {
			if (connexion == null) {

				new ConnexionBdd();
			}
			return connexion;

		}

		public static void stop() {
			if (connexion != null) {
				try {
					connexion.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}




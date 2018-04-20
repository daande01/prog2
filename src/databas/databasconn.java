package databas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class databasconn {

	Connection conn = null;

	public databasconn() throws InstantiationException, IllegalAccessException {

		try {

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cars1", "root", "");
			// Do something with the Connection
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Couldn’t load database driver: " + cnfe.getMessage());
		}

	}

}

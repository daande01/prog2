package databas;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class databas {

	public static void main(String[] arg)
			throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.sql.SQLException {
		Connection conn = null;

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Couldn’t load database driver: " + cnfe.getMessage());
		}

		try {

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cars1", "root", "");
			// Do something with the Connection
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}

		Statement stmt = conn.createStatement();
		ResultSet resultSet = stmt.executeQuery("SELECT * FROM bilar");

		while (resultSet.next()) {
			System.out.println("" + resultSet.getString("marke") + " " + resultSet.getString("modell"));
		}

	}
}
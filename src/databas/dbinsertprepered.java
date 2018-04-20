package databas;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import com.mysql.jdbc.Driver;

public class dbinsertprepered {
	public static void main(String[] arg)
			throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.sql.SQLException {

		Connection conn = null;

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

		// the mysql insert statement
		String query = " insert into bilar (marke, modell)" + " values (?, ?)";

		// create the mysql insert preparedstatement
		PreparedStatement preparedStmt = conn.prepareStatement(query);
		preparedStmt.setString(1, "volvo");
		preparedStmt.setString(2, "xc60");

		// execute the preparedstatement
		preparedStmt.execute();

		conn.close();

	}
}
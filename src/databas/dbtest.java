package databas;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import klassvariabel_klassmetod.mainbevisstatic;

public class dbtest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, SQLException {

		databasconn db = new databasconn();

		Statement stmt = db.conn.createStatement();
		ResultSet resultSet = stmt.executeQuery("SELECT * FROM bilar");

		while (resultSet.next()) {
			System.out.println("" + resultSet.getString("marke") + " " + resultSet.getString("modell"));
		}

	}

}

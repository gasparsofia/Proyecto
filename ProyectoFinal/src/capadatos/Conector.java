package capadatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		String sURL = "jdbc:mysql://localhost:3306/proyectofinal?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		con = DriverManager.getConnection(sURL,"root","");
		System.out.println(con.toString());
	}

}

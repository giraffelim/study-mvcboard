package util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBManager {

	public static Connection getConnection() throws Exception {
		Context initContext = new InitialContext();
		Context envContext = (Context) initContext.lookup("java:/comp/env");
		DataSource datasource = (DataSource) envContext.lookup("jdbc/Mymysqles");
		Connection conn = datasource.getConnection();

		return conn;
	}

	public static void close(Connection con,Statement stmt) {
		try {
			 con.close();
			stmt.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void close(Connection con, Statement stmt, ResultSet rs) {
		try {
			con.close();
			stmt.close();
			rs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

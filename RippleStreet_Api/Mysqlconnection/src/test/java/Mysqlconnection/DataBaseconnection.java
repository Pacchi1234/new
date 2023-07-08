package Mysqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseconnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");

		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ripplestreetdb", "root", "Prashanth");
		if (con != null) {
			System.out.println("conncted");
		} else {
			System.out.println("not connected");
		}

		PreparedStatement prepared = con
				.prepareStatement("insert into ripplestreetdb.employee values('nageddra','55','29','devops')");
		// prepared.executeUpdate();
		PreparedStatement prepared1 = con
				.prepareStatement("insert into ripplestreetdb.employee values('vinayaka','77','24','civil engineer')");
		prepared1.executeUpdate();
		PreparedStatement pre = con.prepareStatement("select * from ripplestreetdb.employee");
		ResultSet rs = pre.executeQuery();
		PreparedStatement prep2 = con.prepareStatement(
				"insert into ripplestreetdb.employee values('Mike Leo','1','65','CEO of rippleStreet')");
		// prep2.executeUpdate();
		PreparedStatement prep3 = con.prepareStatement(
				"insert into ripplestreetdb.employee values('Nagamahesh Pingale','2','35','Head of the Engineering')");
		// prep3.executeUpdate();
		while (rs.next()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2) + "" + rs.getString(3) + " " + rs.getString(4));
		}

	}

}

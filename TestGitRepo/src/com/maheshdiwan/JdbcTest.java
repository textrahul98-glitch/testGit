package com.maheshdiwan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	public static void main(String[] args) {
		try {
			String sql = "	insert into	bank(cusId, cusName , cusCity )" + "values(105, 'Shankrya bhai', 'America')";

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahesh", "root", "mahesh@9780");

			Statement stat = con.createStatement();
			stat.execute(sql);
			System.out.println("Done dona Done");
			con.close();
			stat.close();

		} catch (SQLException | ClassNotFoundException e) {

			e.printStackTrace();
		}
	}

}

package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Shankar2 {

	public static void main(String[] args) throws SQLException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Java",
                    "root",
                    "root");

            String sql = """
                    insert into student(stu_id, stu_name, stu_city, stu_number)
                    values(1111, 'Suresh', 'Selu', 7896542)
                    """;

            Statement stmt = con.createStatement();

            stmt.execute(sql);

            stmt.close();
            con.close();

            System.out.println("Executed");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
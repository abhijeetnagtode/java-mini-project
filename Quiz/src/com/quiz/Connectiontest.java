package com.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Connectiontest {

	Connection connection = null;
	//creating connection class and returning obj
	public Connection getconnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}
package com.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class Result extends Student_data {

	public void result() throws SQLException {
		// checking result

		System.out.println("--------RESULT---------");
		System.out.println("Total Questions: " + "+10");
		System.out.println("Correct Answered Questions : " + marks);

		if (marks == 10) {
			System.out.println("Performance : Class A");
		} else if (marks <= 6) {
			System.out.println("Performance : Class B");
		} else if (marks < 5) {
			System.out.println("Performance : Class C");
		} else {
			System.out.println("fail");
		}
		Connection connection = null;
		Connectiontest Connectiontest = new Connectiontest();
		connection = Connectiontest.getconnection();
		PreparedStatement pst = connection.prepareStatement("SELECT * FROM student ORDER BY marks DESC ");
		ResultSet rs = pst.executeQuery();
		System.out.println("************Student Result**********");
		System.out.println("  id  " + "  name  " + "  pass  " + "  marks  ");
		
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "  ||  " + rs.getString(2) + "  ||  " + rs.getString(3) + "  ||  " + rs.getString(4));

		}

	}

}

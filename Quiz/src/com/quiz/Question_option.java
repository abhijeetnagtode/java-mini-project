package com.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Question_option {
	public static void main(String[] args) throws SQLException {

		Connection connection = null;

		try {
			Connectiontest connectiontest = new Connectiontest();
			connection = connectiontest.getconnection();
			PreparedStatement pst = connection.prepareStatement(
					"insert into question_options(option_id,question_id,question_option)values(?,?,?)");

			// que1
			pst.setString(1, "1");
			pst.setString(2, "1");
			pst.setString(3, "A:PYTHON");
			pst.addBatch();
			pst.setString(1, "2");
			pst.setString(2, "1");
			pst.setString(3, "B:C/C+");
			pst.addBatch();
			pst.setString(1, "3");
			pst.setString(2, "1");
			pst.setString(3, "C:JAVA");
			pst.addBatch();
			pst.setString(1, "4");
			pst.setString(2, "1");
			pst.setString(3, "D:COBOL");
			pst.addBatch();
			// que2
			pst.setString(1, "5");
			pst.setString(2, "2");
			pst.setString(3, "HELP");
			pst.addBatch();
			pst.setString(1, "6");
			pst.setString(2, "2");
			pst.setString(3, "–HELP");
			pst.addBatch();
			pst.setString(1, "7");
			pst.setString(2, "2");
			pst.setString(3, "-- HELP");
			pst.addBatch();
			pst.setString(1, "8");
			pst.setString(2, "2");
			pst.setString(3, "ELP-");
			pst.addBatch();
			// que3
			pst.setString(1, "9");
			pst.setString(2, "3");
			pst.setString(3, "QUIT");
			pst.addBatch();
			pst.setString(1, "10");
			pst.setString(2, "3");
			pst.setString(3, "STOP");
			pst.addBatch();
			pst.setString(1, "11");
			pst.setString(2, "3");
			pst.setString(3, "/c");
			pst.addBatch();
			pst.setString(1, "12");
			pst.setString(2, "3");
			pst.setString(3, "C and D both");
			pst.addBatch();
			// que4
			pst.setString(1, "13");
			pst.setString(2, "4");
			pst.setString(3, "LIST");
			pst.addBatch();
			pst.setString(1, "14");
			pst.setString(2, "4");
			pst.setString(3, "TUPLE");
			pst.addBatch();
			pst.setString(1, "15");
			pst.setString(2, "4");
			pst.setString(3, "ROWS AND COLUMNS");
			pst.addBatch();
			pst.setString(1, "16");
			pst.setString(2, "4");
			pst.setString(3, "LIST AND TUPLES BOTH");
			pst.addBatch();
			// que5
			pst.setString(1, "17");
			pst.setString(2, "5");
			pst.setString(3, "Show database;");
			pst.addBatch();
			pst.setString(1, "18");
			pst.setString(2, "5");
			pst.setString(3, "Show databases;");
			pst.addBatch();
			pst.setString(1, "19");
			pst.setString(2, "5");
			pst.setString(3, "Show database();");
			pst.addBatch();
			pst.setString(1, "20");
			pst.setString(2, "5");
			pst.setString(3, "Show_all database;");
			pst.addBatch();
			// que6
			pst.setString(1, "21");
			pst.setString(2, "6");
			pst.setString(3, "Database name");
			pst.addBatch();
			pst.setString(1, "22");
			pst.setString(2, "6");
			pst.setString(3, "Row name");
			pst.addBatch();
			pst.setString(1, "23");
			pst.setString(2, "6");
			pst.setString(3, "Column name");
			pst.addBatch();
			pst.setString(1, "24");
			pst.setString(2, "6");
			pst.setString(3, "Table name");
			pst.addBatch();
			// que7
			pst.setString(1, "25");
			pst.setString(2, "7");
			pst.setString(3, "DML");
			pst.addBatch();
			pst.setString(1, "26");
			pst.setString(2, "7");
			pst.setString(3, "DDL");
			pst.addBatch();
			pst.setString(1, "27");
			pst.setString(2, "7");
			pst.setString(3, "DCL");
			pst.addBatch();
			pst.setString(1, "28");
			pst.setString(2, "7");
			pst.setString(3, "DQL");
			pst.addBatch();
			// que8
			pst.setString(1, "29");
			pst.setString(2, "8");
			pst.setString(3, "TRUE");
			pst.addBatch();
			pst.setString(1, "30");
			pst.setString(2, "8");
			pst.setString(3, "FLASE");
			pst.addBatch();
			pst.setString(1, "31");
			pst.setString(2, "8");
			pst.setString(3, "A and B");
			pst.addBatch();
			pst.setString(1, "32");
			pst.setString(2, "8");
			pst.setString(3, "B and A");
			pst.addBatch();
			// que9
			pst.setString(1, "33");
			pst.setString(2, "9");
			pst.setString(3, "It returns us the duplicate values");
			pst.addBatch();
			pst.setString(1, "34");
			pst.setString(2, "9");
			pst.setString(3, "It returns us the unique values");
			pst.addBatch();
			pst.setString(1, "35");
			pst.setString(2, "9");
			pst.setString(3, "It returns us the NULL values;");
			pst.addBatch();
			pst.setString(1, "36");
			pst.setString(2, "9");
			pst.setString(3, "Dosent Do anything;");
			pst.addBatch();
			// que10
			pst.setString(1, "37");
			pst.setString(2, "10");
			pst.setString(3, "Candidate key");
			pst.addBatch();
			pst.setString(1, "38");
			pst.setString(2, "10");
			pst.setString(3, "Foreign key");
			pst.addBatch();
			pst.setString(1, "39");
			pst.setString(2, "10");
			pst.setString(3, "Primary key");
			pst.addBatch();
			pst.setString(1, "40");
			pst.setString(2, "10");
			pst.setString(3, "Unique key");
			pst.addBatch();

			pst.executeBatch();

			int i = pst.executeUpdate();
			System.out.println("insertion complete" + i);
			connection.close();
			pst.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

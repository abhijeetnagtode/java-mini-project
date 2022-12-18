package com.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Question {
	public static void main(String[] args) throws SQLException { // exception for Sql error

		Connection connection = null;
		// creating try catch block

		try {
			Connectiontest connectiontest = new Connectiontest();
			connection = connectiontest.getconnection();
			PreparedStatement pst = connection.prepareStatement("insert into questions(que_id,question)values(?,?)");
			// adding values using setstring()
			pst.setString(1, "1");
			pst.setString(2, "Que:In which language MYSQL is written?");
			// after completing one row adding batch so that it can goes to second row and
			// Repeat the process
			pst.addBatch();
			pst.setString(1, "2");
			pst.setString(2,
					"Que :To see the list of options provided by MYSQL which of the following command is used?");
			pst.addBatch();
			pst.setString(1, "3");
			pst.setString(2,
					"Que :If you want to stop the processing query then which of the following command you should use?");
			pst.addBatch();
			pst.setString(1, "4");
			pst.setString(2, " Que :In which form MYSQL query results are displayed?");
			pst.addBatch();

			pst.setString(1, "5");
			pst.setString(2, "Que :To see all the databases which command is used?");
			pst.addBatch();

			pst.setString(1, "6");
			pst.setString(2, "Que :In the following statement 'USE student;' , what do you mean by the 'student'?");
			pst.addBatch();

			pst.setString(1, "7");
			pst.setString(2, "Que :ALTER command is a type of which SQL command?");
			pst.addBatch();

			pst.setString(1, "8");
			pst.setString(2, "Que : Is a semicolon necessary after every query?");
			pst.addBatch();

			pst.setString(1, "9");
			pst.setString(2, "Que :From all the clauses in MYSQL what task is performed by the DISTINT clause?");
			pst.addBatch();

			pst.setString(1, "10");
			pst.setString(2, " Que : Which key is commonly known as a subset of a super key?");
			pst.addBatch();
			// executing batch for loading all rows in table;
			pst.executeBatch();
			int i = pst.executeUpdate();
			System.out.println("insertion complete" + i);
			connection.close();
			pst.close();
			// closing connection
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}

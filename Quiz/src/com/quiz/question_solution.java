package com.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class question_solution {
	public static void main(String[] args) throws SQLException {

		Connection connection = null;

		try {
			Connectiontest connectiontest = new Connectiontest();
			connection = connectiontest.getconnection();
			PreparedStatement pst = connection
					.prepareStatement("insert into question_solution(quiz_sol_id,que_id,option_number)values(?,?,?)");
			pst.setString(1, "1");
			pst.setString(2, "1");
			pst.setString(3, "2");
			pst.addBatch();
			// que2
			pst.setString(1, "2");
			pst.setString(2, "2");
			pst.setString(3, "7");
			pst.addBatch();
			// que3
			pst.setString(1, "3");
			pst.setString(2, "3");
			pst.setString(3, "12");
			pst.addBatch();
			// que4
			pst.setString(1, "4");
			pst.setString(2, "4");
			pst.setString(3, "15");
			pst.addBatch();
			// que5
			pst.setString(1, "5");
			pst.setString(2, "5");
			pst.setString(3, "18");
			pst.addBatch();
			// que6
			pst.setString(1, "6");
			pst.setString(2, "6");
			pst.setString(3, "21");
			pst.addBatch();
			// que7
			pst.setString(1, "7");
			pst.setString(2, "7");
			pst.setString(3, "26");
			pst.addBatch();
			// que8
			pst.setString(1, "8");
			pst.setString(2, "8");
			pst.setString(3, "29");
			pst.addBatch();
			// que9
			pst.setString(1, "9");
			pst.setString(2, "9");
			pst.setString(3, "34");
			pst.addBatch();
			// que10
			pst.setString(1, "10");
			pst.setString(2, "10");
			pst.setString(3, "37");
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

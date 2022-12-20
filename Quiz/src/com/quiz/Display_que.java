package com.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;
import java.sql.ResultSet;

public class Display_que extends Student_data {

	public void startque() throws SQLException {
		Connection connection = null;

		Connectiontest connectiontest = new Connectiontest();
		connection = connectiontest.getconnection();
		// creating connection
		// student login and if user and password is correct then question will display

		PreparedStatement pst1 = connection
				.prepareStatement("SELECT fname,password FROM student WHERE student.student_id ");
		ResultSet rs1 = pst1.executeQuery();
		System.out.println("********** Welcome to the Quiz Exam ************  ");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of student: ");

		String Username = sc.next();
		System.out.println("Enter the Password: ");
		String Password = sc.next();

		String Urname = "";
		String Pword = "";
		// getting user name and pass from table
		while (rs1.next()) {
			Urname = rs1.getString("fname");
			Pword = rs1.getString("password");
		}
		// checking username and password
		if (Username.equals(Urname) && Password.equals(Pword)) {
			PreparedStatement pst = connection
					.prepareStatement("SELECT * FROM que_ans WHERE que_ans.SrNo ORDER BY RAND()");
			ResultSet rs = pst.executeQuery();
			System.out.println("********Starting test*******");
			System.out.println();
			PreparedStatement pst2 = connection.prepareStatement("SELECT answer FROM que_ans WHERE  que_ans.answer");
			ResultSet rs2 = pst2.executeQuery();

			// if the condition match then taking data from question table and displayed
			while (rs.next()) {
				System.out.println("Que" + rs.getString("question"));
				System.out.println("op" + rs.getString("op1"));
				System.out.println("op" + rs.getString("op2"));
				System.out.println("op" + rs.getString("op3"));
				System.out.println("op" + rs.getString("op4"));
				System.out.println("Enter the Option: ");
				int ans = sc.nextInt();
				System.out.println();
				// taking answer as input
				// checking answers
				if (ans == rs.getInt("answer")) {
					System.out.println("Correct Answer!!");
					marks++;
				} else {
					System.out.println("Incporrect Answer!!");
				}
			}
			PreparedStatement pst3 = connection.prepareStatement("UPDATE student set marks=? WHERE student_id=?");
			pst3.setInt(1, marks);
			pst3.setInt(2, stud_id);
			int i=pst3.executeUpdate();
			System.out.println("insertion complete" +i);
			
		} else {
			System.out.println("Invali Password");
		}
		System.out.println("-------------END----------------");

	}
}

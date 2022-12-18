package com.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.ResultSet;

public class Display_que extends Student_data {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;

		Connectiontest connectiontest = new Connectiontest();
		connection = connectiontest.getconnection();

		PreparedStatement pst1 = connection
				.prepareStatement("SELECT fname,password FROM student WHERE student.student_id ");
		ResultSet rs1 = pst1.executeQuery();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of student: ");

		String Username = sc.next();
		System.out.println("Enter the Password: ");
		String Password = sc.next();

		String Urname = "";
		String Pword = "";

		while (rs1.next()) {
			Urname = rs1.getString("fname");
			Pword = rs1.getString("password");
		}
		if (Username.equals(Urname) && Password.equals(Pword)) {
			PreparedStatement pst = connection
					.prepareStatement("SELECT question,op1,op2,op3,op4 FROM que_ans WHERE que_ans.SrNo");
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				int count = 0;
				rs.absolute(count);
				
				System.out.println("Que" + rs.getString("question"));
				System.out.println("op1" + rs.getString("op1"));
				System.out.println("op2" + rs.getString("op2"));
				System.out.println("op3" + rs.getString("op3"));
				System.out.println("op4" + rs.getString("op4"));
				count++;

			}
		} else {
			System.out.println("Invali Password");
		}
		System.out.println("------------------------------");

	}
}

package com.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Student_data {
	static int marks = 0; // marks declaring static so we can use same variable to whole package

	public void insertData() throws SQLException {
		// inserting student data login pass
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of student: ");
		String sname = sc.next();
		System.out.println("Enter the Password: ");
		String pass = sc.next();

		Connection connection = null;
		// importing connection class
		Connectiontest Connectiontest = new Connectiontest();
		connection = Connectiontest.getconnection();
		// insert data into student table
		PreparedStatement pst = connection.prepareStatement("insert into student(fname,password)values(?,?) ");
		pst.setString(1, sname);
		pst.setString(2, pass);
		int i = pst.executeUpdate();
		System.out.println(i);
		System.out.println("inserted");

		connection.close();
		pst.close();
	}

}

package com.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Student_data {
	static int marks = 0; // marks declaring static so we can use same variable to whole package
	static int stud_id;
	public void insertData() throws SQLException {
		// inserting student data login pass
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sutudent id:");
		stud_id=sc.nextInt();
		System.out.println("Enter the name of student: ");
		String sname = sc.next();
		System.out.println("Enter the Password: ");
		String pass = sc.next();

		Connection connection = null;
		// importing connection class
		Connectiontest Connectiontest = new Connectiontest();
		connection = Connectiontest.getconnection();
		// insert data into student table
		PreparedStatement pst = connection.prepareStatement("insert into student(student_id,fname,password)values(?,?,?) ");
		pst.setInt(1, stud_id);
		pst.setString(2, sname);
		pst.setString(3, pass);
		int i = pst.executeUpdate();
		System.out.println(i);
		System.out.println("inserted");

		connection.close();
		pst.close();
	}

}

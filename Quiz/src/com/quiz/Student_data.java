package com.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Student_data {
	static int marks;

	public void insertData() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of student: ");
		String sname = sc.next();
		System.out.println("Enter the Password: ");
		String pass = sc.next();

		Connection connection = null;

		Connectiontest Connectiontest = new Connectiontest();
		connection = Connectiontest.getconnection();
		PreparedStatement pst = connection.prepareStatement("insert into student(fname,password)values(?,?) ");
		pst.setString(1, sname);
		pst.setString(2, pass);
		int i = pst.executeUpdate();
		System.out.println(i);
		System.out.println("inserted");

		connection.close();
		pst.close();
	}

	public static void main(String[] args) throws SQLException {
		Student_data Student_data=new Student_data();
		Student_data.insertData();

	}
}

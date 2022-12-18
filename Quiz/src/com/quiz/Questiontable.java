package com.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Questiontable {

	public static void main(String[] args) throws SQLException { // exception for Sql error

		Connection connection = null;
		Connectiontest connectiontest = new Connectiontest();
		connection = connectiontest.getconnection();
		PreparedStatement pst = connection.prepareStatement("insert into que_ans(question,op1,op2,op3,op4,answer)values(?,?,?,?,?,?)");
		//que1
		pst.setString(1, "Que1: In which language MYSQL is written?");
		pst.setString(2, "1: A:PYTHON");
		pst.setString(3, "2: C/C+");
		pst.setString(4, "3: JAVA");
		pst.setString(5, "4: COBOL");
		pst.setInt(6, 2);
		pst.addBatch();
		//que2
		pst.setString(1, "Que2 :To see the list of options provided by MYSQL which of the following command is used?");
		pst.setString(2,"1: HELP" );
		pst.setString(3, "2: –HELP");
		pst.setString(4, "3: --HELP");
		pst.setString(5, "4: ELP-");
		pst.setInt(6, 4);
		pst.addBatch();
		//que3
		pst.setString(1, "Que3 :If you want to stop the processing query then which of the following command you should use?");
		pst.setString(2, "1: QUIT");
		pst.setString(3, "2: STOP");
		pst.setString(4, "3: /c");
		pst.setString(5, "4: C and D both");
		pst.setInt(6,5 );
		pst.addBatch();
		//que4

		pst.setString(1, "Que4 :In which form MYSQL query results are displayed?");
		pst.setString(2, "1: LIST");
		pst.setString(3, "2: TUPLE");
		pst.setString(4, "3: ROWS AND COLUMNS");
		pst.setString(5, "4: LIST AND TUPLES BOTH");
		pst.setInt(6,4 );
		pst.addBatch();
		//que5

		pst.setString(1, "Que 5 :To see all the databases which command is used?");
		pst.setString(2, "1: Show database");
		pst.setString(3, "2: Show databases;");
		pst.setString(4, "3: Show database();");
		pst.setString(5, "4: Show_all database;");
		pst.setInt(6, 3);
		pst.addBatch();
		//que6
		pst.setString(1, "Que 6 :In the following statement 'USE student;' , what do you mean by the 'student'?");
		pst.setString(2, "1: Database name");
		pst.setString(3, "2: Row name");
		pst.setString(4, "3: Column name");
		pst.setString(5, "4: Table name");
		pst.setInt(6, 2);
		pst.addBatch();
		
		pst.setString(1, "Que 7 :ALTER command is a type of which SQL command?");
		pst.setString(2, "1: DML");
		pst.setString(3, "2: DDL");
		pst.setString(4, "3: DCL");
		pst.setString(5, "4: DQL");
		pst.setInt(6,3 );
		pst.addBatch();
		
		pst.setString(1, "Que 8 : Is a semicolon necessary after every query?");
		pst.setString(2, "1: TRUE");
		pst.setString(3, "2: FLASE");
		pst.setString(4, "3: A and B");
		pst.setString(5, "4: B and A");
		pst.setInt(6, 2);
		pst.addBatch();
		
		pst.setString(1, "Que 9 :From all the clauses in MYSQL what task is performed by the DISTINT clause?");
		pst.setString(2, "1: It returns us the duplicate values");
		pst.setString(3, "2: It returns us the unique values");
		pst.setString(4, "3: It returns us the NULL values");
		pst.setString(5, "4: Dosent Do anything;");
		pst.setInt(6, 2);
		pst.addBatch();
		
		pst.setString(1, "Que 10 : Which key is commonly known as a subset of a super key?");
		pst.setString(2, "1: Candidate key");
		pst.setString(3, "2: Foreign key");
		pst.setString(4, "3: Primary key");
		pst.setString(5, "4: Unique key");
		pst.setInt(6, 2);
		pst.addBatch();
		
		pst.executeBatch();
		
		int i = pst.executeUpdate();
		System.out.println("insertion complete" + i);
		connection.close();
		pst.close();
		
	}
}

package com.quiz;

import java.sql.SQLException;

public class main extends Display_que {

	public static void main(String[] args) throws SQLException {
		
		Student_data Student_data=new Student_data();
		Student_data.insertData();
		
		Display_que Display_que=new Display_que();
		Display_que.startque();
		
		Result Result=new Result();
		Result.result();
		
		
		

	}

}

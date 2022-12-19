package com.quiz;

public class Result extends Student_data {

	public void result() {
		// checking result

		System.out.println("--------RESULT---------");
		System.out.println("Total Questions: " + "+10");
		System.out.println("Correct Answered Questions : " + marks);

		if (marks == 10) {
			System.out.println("Performance : Class A");
		} else if (marks <= 6) {
			System.out.println("Performance : Class B");
		} else if (marks < 5) {
			System.out.println("Performance : Class C");
		} else {
			System.out.println("fail");
		}
	}
}

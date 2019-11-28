package com.ustglobal.lambdaexpressions;

public class TestSquare {
	public static void main(String[] args) {


		SquareInterface st = x-> x*x;
		int result = st.square(20);
		System.out.println("Square is "+result);
	}
}

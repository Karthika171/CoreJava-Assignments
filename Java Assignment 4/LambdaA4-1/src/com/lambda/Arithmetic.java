package com.lambda;

	interface Add{
		int add(int x,int y);
	}

	interface Sub{
		int sub(int x,int y);
	}

	interface Multi{
		int mul(int x,int y);
	}

	interface Div{
		int div(int x,int y);
	}



	public class Arithmetic {

		public static void main(String[] args) {
			
			Add addFunction = (a,b) -> a+b;
			System.out.println(addFunction.add(10,20));
			
			Sub subFunction = (a,b) -> a-b;
			System.out.println(subFunction.sub(30,20));
			
			Multi mulFunction = (a,b) -> a*b;
			System.out.println(mulFunction.mul(10,20));
			
			Div divFunction = (a,b) -> a/b;
			System.out.println(divFunction.div(10,2));
			

		}

	}


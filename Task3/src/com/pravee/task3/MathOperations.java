package com.pravee.task3;


public class MathOperations 
{
	int num1,num2;
	
	MathOperations(){}
	
	MathOperations(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}

	int add(){
		return num1+num2;
	}
	
	int sub(){
		return num1-num2;
	}
	
	int mul(){
		return num1*num2;
	}
	
	double div(){
		double res=0.0;
		
		try{
			res=(double)num1/num2;
		}
		
		catch(ArithmeticException e){
			System.out.println(e);
		}
		
		return res;
	}
}

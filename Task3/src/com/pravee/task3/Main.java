package com.pravee.task3;

import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter 2 numbers");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			
			System.out.println("Enter your choice?");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			int ch=sc.nextInt();
			
			MathOperations c=new MathOperations(num1,num2);
			
			switch(ch)
			{
				case 1:
				{
					System.out.println("Addition result is "+c.add());
					break;
				}
				
				case 2:
				{
					System.out.println("Subtraction result is "+c.sub());
					break;
				}
				
				case 3:
				{
					System.out.println("Multiplication result is "+c.mul());
					break;
				}
				
				case 4:
				{
					System.out.println("Division result is "+c.div());
					break;
				}	
			}
			
			System.out.println("Would you like to continue? Y/N");
			char choice=sc.next().charAt(0);
			
			if(choice=='N')
			{
				System.out.println("Done!");	
				break;	
			}
		}
				
		sc.close();

	}

}

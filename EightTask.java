package com.task;
import java.util.Scanner;

public class EightTask {

	public static void main(String[] args) {
		//declaration
		// if and else
//		int a = 10;
//		int b= 55;
//		int c=8;
//		int d=25;
//		
//		if ((a+b)>(c+d))
//		{
//			System.out.println("sum of a and b is greater than sum of c and d.");
//		} else
//		{
//			System.out.println("sum of c and c is greater than sum of a and b.");
//		}
    //Q2 even number
//		int a= 11;
//		if (a%2==0)
//		{
//			System.out.println(a+" is even number");
//		}else {			System.out.println(a+" is odd number");
//		}
		//Q3 a to z
//		char abc;
//		for(abc='A';abc<='Z'; ++abc)
//		{
//			System.out.print(abc +" ");
//		}
				//Q4 SWAP THE NUMBERS
//		int x,y,t; // x and y are to swap
//		Scanner sc = new Scanner(System.in);
//		System.out.println(" Enter the value of x and y");
//		x= sc.nextInt();
//		y= sc.nextInt();
//		System.out.println("before swapping number:" +x+","+y);
//		// swapping
//		t=x;// t=x=10
//		x=y;// x=y=20
//		y=t;// y=t=10
//		System.out.println("After swapping:"+x+","+y);
//		
		// Q5. prime number
//		int i,n;
//		Scanner sc =new Scanner(System.in);
//		System.out.println("Please enter the number");
//		n= sc.nextInt();
//	
//		
//		for(i=2;i<=n;i++) {
//			if(n%i==0) {
//				System.out.println(n + "is not prime number");
//				break;
//				}
//		else {
//			System.out.println(n + " is prime number");
//			break;
//		}
//		
//		}
		
		
//		 Q6. factorial 
//		 int i=1,f=1,n; 
//		 Scanner sc =new Scanner(System.in);
//		 System.out.println("Please enter the number");
//		 n= sc.nextInt();
//		 for(i=1;i<=n;i++) { f=f*i; }
//		 System.out.println("Factorial of the number is: "+ f);
		 
			//Q7 LENTGHT OF STRING
//		String str;
//		int len=0;
//		Scanner sc= new Scanner (System.in);
//		System.out.println("Enter the string:");
//		str= sc.nextLine();
//		System.out.println("String lenght is :"+str.length());
		
		//Q8.
//		int i=1;
//		String str= "Welcome to Guvi";
//		for(i=1;i<=10;i++) {
//			System.out.println(str);
//		}
		//Q9 senior or not
//		int n;
//		Scanner sc= new Scanner (System.in);
//		System.out.println("Please enter the age");
//		n= sc.nextInt();
//		if(n>=60)
//		{
//			System.out.println(" Person is senior citizon");
//			
//		}else {
//		System.out.println("Person is not a senior citizin");
//		}
		
		//Q10 count number of digits in integer
		
		int count=0;
		int num;
		Scanner sc= new Scanner (System.in);
	System.out.println("Enter the integer :");
	num= sc.nextInt();
	while(num!=0) {
		num=num/10;
		count++;
		
	}
	System.out.println("Number of digit in the entered integer are:" + count);
		
		
	}
	
}

		

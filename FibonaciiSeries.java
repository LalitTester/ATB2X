package DiscussionWithAmrita;

import java.util.Scanner;

public class FibonaciiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=5;
		int i,a=0,b=1,c;
		for(i=1;i<=num1;i++)
		{
			System.out.print(a+ " ");
			c=a+b;
			a=b;
			b=c;
		}

	}

}

package DiscussionWithAmrita;

import java.util.Scanner;

public class PrimeNumberValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=11;
		int count=0;
		for(int j=1;j<=num;j++)
		 {
			if(num%j==0) {
			 count++;
			}
		 }
		if(count==2) {
			System.out.println("given number is prime number....");
		}
		else
		{
			System.out.println("given number is not prime number....");
		}


	}

}

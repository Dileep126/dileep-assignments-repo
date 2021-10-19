package com.sapient.trg.util;

public class Assessment1 {

	public static void main(String[] args) {
		System.out.println("Is 139 a perfect numer ?? " + isPerfectNum(139));
		System.out.println("Factorial of 5 is "+ factorial(5));
		System.out.println("Is 5 a prime number ?? " + isPrime(5));
		System.out.println("Sum of prime numbers upto 100 "+ sumOfPrimes(100));
		System.out.println("Is 132 a Armstrong number ?? " + isArmstrongNumber(132));
		System.out.println("Reverse of 6254 is " + reverseNumber(6254));
		System.out.println("32 in binary is " + decimalToBinary(32));
		System.out.println("110101 in decimal is " + binaryToDecimal(110101));
		System.out.println("Sum of first 15 fibonacci numbers is " + getSumOfNfibos(15));
		System.out.println("Is 2002 a palindrome number ?? " + isPalindromeNumber(2002));
	}
	
	public static boolean isPerfectNum(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum==n) {
			return true;
		}
		return false;
	}
	
	public static long factorial(int n) {
		if(n==0) {
			return 1;
		}
		
		return n*factorial(n-1);
	}
	
	public static boolean isPrime(int n) {
		
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static long sumOfPrimes(int n) {
		
		long sum=0;
		for(int i=2;i<=n;i++) {
			if(isPrime(i)) {
				sum=sum+i;
			}
		}
		return sum;
	}
	
	public static boolean isArmstrongNumber(int n) {
		int sum=0;
		int temp=n;
		while(n!=0) {
			int r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(sum==temp) {
			return true;
		}
		return false;
	}
	
	public static int reverseNumber(int n) {
		int sum=0;
		while(n!=0) {
			int r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		return sum;
	}
	
	public static int decimalToBinary(int n) {
		
		int p=1;
		int sum=0;
		while(n!=0) {
			int r=n%2;
			sum=sum+(p*r);
			p=p*10;
			n=n/2;
		}
		return sum;
	}
	
	public static int binaryToDecimal(int n) {
		
		int sum=0;
		int p=1;
		while(n!=0){
			int r=n%10;
			sum=sum+(p*r);
			p=p*2;
			n=n/10;
		}
		return sum;
	}
	
	public static int getSumOfNfibos(int n) {
		int sum=0;
		
		int []arr=new int [n];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<n;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		
		return sum;
		
	}
	
	public static boolean isPalindromeNumber(int n) {
		int temp=n;
		
		int sum=0;
		while(n!=0) {
			int r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==temp) {
			return true;
		}
		return false;
	}

}

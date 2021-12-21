// WAP to create 2 packages P1 and P2, P1 contains the program of factorial of a number and P2 contains the program whether the given number is even or odd.
// Create another program and input both packages to find out the factorial of the number and check if it's even or odd.

import P1.*;
import P2.*;

import java.util.Scanner;

class main {
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		n = sc.nextInt();
		
		fact f1 = new fact();
		even_odd f2 = new even_odd();
		
		f1.f(n);
		f2.evenodd(n);
	}
}
// 5) Write a Java Program to display numbers from 1 to n using scanner class. 

import java.util.Scanner;
public class Print_1_to_N_5 {
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the end value: ");
		int n = sc.nextInt();
		System.out.println("Numbers are: " );
		for(int i=1; i<=n; i++) 
		{
			System.out.println(i);
		}
	}
}

// OUTPUT

// Enter the end value: 13
// Numbers are: 
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
// 11
// 12
// 13
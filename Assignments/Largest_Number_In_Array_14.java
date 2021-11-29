// 14) Write a Java Program to find out the largest number of an array taking input from the user using the command line argument.

import java.util.Scanner;

public class Largest_Number_In_Array_14 {
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        int arr[]=new int [10];
        System.out.println("Enter the 10 elements");
        for(int i=0;i<10;i++){
            System.out.println("Enter the element " + (i+1));
            arr[i]=sc.nextInt();
        }
      
        int largest=0;
        for(int t=0;t<10;t++){
            if(largest<arr[t]){
                largest=arr[t];
            }
        }
        System.out.println("The largest element is "+largest);
    }
}

// OUTPUT

// Enter the 10 elements
// Enter the element 1
// 5
// Enter the element 2
// 6
// Enter the element 3
// 2
// Enter the element 4
// 3
// Enter the element 5
// 5
// Enter the element 6
// 4
// Enter the element 7
// 5
// Enter the element 8
// 6
// Enter the element 9
// 1
// Enter the element 10
// 2
// The largest element is 6
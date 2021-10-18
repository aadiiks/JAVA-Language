import java.util.Scanner;
public class Array_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter the Element " + (i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("\nThe Elements are: ");
        for(int j=0; j<n; j++){
            System.out.println(arr[j]);
        }
    }
}

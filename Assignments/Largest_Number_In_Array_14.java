import java.util.Scanner;

public class Largest_Number_In_Array_14 {
    public static void main(String[] args) {
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

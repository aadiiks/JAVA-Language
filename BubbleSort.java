import java.util.Scanner;
class BubbleSort{
  public static void main(String []args) {
    int num, i, j, temp;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of integers to sort:");
    num = input.nextInt(); //num=5 --> Size of array
    int array[] = new int[num]; //array[5] -> 0 1 2 3 4
    System.out.println("Enter " + num + " integers: ");
    for (i = 0; i < num; i++){
      array[i] = input.nextInt(); //array[0]-10, [1]-20, [2]-30, [3]-40, [4]-50
	}
    for (i = 0; i < ( num - 1 ); i++) { //0<4, 1<4, 2<4
      for (j = 0; j < num - i - 1; j++) { //0<4, 1<4, 2<4, 3<4, 4<4
        if (array[j] > array[j+1]) //array[0]>array[1]
        {
           temp = array[j]; //temp=20
           array[j] = array[j+1]; //array[0]=array[1]
           array[j+1] = temp; //array[1]=20
        }
      }
    }
    System.out.println("Sorted list of integers:");
    for (i = 0; i < num; i++)
	{
      System.out.println(array[i]);
	}
  }
}

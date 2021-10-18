// WAP to print your name in the following patterm.

// A
// A D
// A D I
// A D I T
// A D I T Y A

public class Pattern_Name_1{
    public static void main(String args[]){
        String name = "ADITYA";
        for(int i = 0; i <= 5; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(name.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}
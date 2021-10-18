// WAP to print multiplication table in the following pattern.
// 2 x 1 = 2
// 2 x 2 = 4

public class Table {
    public static void main(String args[]) {
        int n = 2;
        int i = 1;
        while(i<=10){
            System.out.println(n + " x " + i + " = " + (n*i));
            i++;
        }
    }
}

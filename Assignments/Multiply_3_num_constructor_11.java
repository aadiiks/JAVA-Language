// 11) Write a Java Program to multiply 3 numbers using an argument constructor.

public class Multiply_3_num_constructor_11 {
    
    int x;
    int y;
    int z;
    Multiply_3_num_constructor_11(int a,int b,int c){
        // this.x = x;
        // this.y = y;
        // this.z = z;
        x=a;
        y=b;
        z=c;
    
    
    }

     void show(){
         System.out.println("The Product is " + x*y*z);
     }

    public static void main(String[] args) {
        Multiply_3_num_constructor_11 multiply = new Multiply_3_num_constructor_11(1,2,3); 
        multiply.show();   
    }    
}
// 11) Write a Java Program to multipy 3 numbers using an argument constructor.

public class _11_Multiply_3_Num_Constructor {
    
    int x;
    int y;
    int z;
    _11_Multiply_3_Num_Constructor(int a,int b,int c){
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

    public static void main(String args[]) {
        _11_Multiply_3_Num_Constructor multiply = new _11_Multiply_3_Num_Constructor(1,2,3); 
        multiply.show();   
    }    
}


// OUTPUT

// The Product is 6
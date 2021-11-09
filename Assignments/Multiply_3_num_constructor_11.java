
public class Multiply_3_Num_Constructor_11 {
    
    int x;
    int y;
    int z;
    Multiply_3_Num_Constructor_11(int a,int b,int c){
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
        Multiply_3_Num_Constructor_11 multiply = new Multiply_3_Num_Constructor_11(1,2,3); 
        multiply.show();   
    }    
}
// 12.1) Write a Java Program to implement method overloading i) by changing the number of arguments and ii) by changing the data type of arguments.

public class _12_1_Method_Overloading_Change_no_args {
    public static void main(String args[]) {
        add add1=new add();
        int a=10;
        int b=20;
        int c=30;
        int d=40;
        
        int x=add1.addition(a, b, c);
        int y=add1.addition(a,b,c,d);
         System.out.println("Val of X = "+x+" Val of Y = "+y);
    }   
}
class add{
   
    int addition(int a,int b,int c){
        return a+b+c;
    }
    int  addition(int a,int b,int c,int d){
        return a+b+c+d;
    }
    
}

// OUTPUT

// Val of X = 60 Val of Y = 100